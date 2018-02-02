package warmup;

public class Warmup2 {
    public static void main(String[] args) {

//        System.out.println(frontTimes("ssddghhh", 2));
//        System.out.println(stringTimes("slribnb", 5));
//        System.out.println(countXX("cxxxx"));
//        System.out.println(doubleX("aaaax"));
        System.out.println(stringBits("Hello"));
//        System.out.println(stringSplosion("Code"));
//        System.out.println(last2("axxxaaxx"));
//        System.out.println(arrayCount9(new int[]{1,2,9,9}));
//        System.out.println(arrayFront9(new int[]{1,9}));
//        System.out.println(array123(new int[]{1,1,2,3,9}));
//        System.out.println(stringMatch("aaxxaaxx","iaxxai"));
//        System.out.println(stringX("xxHxix"));
//        System.out.println(altPairs("Cho"));
//        System.out.println(stringYak("yak123ya"));
//        System.out.println(array667(new int[]{6,7,2,6,6}));
//        System.out.println(noTriples(new int[]{6,6,6,7,2,6,6}));
//        System.out.println(has271(new int[]{2, 7, 4}));




    }

    private static boolean has271(int[] nums) {
        for (int i = 1; i < nums.length-1; i++) {
            int x = Math.abs(nums[i-1]-1);
            int y = Math.abs(x-nums[i+1]);
            if (nums[i-1]==(nums[i]-5) && y<3)
                return true;
        }
        return false;
    }

    private static boolean noTriples(int[] nums) {
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i]==nums[i-1] && nums[i]==nums[i+1])
                return false;
        }
        return true;
    }

    private static int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==6 && nums[i+1]==6 || nums[i+1]==7)
                count++;
        }
        return count;
    }

    private static String stringYak(String str) {
        return str.replaceAll("[y][a-z]{1}[k]", "");
    }

    private static String altPairs(String str) {
        if (str.length()<2)
            return str;
        String tmp="";
        for (int i = 1; i < str.length(); i+=4) {
            String istr = str.substring(i-1,i+1);
            tmp+=istr;
        }
        if (str.length()>3 && str.length()%2==1)
            tmp+=str.substring(str.length()-1);
        return tmp;
    }

    private static String stringX(String str) {
        if (str.length()==0 || str.equals("x") || str.equals("xx"))
            return str;
        String tmp = str.replaceAll("x","");
        if (str.charAt(0)=='x')
            tmp="x"+tmp;
        if (str.charAt(str.length()-1)=='x')
            tmp+="x";
        return tmp;
    }

    private static int stringMatch(String a, String b) {
        int count=0;
        for (int i = 0; i < Math.min(a.length(),b.length())-1; i++) {
                if (a.substring(i,i+2).equals(b.substring(i,i+2)))
                    count++;
        }
        return count;
    }

    private static boolean array123(int[] nums) {
        if (nums.length>2) {
            for (int i = 2; i < nums.length; i++) {
                if (nums[i - 2] == 1 && nums[i - 1] == 2 && nums[i] == 3)
                    return true;
            }
        }
        return false;
    }

    private static boolean arrayFront9(int[] nums) {
        if (nums.length<4){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]==9)
                    return true;
            }
        }
        else {
            for (int i = 0; i < 4; i++) {
                if (nums[i] == 9)
                    return true;
            }
        }
        return false;
    }

    private static int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==9)
                count++;
        }
        return count;
    }

    private static int last2(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i,i+2).equals(str.substring(str.length()-2)))
                count++;
        }
        return count;
    }

    private static String stringSplosion(String str) {
        String tmp = "";
        for (int i = 1; i < str.length(); i++) {
            tmp+=str.substring(0,i);
        }
        return tmp+str;
    }

    private static Object stringBits(String str) {
        String tmp = "";

        if (str.length()>1) {
            for (int i = 1; i < str.length(); i+=2) {
                tmp+=str.charAt(i-1);
            }
        }
        if (str.length()%2==1)
            tmp+=str.charAt(str.length()-1);
        return tmp;
    }

    private static boolean doubleX(String str) {
        int x = str.indexOf('x');
        if (x<str.length()-1 && str.charAt(x+1)=='x')
            return true;
        return false;
    }

    private static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i,i+2).equals("xx"))
                count++;
        }
        return count;
    }

    private static String frontTimes(String str, int n) {
        String tmp = "";
        if(str.length()<3){
            for (int i = 0; i < n; i++) {
                tmp += str;
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                tmp += str.substring(0, 3);
            }
        }
        return tmp;
    }

    private static String stringTimes(String str, int n) {
        String tmp = "";
        for (int i = 0; i < n; i++) {
            tmp+=str;
        }
        return tmp;
    }
}
