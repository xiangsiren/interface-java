package log;
import aspect.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ren {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aspe.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
//        student.getAge();
//        student.printThrowException();
    }
}