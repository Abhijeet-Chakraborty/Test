import java.util.List;

public class Main {
    public static void main(String[] args) {
        var list = List.of("Ram", "Shyam", "Mohan", "Ravi");
        var lists = List.of("");
        System.out.println(list.stream().findFirst().get());
        System.out.println("First element Using reduce --> " + list.stream().reduce((f, s) -> s));
        System.out.println("Last element Using skip --> " + list.stream().skip(list.size() - 1).findFirst());
    }
}




