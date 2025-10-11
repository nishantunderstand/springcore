package _toc;

import springcore.a_core.Student;
import springcore.a_core.Test;
import springcore.autowire.annotation.Address;
import springcore.autowire.annotation.Emp;
import springcore.ci.Certi;
import springcore.ci.ambiguityProblem.Addition;
import springcore.javaconfig.DemoMain;
import springcore.javaconfig.JavaConfig;
import springcore.lifecycle.ByAnnotation.Example;
import springcore.lifecycle.ByAnnotation.NewTest;
import springcore.lifecycle.ByBean.Pepsi;
import springcore.lifecycle.ByBean.Samosa;
import springcore.ref.A;
import springcore.ref.B;
import springcore.spel.Demo;
import springcore.standalone.collections.Person;

/**
 * === Spring Project Table of Contents ===
 *
 * <h2>1. Spring Core</h2>
 * <ul>
 * <li>{@link Student}</li>
 * <li>{@link com.springcore.SpringCoreTestMay28}</li>
 * <li>{@link Test}</li>
 * </ul>
 *
 * <h2>2. Spring Dependency Injection by Constructor</h2>
 * <ul>
 * <li>{@link Certi}</li>
 * <li>{@link springcore.ci.Person}</li>
 * <li>{@link springcore.ci.Test}</li>
 * </ul>
 *
 * <h2>3. Constructor Injection - Ambiguity Problem</h2>
 * <ul>
 * <li>{@link Addition}</li>
 * <li>{@link springcore.ci.ambiguityProblem.Test}</li>
 * </ul>
 *
 * <h2>4. Autowiring</h2>
 * <ul>
 * <li>{@link springcore.autowire.Address}</li>
 * <li>{@link springcore.autowire.Emp}</li>
 * <li>{@link springcore.autowire.Test}</li>
 * <li>{@link Address}</li>
 * <li>{@link Emp}</li>
 * <li>{@link springcore.autowire.annotation.Test}</li>
 * </ul>
 *
 * <h2>5. Collections</h2>
 * <ul>
 * <li>{@link springcore.collections.Emp}</li>
 * <li>{@link springcore.collections.Test}</li>
 * </ul>
 *
 * <h2>6. Java-based Configuration</h2>
 * <ul>
 * <li>{@link springcore.javaconfig.Samosa}</li>
 * <li>{@link springcore.javaconfig.Student}</li>
 * <li>{@link JavaConfig}</li>
 * <li>{@link DemoMain}</li>
 * </ul>
 *
 * <h2>7. Bean Lifecycle</h2>
 * <ul>
 * <li>{@link Example}</li>
 * <li>{@link NewTest}</li>
 * <li>{@link Samosa}</li>
 * <li>{@link Pepsi}</li>
 * <li>{@link springcore.lifecycle.ByBean.Test}</li>
 * <li>{@link springcore.lifecycle3.Example}</li>
 * <li>{@link springcore.lifecycle3.NewTest}</li>
 * </ul>
 *
 * <h2>8. Reference Injection</h2>
 * <ul>
 * <li>{@link A}</li>
 * <li>{@link B}</li>
 * <li>{@link springcore.ref.Test}</li>
 * </ul>
 *
 * <h2>9. SpEL (Spring Expression Language)</h2>
 * <ul>
 * <li>{@link Demo}</li>
 * <li>{@link springcore.spel.Test}</li>
 * </ul>
 *
 * <h2>10. Standalone Collections</h2>
 * <ul>
 * <li>{@link Person}</li>
 * <li>{@link springcore.standalone.collections.Test}</li>
 * </ul>
 *
 * <h2>11. Stereotype Annotations</h2>
 * <ul>
 * <li>{@link springcore.sterotype.Student}</li>
 * <li>{@link springcore.sterotype.Test}</li>
 * </ul>
 *
 * <h2>12. XML to Java Object (JAXB)</h2>
 * <ul>
 * <li>{@link java2xsd.Student}</li>
 * <li>{@link java2xsd.Employee}</li>
 * <li>{@link java2xsd.Department}</li>
 * <li>{@link java2xsd.ObjectFactory}</li>
 * </ul>
 *
 * <h2>13. Java Schema (XSD)</h2>
 * <ul>
 * <li>{@link java_Schema.Student}</li>
 * <li>{@link java_Schema.ObjectFactory}</li>
 * </ul>
 *
 * <p>
 * <strong>Tip:</strong> In IntelliJ IDEA or Eclipse, use Ctrl+Click (or
 * Cmd+Click on macOS) on any link to navigate directly to the class.
 * </p>
 */
public class TOC {
    public static void main(String[] args) {
        System.out.println("=== Spring Project TOC Loaded ===");
    }
}
