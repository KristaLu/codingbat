package functional;

import java.util.ArrayList;
import java.util.List;

public class Functional2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(2);
        list1.add(13);
        list1.add(4);

        List<String> list2 = new ArrayList<>();
        list2.add("xa");
        list2.add("BBb");
        list2.add("cCxcy");
        list2.add("xx");

//        System.out.println(noNeg(list1));
//        System.out.println(no9(list1));
//        System.out.println(noTeen(list1));
//        System.out.println(noLong(list2));
//        System.out.println(noZ(list2));
//        System.out.println(no34(list2));
//        System.out.println(noYY(list2));
//        System.out.println(two2(list1));
        System.out.println(square56(list1));
    }

    private static List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(n->n*n+10);
        nums.removeIf(n->n%10==5 || n%10==6);
        return nums;
    }
    private static List<Integer> two2(List<Integer> nums) {
        nums.replaceAll(n->n*2);
        nums.removeIf(n->n%10==2);
        return nums;
    }
    private static List<String> noYY(List<String> strings) {
        strings.replaceAll(n->n+"y");
        strings.removeIf(n->n.contains("yy"));
        return strings;
    }
    private static List<String> no34(List<String> strings) {
        strings.removeIf(n->n.length()>2 && n.length()<5);
        return strings;
    }
    private static List<String> noZ(List<String> strings) {
        strings.removeIf(n->n.contains("z"));
        return strings;
    }
    private static List<String> noLong(List<String> strings) {
        strings.removeIf(n->n.length()>3);
        return strings;
    }
    private static List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n->n>12 && n <20);
        return nums;
    }
    private static List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n->n%10==9);
        return nums;
    }
    private static List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n->n<0);
        return nums;
    }
}
