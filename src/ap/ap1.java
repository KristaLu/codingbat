package ap;

import java.util.*;

public class ap1 {
    public static void main(String[] args) {

        int[] mas1 = {50, 3, 60, 7, 20};
        int[] mas4 = {2, 20, 30};
        String[] mas2 = {"a", "a", "b", "b", "c"};
        String[] mas3 = {"a", "b", "c"};

//        System.out.println(scoresIncreasing(mas1));
//        System.out.println(scores100(mas1));
//        System.out.println(scoresClump(mas1));
//        System.out.println(scoresAverage(mas1));
//        System.out.println(wordsCount(mas2,4));
//        System.out.println(wordsFront(mas2,2));
//        System.out.println(wordsWithoutList(mas2,2));
//        System.out.println(hasOne(10));
//        System.out.println(dividesSelf (13));
//        System.out.println(copyEvens(mas1,2));
//        System.out.println(copyEndy(mas1,4));
//        System.out.println(wordsWithout(mas2,"d"));
//        System.out.println(scoresSpecial(mas1,mas4));
//        System.out.println(sumHeights(mas1,2,4));
//        System.out.println(sumHeights2(mas1,2,4));
//        System.out.println(bigHeights(mas1,2,4));
//        System.out.println(userCompare("bb",1,"zz",2));
//        System.out.println(mergeTwo(mas2,mas3, 4));
        System.out.println(commonTwo(mas3,mas2));

    }

    private static int commonTwo(String[] a, String[] b) {
        int count = 0;
        String tmp = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j]) && !tmp.contains(b[j])) {
                    tmp+=b[j];
                    count++;
                }
            }
        }
        return count;
    }

    private static String[] mergeTwo(String[] a, String[] b, int n) {

        Set<String> set = new HashSet<>();
        Collections.addAll(set,a);
        Collections.addAll(set,b);

        String[] tmp = new String[n];
        Iterator it = set.iterator();
        for (int i = 0; i < n; i++) {
            tmp[i]= (String)it.next();
        }

        return tmp;
    }

    private static int userCompare(String aName, int aId, String bName, int bId) {
        int res = 0;

        if (aName.compareTo(bName)<0)
            res=-1;
        if (aName.compareTo(bName)==0){
            res=0;
            if (aId<bId)
                res=-1;
            if (aId>bId)
                res=1;
        }
        if (aName.compareTo(bName)>0)
            res=1;
        return res;
    }

    private static int bigHeights(int[] heights, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (Math.abs(heights[i+1]-heights[i])>=5)
                count++;
        }
        return count;
    }

    private static int sumHeights2(int[] heights, int start, int end) {
        List<Integer> tmp = new ArrayList<>();
        for (int i = start; i < end; i++) {
            if ((heights[i+1]-heights[i])>0)
                tmp.add((heights[i+1]-heights[i])*2);
            else tmp.add(Math.abs(heights[i+1]-heights[i]));
        }

        int sum = 0;
        for (int i = 0; i < tmp.size(); i++) {
            sum+=tmp.get(i);
        }
        return sum;
    }

    private static int sumHeights(int[] heights, int start, int end) {

        List<Integer> tmp = new ArrayList<>();
        for (int i = start; i < end; i++) {
            tmp.add(Math.abs(heights[i]-heights[i+1]));
        }

        int sum = 0;
        for (int i = 0; i < tmp.size(); i++) {
            sum+=tmp.get(i);
        }
        return sum;
    }

    private static int scoresSpecial(int[] a, int[] b) {
        int s1 = findMax(a);
        int s2 = findMax(b);
        return s1+s2;
    }

    private static int findMax(int[] mas) {
        int res = 0;
        if (mas.length>0) {
            for (int i = 0; i < mas.length; i++) {
                if (res % 10 != 0) {
                    res = 0;
                }
                if (mas[i]%10==0 && mas[i]>res)
                    res=mas[i];
            }
        }
        return res;
    }

    private static String[] wordsWithout(String[] words, String target) {
        List<String> tmp = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target))
                tmp.add(words[i]);
        }
        String[] res = new String[tmp.size()];
        for (int i = 0; i < res.length; i++) {
            res[i]=tmp.get(i);
        }
        return res;
    }

    private static int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length; i++) {
            if (answers[i].equals("?"))
                score+=0;
            else if (key[i].equals(answers[i]))
                score+=4;
            else if (!key[i].equals(answers[i]))
                score-=1;
        }
        return score;
    }

    private static int matchUp(String[] a, String[] b) {
        int count=0;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals("") && !b[i].equals("") && a[i].charAt(0)==b[i].charAt(0))
                count++;
        }
        return count;
    }

    private static int[] copyEndy(int[] nums, int count) {
        List<Integer> list = new ArrayList<>();
        int[] tmp = new int[count];

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i]>=0 && nums[i]<=10) || (nums[i]>=90 && nums[i]<=100)) {
                list.add(nums[i]);
            }
        }

        for (int i = 0; i < count; i++) {
            tmp[i]=list.get(i);
        }
        return tmp;
    }

    private static int[] copyEvens(int[] nums, int count) {
        List<Integer> list = new ArrayList<>();
        int[] tmp = new int[count];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                list.add(nums[i]);
            }
        }

        for (int i = 0; i < count; i++) {
            tmp[i]=list.get(i);
        }
        return tmp;
    }

    private static boolean dividesSelf(int n) {

        int tmp = n;
        while (tmp>0){
            if (tmp%10==0)
                return false;

            if (n%(tmp%10)!=0)
                return false;
            tmp=tmp/10;
        }
        return true;
    }

    private static boolean hasOne(int n) {
        if (n%10==1)
            return true;

        while (n>0){
            n=n/10;
            if (n%10==1)
                return true;
        }
        return false;
    }

    private static List wordsWithoutList(String[] words, int len) {
        List<String> tmp = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length()!=len)
                tmp.add(words[i]);
        }
        return tmp;
    }

    private static String[] wordsFront(String[] words, int n) {
        String[] tmp = new String[n];
        for (int i = 0; i < n; i++) {
            tmp[i]=words[i];
        }
        return tmp;
    }

    private static int wordsCount(String[] words, int len) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length()==len)
                count++;
        }
        return count;
    }

    private static int scoresAverage(int[] scores) {
        int first = average(scores, 0, scores.length/2);
        int second = average(scores, scores.length/2, scores.length);

        return Math.max(first,second);
    }

    private static int average(int[] scores, int start, int end) {
        int n = 0;
        for (int i = start; i < end; i++) {
            n+=scores[i];
        }
        return n/(end-start);
    }

    private static boolean scoresClump(int[] scores) {
        for (int i = 1; i < scores.length-1; i++) {
            if (Math.abs(scores[i]-scores[i-1])<=2 && Math.abs(scores[i-1]-scores[i+1])<=2)
                return true;
        }
        return false;
    }

    private static boolean scores100(int[] scores) {

        for (int i = 1; i < scores.length; i++) {
            if (scores[i-1]==100 && scores[i-1]==scores[i])
                return true;
        }
        return false;
    }

    private static boolean scoresIncreasing(int[] scores) {

        int n=scores.length-1;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i-1]<=scores[i])
                n--;
            else n++;
        }
        if (n==0)
            return true;

        return false;
    }
}
