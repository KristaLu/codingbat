package string;

import java.lang.reflect.Array;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String2 {
    public static void main(String[] args) {

//        System.out.println(doubleChar("the-aa"));
//        System.out.println(countHi("abchi hi ho"));
//        System.out.println(catDog("1cat1cadodog"));
//        System.out.println(countCode("aaacoiebbb"));
//        System.out.println(endOther("Hiabc","abC"));
//        System.out.println(xyzThere("xyz"));
//        System.out.println(bobThere("b(b"));
//        System.out.println(xyBalance("v"));
//        System.out.println(mixString("abc", "xyzccc"));
//        System.out.println(repeatEnd("Hello", 2));
//        System.out.println(repeatFront("Chocolate", 2));
//        System.out.println(repeatSeparator("Word", "X", 1));
//        System.out.println(prefixAgain("adddaaada", 2));
//        System.out.println(xyzMiddle("AxyzBBBB"));
//        System.out.println(getSandwich("xxbreadyy"));
//        System.out.println(sameStarChar("*xa*a*"));
//        System.out.println(oneTwo("abcdefxy"));
//        System.out.println(zipZap("zipXzapxzop"));
//        System.out.println(startOut("a*b*"));
//        System.out.println(plusOut("zipXzapXzop", "pX"));
        System.out.println(wordEnds("XY123XY", "XY"));





    }

    private static String wordEnds(String str, String word) {
        String tmp = "";
        for (int i = 0; i < str.length()-word.length()+1; i++) {
            String sub = str.substring(i,i+word.length());
            if (sub.equals(word)) {
                if (i != 0)
                    tmp += str.substring(i - 1, i);
                if (i+word.length()!=str.length())
                    tmp+=str.substring(i+word.length(), i+word.length()+1);
            }
        }
        return tmp;
    }

    private static String plusOut(String str, String word) {
        String tmp = "";
        for (int i = 0; i < str.length(); i++) {
            if (i+word.length()<=str.length() && str.substring(i,i+word.length()).equals(word)){
                tmp+=word;
                i+=word.length()-1;
            }
            else tmp+="+";
        }
        return tmp;
    }

    private static String startOut(String str) {
        return str.replaceAll("[\\w]?[*]{1,}[\\w]?","");
    }

    private static String zipZap(String str) {
        if (str.length()<3)
            return str;

        String tmp = str;
        for (int i = 1; i < tmp.length()-1; i++) {
            if (tmp.charAt(i-1)=='z' && tmp.charAt(i+1)=='p') {
                tmp=tmp.substring(0,i)+tmp.substring(i+1,tmp.length());
            }
        }
        return tmp;
    }

    private static String oneTwo(String str) {
        if (str.length()<3){
            return "";
        }

        char[] newStr = str.toCharArray();
        int n = (newStr.length/3)*3;
        int wn = (newStr.length%3);
        String tmp="";
        for (int i = 0; i < n-2; i+=3) {
            char ch = newStr[i];
            newStr[i]=newStr[i+1];
            newStr[i+1]=newStr[i+2];
            newStr[i+2]=ch;
        }

        for (int i = 0; i < newStr.length-wn; i++) {
            tmp+=newStr[i];
        }
        return tmp;
    }

    private static boolean sameStarChar(String str) {
        boolean flag = true;
        if (str.length()<3 || !str.contains("*"))
            return flag;

        if (str.contains("*")){
            for (int i = 0; i < str.length()-2; i++) {
                if (str.charAt(i+1) == '*' && str.charAt(i) != str.charAt(i + 2)) {
                    flag = !flag;
                }
            }
        }
        return flag;
    }

    private static String getSandwich(String str) {
        String tmp = "";
        int f=str.indexOf("bread");
        int l=str.lastIndexOf("bread");

        if (f>=0 && l>f+"bread".length()){
            return str.substring(f+"bread".length(), l);
        }

        return tmp;
    }

    private static boolean xyzMiddle(String str) {
        String xyz = "xyz";
        int vh=0;
        if (str.length()>3){
            for (int i = str.length()/2-2; i <= str.length()-3; i++) {
                if (xyz.equals(str.substring(i,i+3))){
                    vh = str.indexOf(xyz,str.length()/2-2);
                }
            }
            if (Math.abs(str.substring(0, vh).length()-str.substring(vh+3, str.length()).length())<=1)
                return true;
        }
        if (str.equals(xyz))
            return true;

         return false;
    }

    private static boolean prefixAgain(String str, int n) {
        if (n>0 && !str.equals("")){
            String pref = str.substring(0, n);
            String tmp = str.substring(n, str.length());

            for (int i = 0; i <= tmp.length()-n; i++) {
                if (pref.equals(tmp.substring(i,i+n)))
                    return true;
            }
        }
        return false;
    }

    private static String repeatSeparator(String word, String sep, int count) {
        String tmp = "";

        if (count>0 && !word.equals("")) {
            for (int i = 0; i < count-1; i++) {
                tmp+=word;
                tmp+=sep;
            }
            tmp+=word;
        }
        return tmp;
    }

    private static String repeatFront(String str, int n) {
        String tmp = "";

        if (n>0 && !str.equals("")) {
            for (int i = n; i >= 0; i--) {
                tmp+=str.substring(0, 0 + i);
            }
        }
        return tmp;
    }

    private static String repeatEnd(String str, int n) {

        String tmp = "";

        if (n>0 && !str.equals("")) {
            for (int i = 0; i < n; i++) {
                tmp+=str.substring(str.length() - n, str.length());
            }
        }
        return tmp;
    }

    private static String mixString(String a, String b) {
        String tmp="";
        for (int i = 0; i < Math.min(a.length(),b.length()); i++) {
            tmp+=a.substring(i,i+1)+b.substring(i,i+1);
        }
        if (a.length()>=b.length())
                tmp+=a.substring(b.length());
        if (b.length()>a.length())
            tmp+=b.substring(a.length());

            return tmp;
    }

    private static boolean xyBalance(String str) {

        if (!str.contains("y") && !str.contains("x"))
            return true;
        if (str.lastIndexOf('y')>str.lastIndexOf('x'))
            return true;
        return false;
    }

    private static boolean bobThere(String str) {
        if (str.length()<3)
            return false;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i)=='b' && str.charAt(i+2)=='b')
                return true;
        }
        return false;
    }

    private static boolean xyzThere(String str) {
        if (str.length()<3)
            return false;
        if (str.charAt(0)=='.' && str.substring(1,4).equals("xyz"))
            return false;
        if (str.substring(0,3).equals("xyz"))
            return true;
        for (int i = 1; i < str.length()-2; i++) {
            if (str.substring(i, i + 3).equals("xyz") && str.charAt(i-1)!='.')
                return true;
        }
        return false;
    }

    private static boolean endOther(String a, String b) {
        if (a.length()<b.length()){
            if (b.substring(b.length()-a.length(),b.length()).toLowerCase().equals(a.toLowerCase()))
                return true;
        }
        else {
            if (a.substring(a.length()-b.length(),a.length()).toLowerCase().equals(b.toLowerCase()))
                return true;
        }
        return false;
    }

    private static int countCode(String str) {
        int count=0;
        if (str.length()<4)
            return count;
        for (int i = 0; i < str.length()-3; i++) {
            if (str.substring(i,i+2).equals("co") && str.charAt(i+3)=='e')
                count++;
        }
        return count;
    }

    private static boolean catDog(String str) {
        int countC=0;
        int countD=0;
        if (str.length()<3)
            return true;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i, i + 3).equals("cat"))
                countC++;
            if (str.substring(i, i + 3).equals("dog"))
                countD++;
        }
        if (countC==countD)
            return true;
        return false;
    }

    private static int countHi(String str) {
        int count = 0;

        if (str.length()<2)
            return count;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='h' && str.charAt(i+1)=='i')
                count++;
        }
        return count;
    }

    private static String doubleChar(String str) {
        char[] c = str.toCharArray();
        String tmp="";
        for (int i = 0; i < c.length; i++) {
            tmp=tmp+c[i]+c[i];
        }
        return tmp;
    }
}
