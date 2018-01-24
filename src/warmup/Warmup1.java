package warmup;

public class Warmup1 {
    public static void main(String[] args) {

        System.out.println(backAround("dddfff"));
        System.out.println(close10(2,6));
        System.out.println(delDel("dddfff"));
        System.out.println(diff(4));
        System.out.println(startHi("hidddfff"));
        System.out.println(missingChar("dddfff",6));
        System.out.println(front3("dddfff"));
        System.out.println(font22("dddfff"));
        System.out.println(frontBack("dddfff"));
        System.out.println(hasTeen(2,6,9));
        System.out.println(icyHot(34,65));
        System.out.println(in1020(34,65));
        System.out.println(in3050(34,65));
        System.out.println(intMax(34,65, 2));
        System.out.println(lastDigit(34,65));
        System.out.println(makes(34,65));
        System.out.println(max1020(34,65));
        System.out.println(missingChar2("aiiid;;;;fff",65));
        System.out.println(mixStart("jkkkkkkk"));
        System.out.println(monkeyTrouble(false,true));
        System.out.println(nearHundred(34));
        System.out.println(notString("sssssssssll"));
        System.out.println(oneTeen(34,65));
        System.out.println(or35(34));
        System.out.println(parrotTrouble(false,2));
        System.out.println(posNeg(34,65, true));
        System.out.println(sleepIn(false,true));
        System.out.println(startHi2("hhhhh"));
        System.out.println(startOz("jdksllslsl"));
        System.out.println(stringE("ddd"));
        System.out.println(sumDouble(34,65));

    }

    private static String backAround(String str) {
        if(str.isEmpty())
            return "";
        else return str.substring(str.length()-1,str.length())+str+str.substring(str.length()-1,str.length());
    }

    private static int close10(int a, int b) {
        if(Math.abs(10-a) < Math.abs(10-b))
            return a;
        else if (Math.abs(10-a) > Math.abs(10-b))
            return b;
        else return 0;
    }

    private static String delDel(String str) {
        if(str.length()>3) {
            String tmp = str.substring(1, 4);
            if (tmp.equals("del"))
                return str.substring(0, 1) + str.substring(4, str.length());
            else
                return str;
        }
        else return str;
    }

    private static int diff(int n) {
        if(n<=21)
            return 21-n;
        else return (n-21)*2;
    }

    private static String startHi(String str) {
        if(str.isEmpty())
            return  str;
        else if(str.length()<3)
            return str.toUpperCase();
        else return str.substring(0, str.length()-3)+str.substring(str.length()-3).toUpperCase();
    }

    private static String missingChar(String str, int n) {
        if (str.isEmpty())
            return str;
        else if(str.length() < n)
            return str.substring(0,1);
        else {
            int N = (str.length()-1) / n;
            int[] mas = new int[N+1];
            for (int i = 0; i < mas.length; i++) {
                mas[i] = n * i;
            }
            char[] ch = new char[N+1];
            String tmp="";
            for (int i = 0; i < N+1; i++) {
                ch[i]=str.charAt(mas[i]);
                tmp+=ch[i];
            }
            return tmp;
        }
    }

    private static String front3(String str) {
        if(str.length()>3)
            return str.substring(0,3)+str.substring(0,3)+str.substring(0,3);
        else
            return str.substring(0,str.length())+str.substring(0,str.length())+str.substring(0,str.length());
    }

    private static String font22(String str) {
        if(str.isEmpty())
            return "";
        else if(str.length()<3)
            return str+str+str;
        else return str.substring(0,2)+str+str.substring(0,2);
    }

    private static String frontBack(String str) {
        if(str.isEmpty())
            return "";
        else {
            char[] mas = str.toCharArray();
            char tmp = mas[0];
            mas[0] = mas[mas.length - 1];
            mas[mas.length - 1] = tmp;
            return String.valueOf(mas);
        }
    }

    private static boolean hasTeen(int a, int b, int c) {
        if((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19))
            return true;
        else return false;
    }

