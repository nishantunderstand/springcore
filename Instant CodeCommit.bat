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

REM === Dynamically detect and open the current GitHub project ===
for /f "tokens=* delims=" %%r in ('"%gitPath%" remote get-url origin 2^>nul') do set "remoteUrl=%%r"

if not "%remoteUrl%"=="" (
    REM Convert SSH or HTTPS URL to clean HTTPS format
    set "webUrl=%remoteUrl%"
    set "webUrl=%webUrl:git@github.com:=%"
    set "webUrl=%webUrl:https://github.com/=%"
    set "webUrl=https://github.com/%webUrl%"
    set "webUrl=%webUrl:.git=%"

    echo Opening GitHub repo page: %webUrl%
    start "" /max "C:\Program Files\Google\Chrome\Application\chrome.exe" "%webUrl%"
) else (
    echo No GitHub remote found. Skipping browser open.
)

echo ==== End ====
exit
