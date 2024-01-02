package SE.fundamentals.exercises.Hello_world;

public class Greeter {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.getGreeting());
    }

    String getGreeting() {
        return "Hello, World!";
    }
}
