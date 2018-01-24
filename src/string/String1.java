package string;

public class String1 {
    public static void main(String[] args) {

        String[] name = {"Bob", "Alice", "X"};
        String[] str = {"x", "xfx", "xabcdefghix"};
        String[] out = {"<<>>", "[[]]", "{{}}"};
        String[] ft = {"hi", "sbb", "b", "ab", "X"};

        String[] sh = {"hi", "b", ""};
        String[] lo = {"Hello", "aaa", "lalala"};

        boolean[] b = {true, false};

        for (int i = 0; i < name.length; i++) {
//            System.out.println(helloName(name[i]));
//            System.out.println(makeAbba(name[i], str[i]));
//            System.out.println(makeOutWord(out[i], str[i]));
//            System.out.println(extraEnd(str[i]));
//            System.out.println(firstTwo(ft[i]));
//            System.out.println(withoutEnd(ft[i]));
//            System.out.println(comboString(sh[i], lo[i]));
//            System.out.println(nonStart(sh[i], lo[i]));
//            System.out.println(left2(ft[i]));
//            System.out.println(right2(ft[i]));

            /*for (int j = 0; j < b.length; j++) {
                System.out.println(theEnd(name[i], b[j]));
            }*/

//            System.out.println(withoutEnd2(ft[i]));
//            System.out.println(endsLy(ft[i]));
//            System.out.println(nTwice(lo[i], 2));
//            System.out.println(makeTags(sh[i], lo[i]));
//            System.out.println(firstHalf(ft[i]));
//            System.out.println(middleTwo(ft[i]));
//            System.out.println(twoChar(ft[i], i));
//            System.out.println(middleThree(ft[i]));
//            System.out.println(hasBad(ft[i]));
//            System.out.println(atFirst(ft[i]));
//            System.out.println(lastChars(str[i],ft[i]));
//            System.out.println(conCat(str[i],ft[i]));
//            System.out.println(lastTwo(str[i]));
//            System.out.println(seeColor(str[i]));
//            System.out.println(frontAgain(str[i]));
//            System.out.println(minCat(str[i],ft[i]));
//            System.out.println(extraFront(str[i]));
//            System.out.println(without2(ft[i]));
//            System.out.println(deFront(str[i]));
//            System.out.println(startWord(str[i], ft[i]));
//            System.out.println(withoutX(str[i]));
            System.out.println(withoutX2(str[i]));





        }
    }

    private static String withoutX2(String str) {

        if (str.length()==0)
            return "";
        if (str.equals("x"))
            return "";

        if (str.charAt(0)=='x') {
            if (str.charAt(1) == 'x')
                return str.substring(2,str.length());
            else
                return str.substring(1,str.length());
        }
        else if (str.charAt(1)=='x')
            return str.charAt(0)+str.substring(2,str.length());

        return str;

    }

    private static String withoutX(String str) {

        if (str.isEmpty())
            return str;
        if (str.equals("x"))
            return "";

        if (str.charAt(0)=='x' && str.charAt(str.length()-1)=='x')
            return str.substring(1,str.length()-1);
        if (str.charAt(0)=='x')
            return str.substring(1,str.length());
        if (str.charAt(str.length()-1)=='x')
            return str.substring(0,str.length()-1);

        return str;
    }

    private static String startWord(String str, String word) {

        if (str.length()==0 || word.length()==0)
            return "";
        if (str.length()<word.length())
            return "";

        if (str.substring(0,word.length()).equals(word))
            return str.substring(0,word.length());

        if (str.substring(1,word.length()).equals(word.substring(1,word.length())))
            return str.substring(0,word.length());

        if (str.substring(1,word.length()).equals(word.substring(0,word.length())))
            return str.substring(0,word.length());

        return "";
    }

    private static String deFront(String str) {

        if (str.length()==0)
            return str;
        if (str.equals("a"))
            return str;
        if (str.equals("ab"))
            return str;


        if (str.charAt(0)=='a') {
            if (str.charAt(1) == 'b')
                return str;
            else
                return str.charAt(0)+str.substring(2,str.length());
        }
        else if (str.charAt(1)=='b')
            return str.substring(1,str.length());

        return str.substring(2,str.length());
    }

    private static String without2(String str) {

        if (str.length()==0)
            return "";

        if (str.length()>=2 && str.substring(0,2).equals(str.substring(str.length()-2,str.length())))
            return str.substring(2,str.length());

        return str;
    }

    private static String extraFront(String str) {

        if (str.isEmpty())
            return "";

        if (str.length()==1)
            return str+str+str;

        return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
    }

