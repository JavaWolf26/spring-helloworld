import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Scope("singleton")
    @Bean(name = "hello_world", destroyMethod = "doMyDestroy")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Scope("prototype")
    @Bean(name = "bald_cat", initMethod = "doMyInit", destroyMethod = "doMyDestroy")
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setName("Boss");
        return cat;
    }
}