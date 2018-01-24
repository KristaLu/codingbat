package recursion;

public class Recursion1 {
    public static void main(String[] args) {

//        System.out.println(factorial(4));
//        System.out.println(bunnyEars(4));
//        System.out.println(fibonacci(5));
//        System.out.println(bunnyEars2(2));
//        System.out.println(triangle(3));
//        System.out.println(sumDigits(143));
//        System.out.println(count7(1773));
//        System.out.println(count8(18838));
//        System.out.println(powerN(2,3));
//        System.out.println(countX("xxhixx"));
//        System.out.println(countHi("hixhixhixxhci"));
//        System.out.println(changeXY("xxhixx"));
//        System.out.println(changePi("p"));
//        System.out.println(noX("pxcx"));
//        System.out.println(array6(new int[] {1,4}, 0));
//        System.out.println(array11(new int[] {11,4,1,11}, 0));
//        System.out.println(array220(new int[] {11,4,1,10}, 0));
//        System.out.println(allStar("pxcx"));
//        System.out.println(pairStar("pxxcx"));
//        System.out.println(endX("pxxcx"));
//        System.out.println(countPairs("pxcxcx"));
//        System.out.println(countAbc("abc"));
//        System.out.println(count11("1a11b111c"));
//        System.out.println(stringClean("xxxyz"));
//        System.out.println(countHi2("hixhhi"));
//        System.out.println(parenBit("hi(xhhi)fff"));
//        System.out.println(nestParen("(())"));
//        System.out.println(strCount("catcowcat", "cat"));
//        System.out.println(strCopies("iiijjj", "ii", 2));
        System.out.println(strDist("catcowcat", "cat"));

    }

    private static int strDist(String str, String sub) {
        if (str.length()<sub.length())
            return 0;
        if (!str.startsWith(sub))
        return strDist(str.substring(1),sub);
        if (!str.endsWith(sub))
            return strDist(str.substring(0,str.length()-1),sub);

        return str.length();
    }

    private static boolean strCopies(String str, String sub, int n) {
        if (str.length()<sub.length() && n>0)
            return false;
        if (n==0)
            return true;
        if (str.startsWith(sub))
            return strCopies(str.substring(1),sub,--n);

        return strCopies(str.substring(1),sub,n);
    }

    private static int strCount(String str, String sub) {
        int count = 0;
        if (str.length()<sub.length())
            return count;
        if (str.startsWith(sub)) {
            count++;
            return count + strCount(str.substring(sub.length()),sub);
        }

        return count+strCount(str.substring(1), sub);
    }

    private static boolean nestParen(String str) {
        if (str.length()==0)
            return true;
        if (str.length()%2!=0)
            return false;
        if (str.charAt(0)=='(' && str.charAt(str.length()-1)==')')
            return nestParen(str.substring(1,str.length()-1));

        return false;
    }

    private static String parenBit(String str) {
        if (str.length()<2)
            return str;
        if (str.charAt(0)!='(')
            return parenBit(str.substring(1));
        if (str.charAt(str.length()-1)!=')')
            return parenBit(str.substring(0,str.length()-1));

        return str;
    }

    private static int countHi2(String str) {
        int count=0;
        if (str.length()<2)
            return count;
        if (str.startsWith("xhi"))
            return count+countHi2(str.substring(3));
        if (str.startsWith("hi")) {
            count++;
            return count+countHi2(str.substring(2));
        }

        return count+countHi2(str.substring(1));
    }

    private static String stringClean(String str) {
        if (str.length()<2)
            return str;
        if (str.charAt(0)==str.charAt(1))
            return ""+stringClean(str.substring(1));

        return str.charAt(0)+stringClean(str.substring(1));
    }

    private static int count11(String str) {
        int count=0;
        if (str.length()<2)
            return count;
        if (str.startsWith("11")) {
            count++;
            return count+count11(str.substring(2));
        }

        return count+count11(str.substring(1));
    }

    private static int countAbc(String str) {
        int count=0;
        if (str.length()<3)
            return count;
        if (str.startsWith("abc") || str.startsWith("aba"))
            count++;

        return count+countAbc(str.substring(1));
    }

