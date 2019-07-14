package demo;

public class App {
    public String getGreeting() {
        return "This is a Gradle Project";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
