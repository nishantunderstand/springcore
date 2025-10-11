@echo off
echo ==== Begin Git Auto Push ====

REM Get the directory where the batch file is located
set "repoLocation=%~dp0"

REM Git executable path
set "gitPath=C:\Program Files\Git\cmd\git.exe"

REM Change to repo directory
cd /d "%repoLocation%"

REM Initialize Git repo if not already present
if not exist "%repoLocation%\.git" (
    echo Initializing new Git repository...
    "%gitPath%" init
)

REM Pull latest changes (optional)
"%gitPath%" pull

REM Add all files
"%gitPath%" add .

REM Create commit message with timestamp
set "commitMessage=LenovoBat %date% %time%"

REM Commit changes
"%gitPath%" commit -m "%commitMessage%"

REM Push to remote
"%gitPath%" push

REM === Detect and open current GitHub repo ===
for /f "tokens=* delims=" %%r in ('"%gitPath%" remote get-url origin 2^>nul') do set "remoteUrl=%%r"

if not "%remoteUrl%"=="" (
    set "url=%remoteUrl%"
    
    REM Handle SSH format: git@github.com:USER/REPO.git
    echo %url% | find "git@" >nul
    if %errorlevel%==0 (
        set "url=%url:git@github.com:=%"
        set "url=https://github.com/%url%"
    )

    REM Handle HTTPS format: https://github.com/USER/REPO.git
    echo %url% | find "https://github.com/" >nul
    if %errorlevel%==0 (
        set "url=%url%"
    )

    REM Remove .git if present
    set "url=%url:.git=%"

    echo Opening GitHub repo: %url%
    start "" /max "C:\Program Files\Google\Chrome\Application\chrome.exe" "%url%"
) else (
    echo No GitHub remote found. Skipping browser open.
)

echo ==== End ====
exit