    private static int countPairs(String str) {
        int count=0;
        if (str.length()<3)
            return count;
        if (str.charAt(0)==str.charAt(2))
            count++;

        return count+countPairs(str.substring(1));
    }

    private static String endX(String str) {
        if (str.length()==0)
            return str;

        if (str.charAt(0)=='x')
            return endX(str.substring(1))+str.charAt(0);

        return str.charAt(0)+endX(str.substring(1));
    }

    private static String pairStar(String str) {
        if (str.length()<2)
            return str;

        if (str.charAt(0)==str.charAt(1))
            return str.charAt(0)+"*"+pairStar(str.substring(1));

        return str.charAt(0)+pairStar(str.substring(1));
    }

    private static String allStar(String str) {
        if (str.length()<2)
            return str;

        return str.charAt(0)+"*"+allStar(str.substring(1));
    }

    private static boolean array220(int[] nums, int index) {
        if (nums.length<2 || nums.length==index+1)
            return false;
        if (nums[index]*10==nums[index+1])
            return true;
        return array220(nums,index+1);
    }

    private static int array11(int[] nums, int index) {
        int count=0;
        if (nums.length==0 || nums.length==index)
            return count;
        if (nums[index]==11)
            count++;
        return count+array11(nums,index+1);
    }

    private static boolean array6(int[] nums, int index) {
        if (nums.length==0 || nums.length==index)
            return false;
        if (nums[index]==6)
            return true;
        return array6(nums,index+1);
    }

    private static String noX(String str) {
        if (str.length()==0)
            return str;
        if (str.charAt(0)=='x')
            return ""+noX(str.substring(1));

        return str.charAt(0)+noX(str.substring(1));
    }

    private static String changePi(String str) {

        if (str.length()==0)
            return str;
        if (str.startsWith("pi"))
            return "3.14" + changePi(str.substring(2));

        return str.charAt(0)+changePi(str.substring(1));
    }

    private static String changeXY(String str) {
        if (str.length()==0)
            return str;
        if (str.charAt(0)=='x')
            return "y"+changeXY(str.substring(1));

        return str.charAt(0)+changeXY(str.substring(1));
    }

    private static int countHi(String str) {
        int count=0;
        if (str.length()<2)
            return count;
        if (str.charAt(str.length()-1)=='i' && str.charAt(str.length()-2)=='h')
            count++;

        return count+countHi(str.substring(0,str.length()-1));
    }

    private static int countX(String str) {
        int count=0;
        if (str.length()==0)
            return count;
        if (str.charAt(str.length()-1)=='x')
            count++;

        return count+countX(str.substring(0,str.length()-1));
    }

    private static int powerN(int base, int n) {
        if (n==0)
            return 1;
        if (n==1)
            return base;
        return base*powerN(base,n-1);
    }

    private static int count8(int n) {
        int count=0;
        if (n%10==8 && (n/10)%10==8)
            count++;
        if (n%10==8)
            count++;
        if (n/10==0)
            return count;

        return count+count8(n/10);
    }

    private static int count7(int n) {
        int count=0;
        if (n%10==7)
            count++;
        if (n/10==0)
            return count;

        return count+count7(n/10);
    }

    private static int sumDigits(int n) {
        if (n<10)
            return n;
        return sumDigits(n/10)+n%10;
    }

    private static int triangle(int rows) {
        if (rows==0)
            return 0;
        if (rows==1)
            return 1;
        return triangle(rows-1)+(rows-1)+1;
    }

    private static int bunnyEars2(int bunnies) {
        if (bunnies<=0)
            return 0;
        if (bunnies%2==1)
            return 2+bunnyEars2(bunnies-1);
        return 3+bunnyEars2(bunnies-1);
    }

    private static int fibonacci(int n) {
        if (n==0)
            return 0;
        if (n<3)
            return 1;

        return fibonacci(n-1)+fibonacci(n-2);
    }

    private static int bunnyEars(int bunnies) {
        if (bunnies<=0)
            return 0;
        return 2+bunnyEars(bunnies-1);
    }

    private static int factorial(int n) {
        if (n<=1)
            return 1;
        return n*factorial(n-1);
    }
}
