package logic;

public class Logic1 {

    public static void main(String[] args) {

//        System.out.println(cigarParty(45, false));
//        System.out.println(dateFashion(3,4));
//        System.out.println(squirrelPlay(70, false));
//        System.out.println(caughtSpeeding(65,true));
//        System.out.println(sortaSum(9,4));
//        System.out.println(alarmClock(0,false));
//        System.out.println(love6(13,7));
//        System.out.println(in1To10(0, false));
//        System.out.println(specialEleven(22));
//        System.out.println(more20(23));
//        System.out.println(ald35(18));
//        System.out.println(less20(20));
//        System.out.println(nearTen(32));
//        System.out.println(teenSum(10,13));
//        System.out.println(answerCell(false, false, false));
//        System.out.println(teaParty(20,6));
//        System.out.println(fizzString("gid"));
//        System.out.println(fizzString2(6));
//        System.out.println(twoAsOne(1,5,3));
//        System.out.println(inOrder(7,5,6,true));
//        System.out.println(inOrderEqual(2,5,11,false));
//        System.out.println(lastDigit(2,3,2));
//        System.out.println(lessBy10(1,7,10));
//        System.out.println(withoutDoubles(3,3,false));
//        System.out.println(maxMod5(7,17));
//        System.out.println(redTicket(1,1,1));
//        System.out.println(greenTicket(1,2,1));
//        System.out.println(blueTicket(9,2,0));
//        System.out.println(shareDigit(23,23));
        System.out.println(sumLimit(18,1));




    }

    private static int sumLimit(int a, int b) {
        int sum = a+b;
        String strA = String.valueOf(a);
        String strSum = String.valueOf(sum);
        if (strSum.length()==strA.length())
            return sum;
        else return a;
    }

    private static boolean shareDigit(int a, int b) {
        int la=a/10;
        int lb=b/10;
        int ra=a%10;
        int rb=b%10;
        if (la==lb || la==rb || ra==lb || ra==rb)
            return true;
        return false;
    }

    private static int blueTicket(int a, int b, int c) {
        if (a+b==10 || b+c==10 || a+c==10)
            return 10;
        if ((a+b)-(b+c)==10 || (a+b)-(a+c)==10)
            return 5;
        return 0;
    }

    private static int greenTicket(int a, int b, int c) {
        if (a==b && b==c)
            return 20;
        if (a!=b && b!=c && a!=c)
            return 0;
        return 10;
    }

    private static int redTicket(int a, int b, int c) {
        if (a==b && b==c && c==2)
            return 10;
        if (a==b && b==c)
            return 5;
        if (a!=b && a!=c)
            return 1;
        return 0;
    }

    private static int maxMod5(int a, int b) {
        if (a==b)
            return 0;
        if (a%5==b%5)
            return Math.min(a,b);
        return Math.max(a,b);
    }

    private static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (die1==die2 && die1!=6){
            if (noDoubles)
                return die1+die2+1;
            else return die1+die2;
        }
        else if(die1==die2 && die1==6){
            if (noDoubles)
                return die1+1;
            else return die1+die2;
        }
        else return die1+die2;
    }

    private static boolean lessBy10(int a, int b, int c) {
        if (Math.abs(a-b)>=10 || Math.abs(b-c)>=10 || Math.abs(a-c)>=10)
            return true;
        return false;
    }

    private static boolean lastDigit(int a, int b, int c) {
        if (a%10==b%10 || b%10==c%10 || a%10==c%10)
            return true;
        return false;
    }

    private static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (!equalOk){
            if (a<b && b<c)
                return true;
        }
        else {
            if (a <= b && b <= c)
                return true;
        }
        return false;
    }

    private static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk){
            if (c>b)
                return true;
        }
        else {
            if (b>a && c>b)
                return true;
        }
        return false;
    }

    private static boolean twoAsOne(int a, int b, int c) {
        if (a+b==c || a+c==b || b+c==a)
            return true;
        return false;
    }

    private static String fizzString2(int n) {
        if (n%3==0 && n%5==0)
            return "FizzBuzz!";
        if (n%3==0)
            return "Fizz!";
        if (n%5==0)
            return "Buzz!";
        return n+"!";
    }

    private static String fizzString(String str) {
        if ((str.charAt(0)=='f') && (str.charAt(str.length()-1)=='b'))
            return "FizzBuzz";
        if (str.charAt(0)=='f')
            return "Fizz";
        if (str.charAt(str.length()-1)=='b')
            return "Buzz";
        return str;
    }

    private static int teaParty(int tea, int candy) {
        if(tea<5 || candy<5)
            return 0;
        if (tea>=(candy*2) || candy>=(tea*2))
            return 2;
        return 1;
    }

    private static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep)
            return false;
        else {
            if (isMom)
                return true;
            else if (isMorning)
                return false;
        }
        return true;
    }

    private static int teenSum(int a, int b) {
        if ((a>=13 && a<=19) || (b>=13 && b<=19))
            return 19;
        return a+b;
    }

    private static boolean nearTen(int num) {
        if (num%10==0)
            return true;
        if ((num%10)-8==0)
            return true;
        if ((num%10)-9==0)
            return true;
        if ((num%10)-1==0)
            return true;
        if ((num%10)-2==0)
            return true;
        return false;
    }

    private static boolean less20(int n) {
        if ((n%20)-18==0)
            return true;
        if ((n%20)-19==0)
            return true;
        return false;
    }

    private static boolean ald35(int n) {
        if (n%3==0 && n%5==0)
            return false;
        if (n%3==0 || n%5==0)
            return true;
        return false;
    }

    private static boolean more20(int n) {
        if ((n%20)-1==0)
            return true;
        if ((n%20)-2==0)
            return true;
        return false;
    }

    private static boolean specialEleven(int n) {
        if (n%11==0)
            return true;
        if ((n%11)-1==0)
            return true;
        return false;
    }

    private static boolean in1To10(int n, boolean outsideMode) {
        if (!outsideMode){
            if (n<1 || n>10)
                return false;
        }
        else {
            if (n>1 && n<10)
                return false;
        }
        return true;
    }

    private static boolean love6(int a, int b) {
        if (a==6 || b==6)
            return true;
        if (a+b==6)
            return true;
        if (Math.abs(b-a)==6)
            return true;
        return false;
    }

    private static String alarmClock(int day, boolean vacation) {
        String str="10:00";
        if (vacation){
            if (day==0 || day==6)
                str="off";
        }
        else {
            if (day>0 && day<6)
                str="7:00";
        }
        return str;
    }

    private static int sortaSum(int a, int b) {
        int sum = a+b;
        if (sum>=10 && sum<20)
            sum=20;
        return sum;
    }

    private static int caughtSpeeding(int speed, boolean isBirthday) {
        int s=2;
        if (isBirthday){
            if (speed<=65)
                s=0;
            else if (speed>65 && speed<=85)
                s=1;
            else s=2;
        }
        else {
            if (speed<=60)
                s=0;
            else if (speed>60 && speed<=80)
                s=1;
            else s=2;
        }
        return s;
    }

    private static boolean squirrelPlay(int temp, boolean isSummer) {
        if (temp>=60 && temp<=90)
            return true;
        if ((temp>=60 && temp<=100) && isSummer)
            return true;
        return false;
    }

    private static int dateFashion(int you, int date) {
        int f=1;
        if (you>=8 || date>=8)
            f=2;
        if (you<=2 || date<=2)
            f=0;
        return f;
    }

    private static boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars>=40 && cigars<=60)
            return true;
        if (cigars>=40 && isWeekend)
            return true;
        return false;
    }
}
