import java.util.List;

public class Lamda {
    public static void apply (Greetings greetings, String name)
    {
        greetings.hello(name);
    }

    public static void main(String[] args) {
        // anonymous 
        Greetings hi = (n) -> {
            System.out.printf("Hello %s", n);
        };

        hi.hello("batman");

        List names = List.of("Fred", "Barney", "Betty", "Wilma");
        System.out
    }
    
}
