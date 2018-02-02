package string;

import java.util.ArrayList;
import java.util.List;

public class String3 {
    public static void main(String[] args) {

        System.out.println(countYZ("!!day--yaz!!"));
        System.out.println(withoutString("THIS is a FISH", "is"));
        System.out.println(equalIsNot("isisnotno7Not"));
        System.out.println(gHappy("xxggxx"));
        System.out.println(countTriple("222abyyycdXXX"));
        System.out.println(sumDigits("aa1bc2d3"));
        System.out.println(sameEnds("mymmy"));
        System.out.println(mirrorEnds("abXYZba"));
        System.out.println(maxBlock("abbCCCddBBBxx"));
        System.out.println(sumNumbers("abc123xyz") );
        System.out.println(notReplace("is test") );
    }

    private static String notReplace(String str) {
        String result = "";
        str = " " + str + "  "; // avoid issues with corner cases
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'i') {
                if (str.charAt(i + 1) == 's'
                        && !Character.isLetter(str.charAt(i + 2))
                        && !Character.isLetter(str.charAt(i - 1))) {
                    result += "is not";
                    i += 1;
                } else result += "i";
            } else result += str.charAt(i);
        }
        return result.substring(1);
        //return str.replaceAll("^is | is | is$|\\-is|is\\-"," is not ").trim();

    }

    private static int sumNumbers(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int count = 0;
                for (int j = i; j < str.length(); j++) {
                    if (Character.isDigit(str.charAt(j))) count++;
                    else break;
                }
                sum += Integer.parseInt(str.substring(i, i + count));
                i += count;
            }
        }
        return sum;
    }

    private static int maxBlock(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            int tmp = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    tmp++;
                else break;
            }
            if (tmp > count)
                count = tmp;
        }
        return count;
    }

    private static String mirrorEnds(String string) {
        String tmp = "";

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)==string.charAt(string.length()-1-i))
                tmp+=string.charAt(i);
            else return tmp;
        }
        return tmp;
    }

    private static String sameEnds(String string) {
        String tmp = "";
        int l = string.length();
        for (int i = 0; i <= l/2; i++) {
            for (int j = l/2; j < l; j++) {
                String first = string.substring(0,i);
                String last = string.substring(j);
                if (first.equals(last))
                    tmp=first;
            }
        }
        return tmp;
    }

    private static int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;
    }

    private static int countTriple(String str) {
        int count = 0;
        if (str.length()>=3){
            for (int i = 1; i < str.length()-1; i++) {
                if (str.charAt(i-1)==str.charAt(i) && str.charAt(i)==str.charAt(i+1))
                    count++;
            }
        }
        return count;
    }

    private static boolean gHappy(String str) {
        String tmp = str.replaceAll("ggg", "");
        tmp = tmp.replaceAll("gg", "");
        if (tmp.contains("g"))
            return false;
        return true;
    }

    private static boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;

        for (int i = 1; i < str.length(); i++) {
            String tmp = str.substring(i-1,i+1);
            if (tmp.equals("is"))
                countIs++;
        }
        for (int i = 2; i < str.length(); i++) {
            String tmp = str.substring(i-2,i+1);
            if (tmp.equals("not"))
                countNot++;
        }

        if (countIs==countNot)
            return true;

        return false;
    }

    private static String withoutString(String base, String remove) {
        return base.replaceAll("(?i)"+remove,"");
    }

    private static int countYZ(String str) {
        int count = 0;
        String[] w = str.toLowerCase().split("\\W|\\d|_");
        for (int i = 0; i < w.length; i++) {
            if (!w[i].equals("")) {
                char yz = w[i].charAt(w[i].length() - 1);
                if (yz == 'y' || yz == 'z')
                    count++;
            }
        }
        return count;
    }

}
