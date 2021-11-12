import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Cat testBean1 = context.getBean("testBean", Cat.class);
        System.out.println(testBean1.getName());

        Cat testBean2 = context.getBean("testBean", Cat.class);
        System.out.println(testBean2.getName());

        System.out.println(testBean1 == testBean2);
        context.close();

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("hello_world");
        System.out.println(bean1.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("hello_world");
        bean2.doMyDestroy();
        System.out.println(bean2.getMessage());

        Cat bean3 = (Cat) applicationContext.getBean("bald_cat");
        System.out.println(bean3.getName());

        Cat bean4 = (Cat) applicationContext.getBean("bald_cat");
        System.out.println(bean4.getName());
        bean4.doMyDestroy();

        System.out.println(bean1.equals(bean2));
        System.out.println(bean3.equals(bean4));
    }
}