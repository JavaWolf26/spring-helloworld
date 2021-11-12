import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void doMyDestroy() {
        System.out.println("Bye");
    }
}