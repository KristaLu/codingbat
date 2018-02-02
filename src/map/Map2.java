package map;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("a", "candy");
        map.put("b", "dirt");

        String[] mas1 = {"ab", "ac", "dc", "ad"};
        String[] mas2 = {"a", "c", "d", "a"};

//        System.out.println(word0(mas1));
//        System.out.println(wordLen(mas1));
//        System.out.println(pars(mas1));
//        System.out.println(wordCount(mas1));
//        System.out.println(firstChar(mas1));

        System.out.println(wordAppend(mas2));

//        System.out.println(wordMultiple(mas1));
//        System.out.println(allSwap(mas1));
//        System.out.println(firstSwap(mas1));

    }

    private static String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String ch = strings[i].substring(0,1);
            if (!map.containsKey(ch))
                map.put(ch, i);
            else{
                if (map.get(ch)>=0) {
                    String tmp = strings[i];
                    strings[i] = strings[map.get(ch)];
                    strings[map.get(ch)] = tmp;
                    map.put(ch, -1);
                }
            }
        }
        return strings;
    }

    private static String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String ch = strings[i].substring(0,1);
            if (!map.containsKey(ch))
                map.put(ch, i);
            else{
                String tmp = strings[i];
                strings[i]=strings[map.get(ch)];
                strings[map.get(ch)]=tmp;
                map.remove(ch);
            }
        }
        return strings;
    }

    private static Map<String,Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i]))
                map.put(strings[i], false);
            else map.put(strings[i], true);
        }
        return map;
    }

    private static String wordAppend(String[] strings) {
        String tmp = "";
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                map.merge(strings[i], 1, (x, y) -> x + y);
                if (map.get(strings[i])%2==0)
                    tmp+=strings[i];
            }
            else map.put(strings[i],1);
        }
        return tmp;
    }

    private static Map<String,String> firstChar(String[] strings) {
        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String ch = strings[i].substring(0,1);
            if (!map.containsKey(ch))
                map.put(ch, strings[i]);
            else
                map.put(ch, map.get(ch) + strings[i]);
        }
        return map;
    }

    private static Map<String,Integer> wordCount(String[] strings) {
        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++){
            if (!map.containsKey(strings[i]))
                map.put(strings[i], 1);
            else map.put(strings[i], map.get(strings[i])+1);
        }
        return map;
    }

    private static Map<String,String> pars(String[] strings) {
        Map<String,String> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String f = strings[i].substring(0,1);
            String l = strings[i].substring(strings[i].length()-1);
            map.put(f,l);
        }
        return map;
    }

    private static Map<String,Integer> wordLen(String[] strings) {
        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++)
            map.put(strings[i], strings[i].length());
        return map;
    }

    private static Map<String,Integer> word0(String[] strings) {
        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], 0);
        }
        return map;
    }
}
