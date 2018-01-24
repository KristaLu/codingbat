package functional;

import java.util.ArrayList;
import java.util.List;

public class Functional1 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(2);
        list1.add(33);
        list1.add(4);

        List<String> list2 = new ArrayList<>();
        list2.add("xa");
        list2.add("BBb");
        list2.add("cCxc");
        list2.add("xx");

//        System.out.println(doubling(list1));
//        System.out.println(square(list1));
//        System.out.println(addStar(list2));
//        System.out.println(copies3(list2));
//        System.out.println(moreY(list2));
//        System.out.println(math1(list1));
//        System.out.println(rightDigit(list1));
//        System.out.println(lower(list2));
//        System.out.println(noX(list2));

    }

    private static List<String> noX(List<String> strings) {
        strings.replaceAll(n->n.replaceAll("x",""));
        return strings;
    }

    private static List<String> lower(List<String> strings) {
        strings.replaceAll(n->n.toLowerCase());
        return strings;
    }

    private static List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n->n%10);
        return nums;
    }

    private static List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n->(n+1)*10);
        return nums;
    }

    private static List<String> moreY(List<String> strings) {
        strings.replaceAll(n->"y"+n+"y");
        return strings;
    }

    private static List<String> copies3(List<String> strings) {
        strings.replaceAll(n->n+n+n);
        return strings;
    }

    private static List<String> addStar(List<String> strings) {
        strings.replaceAll(n->n+"*");
        return strings;
    }

    private static List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n->n*n);
        return nums;
    }

    private static List<Integer> doubling(List<Integer> nums) {
        List<Integer> list = new ArrayList<>();
        for(Integer i:nums){
            list.add(i*2);
        }
        return list;
    }
}
