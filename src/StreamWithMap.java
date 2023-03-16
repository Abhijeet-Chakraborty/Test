import java.util.Map;
import java.util.stream.Collectors;

public class StreamWithMap {

    public static void main(String[] args) {
        var map = Map.of("1Abhi", "SE", "22Ram", "CE", "Rohan", "ME");
        var collect = map.entrySet().stream().collect(Collectors.toMap(entry -> transformKey(entry.getKey()), Map.Entry::getValue));
        System.out.println(collect);
        System.out.println(collect);
        System.out.println(collect);

    }

    private static String transformKey(String key) {
        return Character.isDigit(key.charAt(0)) ? key.replace(String.valueOf(key.charAt(0)), key.charAt(0)+"_") : key;
    }
}
