import java.util.HashMap;

public class demo {
    public static void main(String[] args) {
        HashMap<String, Double> successJobNumGroupByType = new HashMap<>();

        successJobNumGroupByType.put("a", 1.0);
        successJobNumGroupByType.put("b", 2.0);

        System.out.println(successJobNumGroupByType.get("a"));
        successJobNumGroupByType.put("a", successJobNumGroupByType.get("a") + 2);
        System.out.println(successJobNumGroupByType.get("a"));
        System.out.println(successJobNumGroupByType.containsKey("a"));
        System.out.println(successJobNumGroupByType.containsKey("b"));
        System.out.println(successJobNumGroupByType.containsKey("c"));

        for (String key: successJobNumGroupByType.keySet()
             ) {
            System.out.println(successJobNumGroupByType.get(key));
        }
    }
}
