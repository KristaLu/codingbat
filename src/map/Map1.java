package map;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("a", "candy");
        map.put("b", "dirt");

//        System.out.println(mapBully(map));
//        System.out.println(mapShare(map));
//        System.out.println(mapAB(map));
//        System.out.println(topping1(map));
//        System.out.println(topping2(map));
//        System.out.println(topping3(map));
//        System.out.println(mapAB2(map));
//        System.out.println(mapAB3(map));
//        System.out.println(mapAB4(map));

    }

    private static Map<String,String>  mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")){
            if (map.get("a").length()>map.get("b").length())
                map.put("c", map.get("a"));
            else if (map.get("a").length()<map.get("b").length())
                map.put("c", map.get("b"));
            else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    private static Map<String,String>  mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b"))
            map.put("b", map.get("a"));
        if (map.containsKey("b") && !map.containsKey("a"))
            map.put("a", map.get("b"));
        return map;
    }

    private static Map<String,String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    private static Map<String,String> topping3(Map<String, String> map) {
        if (map.containsKey("potato"))
            map.put("fries", map.get("potato"));
        if (map.containsKey("salad"))
            map.put("spinach", map.get("salad"));

        return map;
    }

    private static Map<String,String>  topping2(Map<String, String> map) {
        if (map.containsKey("ice cream"))
            map.put("yogurt", map.get("ice cream"));
        if (map.containsKey("spinach"))
            map.put("spinach", "nuts");

        return map;
    }

    private static Map<String,String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");

        return map;
    }

    private static Map<String,String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b"))
            map.put("a"+"b", map.get("a")+map.get("b"));
        return map;
    }

    private static Map<String,String> mapShare(Map<String,String> map) {
        if (map.containsKey("a")){
            map.put("b", map.get("a"));
        }
        if (map.containsKey("c"))
            map.remove("c");

        return map;
    }

    private static Map<String,String> mapBully(Map<String,String> map) {
        if (map.containsKey("a")){
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}