    private static String minCat(String a, String b) {

        if (b.length()>a.length())
            return a+b.substring(b.length()-a.length(), b.length());
        if (a.length()>b.length())
            return a.substring(a.length()-b.length(), a.length())+b;

        return "";
    }

    private static Boolean frontAgain(String str) {

        if (str.length()<2)
            return false;

        if (str.substring(0,2).equals(str.substring(str.length()-2,str.length())))
            return true;

        return false;
    }

    private static String seeColor(String str) {

        if (str.length()>=3 && str.substring(0,3).equals("red"))
            return "red";
        if (str.length()>=4 && str.substring(0,4).equals("blue"))
            return "blue";

        return "";
    }

    private static String lastTwo(String str) {

        if (str.length()<1)
            return "";
        if (str.length()==1)
            return str;

        return str.substring(0,str.length()-2)+str.charAt(str.length()-1)+str.charAt(str.length()-2);
    }

    private static String conCat(String a, String b) {

        if (a.length()<1 || b.length()<1)
            return a+b;

        if (a.substring(a.length()-1,a.length()).equals(b.substring(0,1)))
            return a.substring(0, a.length()-1)+b;

        return a+b;
    }

    private static String lastChars(String a, String b) {

        if (a.length()==0 && b.length()==0)
            return "@@";
        if (a.length()==0)
            return "@"+b.substring(b.length()-1, b.length());
        if (b.length()==0)
            return a.substring(0,1)+"@";

        return a.substring(0,1)+b.substring(b.length()-1, b.length());
    }

    private static String atFirst(String str) {

        if (str.length()<1)
            return "@@";
        if (str.length()==1)
            return str+"@";

        return str.substring(0,2);
    }

    private static boolean hasBad(String str) {
        if (str.length()<3)
            return false;

        if (str.substring(0,3).equals("bad"))
            return true;
        if (str.length()>3 && str.substring(1,4).equals("bad"))
            return true;

        return false;
    }

    private static String middleThree(String str) {

        if (str.length()<3)
            return "";

        int n = str.length()/2;
        return str.substring(n-1, n+2);
    }

    private static String twoChar(String str, int index) {

        if (str.length()<2)
            return "";

        if (index>str.length()-2 || index<0)
            return str.substring(0,2);

        return str.substring(index, index+2);
    }

    private static String middleTwo(String str) {

        if (str.length()<2)
            return "";

        return str.substring(str.length()/2-1, str.length()/2+1);
    }

    private static String firstHalf(String str) {

        if (str.length()<2)
            return "";

        return str.substring(0, str.length()/2);
    }

    private static String makeTags(String tag, String word) {

        return "<"+tag+">"+word+"</"+tag+">";
    }

    private static String nTwice(String str, int n) {

        if (str.length()<n)
            return "";

        return str.substring(0,n)+str.substring(str.length()-n,str.length());
    }

    private static boolean endsLy(String str) {
        if (str.length()<2)
            return false;

        if (str.substring(str.length()-2, str.length()).equals("ly"))
            return true;

        return false;
    }

    private static String withoutEnd2(String str) {

        if (str.length()<3)
            return "";

        return str.substring(1,str.length()-1);
    }

    private static String theEnd(String str, boolean front) {

        if (str.isEmpty())
            return "";

        if (front)
            return str.substring(0,1);
        else return str.substring(str.length()-1, str.length());
    }

    private static String right2(String str) {

        if (str.length()<2)
            return "";

        return str.substring(str.length()-2,str.length())+str.substring(0,str.length()-2);
    }

    private static String left2(String str) {

        if (str.length()<2)
            return "";

        return str.substring(2,str.length())+str.substring(0,2);
    }

    private static String nonStart(String a, String b) {

        if (a.isEmpty() || b.isEmpty())
            return "";

        return a.substring(1, a.length())+b.substring(1,b.length());
    }

    private static String comboString(String a, String b) {

        if (a.length()==b.length())
            return "";

        else if (a.length()<b.length())
            return a+b+a;

        else
            return b+a+b;
    }

    private static String withoutEnd(String str) {

        if (str.length()<2)
            return "";

        return str.substring(1,str.length()-1);
    }

    private static String firstTwo(String str) {

        if (str.length()<2)
            return str;

        return str.substring(0,2);
    }

    private static String extraEnd(String str) {

        if (str.length()<2)
            return "";

        String tmp = str.substring(str.length()-2, str.length());
        return tmp+tmp+tmp;
    }

    private static String makeOutWord(String out, String word) {
        return out.substring(0,2)+word+out.substring(2,out.length());
    }

    private static String makeAbba(String a, String b) {

        return a+b+b+a;
    }

    private static String helloName(String name) {

        return "Hello " + name + "!";
    }
}
