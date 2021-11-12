import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name;

    public Cat() {
    }

    public Cat(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doMyInit() {
        System.out.print("Hello ");
    }

    public void doMyDestroy() {
        System.out.println("Bye");
    }
}
