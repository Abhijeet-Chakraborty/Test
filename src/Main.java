import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var list = List.of("Ram", "Shyam", "Mohan", "Ravi", "Ram");
        //var lists = List.of("");
        System.out.println(list.stream().findFirst().get());
        System.out.println("First element Using reduce --> " + list.stream().reduce((f, s) -> s));
        System.out.println("Last element Using skip --> " + list.stream().skip(list.size() - 1).findFirst());
        System.out.println("Finding duplicate ele-> " + list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1).collect(Collectors.toList()));
    }
}