    private static boolean icyHot(int temp1, int temp2) {
        if((temp1<0) && (temp2>100))
            return true;
        else if ((temp1>100) && (temp2<0))
            return true;
        else return false;
    }

    private static boolean in1020(int a, int b) {
        if((a>=10 && a<=20) || (b>=10 && b<=20))
            return true;
        else return false;
    }

    private static boolean in3050(int a, int b) {
        if(((a>=30 && a<=40) && (b>=30 && b<=40)) || ((a>=40 && a<=50) && (b>=40 && b<=50)))
            return true;
        else return false;
    }

    private static int intMax(int a, int b, int c) {
        if((a>b) && (a>c))
            return a;
        else if((b>a) && (b>c))
            return b;
        else return c;
    }

    private static boolean lastDigit(int a, int b) {
        if((a%10)==(b%10))
            return true;
        else return false;
    }

    private static boolean makes(int a, int b) {
        if((a+b)==10)
            return true;
        else if((a==10) || (b==10))
            return true;
        else return false;
    }

    private static int max1020(int a, int b) {
        if(a>=10 && a<=20){
            if(b>=10 && b<=20) return Math.max(a, b);
            else return a;
        }
        else if(b>=10 && b<=20)
            return b;
        else return 0;
    }

    private static String missingChar2(String str, int n) {
        return str.substring(0,n)+str.substring(n+1, str.length());
    }

    private static boolean mixStart(String str) {
        if(str.length()>2) {
            String tmp = str.substring(1, 3);
            if (tmp.equals("ix"))
                return true;
            else return false;
        }
        else return false;
    }

    private static boolean monkeyTrouble(boolean a, boolean b) {
        if((a && b) || (!a && !b)) return true;
        else return false;
    }

    private static boolean nearHundred(int n) {
        if((Math.abs(100-n)<=10) || (Math.abs(200-n)<=10))
            return true;
        else return false;
    }

    private static String notString(String str) {
        String[] mas = str.split(" ");
        if(mas[0].equals("not")){
            return  str;
        }
        else {
            return "not " + str;
        }
    }

    private static boolean oneTeen(int a, int b) {
        if(a>=13 && a<=19) {
            if(b>=13 && b<=19)
                return false;
            else return true;
        }
        else {
            if(b>=13 && b<=19)
                return true;
            else return false;
        }
    }

    private static boolean or35(int n) {
        if(((n%3)==0) || (n%5)==0)
            return true;
        else return false;
    }

    private static boolean parrotTrouble(boolean talking, int hour) {
        if(!talking)
            return false;
        else {
            if((hour<7) || (hour>20))
                return true;
            else return false;
        }
    }

    private static boolean posNeg(int a, int b, boolean negative) {
        if(negative){
            if((a<0)&&(b<0))
                return true;
            else return false;
        }
        else {
            if(a<0) {
                if (b >= 0)
                    return true;
                else return false;
            }
            else if(b<0)
                return true;
            else return false;
        }
    }

    public static boolean sleepIn(boolean i, boolean j) {
        if(i)
            return true;
        else{
            if(j) return false;
            else return true;
        }
    }

    private static boolean startHi2(String str) {
        String[] mas = str.split(" ");
        if(mas[0].equals("hi")){
            return  true;
        }
        else {
            return false;
        }
    }

    private static String startOz(String str) {
        if(str.isEmpty())
            return str;
        else if(str.length()==1) {
            char ch = str.charAt(0);
            if (ch == 'o')
                return "o";
            else return "";
        }
        else {
            char ch1 = str.charAt(0);
            char ch2 = str.charAt(1);
            if(ch1=='o'){
                if(ch2=='z')
                    return "oz";
                else return "o";
            }
            else {
                if(ch2=='z')
                    return "z";
                else return "";
            }
        }
    }

    private static boolean stringE(String str) {
        char[] mas = str.toCharArray();
        int n = 0;
        for (char ch:mas) {
            if(ch=='e')
                n++;
        }
        if(n>=1 && n<=3)
            return true;
        else return false;
    }

    private static int sumDouble(int a, int b) {
        if(a==b)
            return (a+b)*2;
        else return a+b;
    }
}
