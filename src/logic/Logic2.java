package logic;

public class Logic2 {
    public static void main(String[] args) {

//        System.out.println(makeBricks(3,2,8));
//        System.out.println(loneSum(3,3,3));
//        System.out.println(luckySum(13,2,3));
//        System.out.println(noTeenSum(2,13,1));
//        System.out.println(roundSum(16,17,18));
//        System.out.println(closeFar(10,10,8));
//        System.out.println(blackjack(3,22));
        System.out.println(evenlySpaced(4,6,2));
        System.out.println(makeChocolate(4,1,7));

    }

    private static int makeChocolate(int small, int big, int goal) {
        int b = big;
        int s = small;
        int g = goal;
        while (g>0 && b>0) {
            g -= 5;
            b--;
        }
        if (g==0)
            return 0;
        if (g<0)
            g+=5;
        while (g>0 && s>0) {
            g--;
            s--;
        }
        if (g==0) {
            return small-s;
        }
        return -1;
    }

    private static boolean evenlySpaced(int a, int b, int c) {
        int[] arr = {a,b,c};
        for (int j = 0; j < 3; j++) {
            for (int i = j+1; i < 3; i++) {
                if (arr[i]<arr[j]){
                    int tmp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=tmp;
                }
            }
        }

        if (Math.abs(arr[0]-arr[1])==Math.abs(arr[1]-arr[2]))
            return true;
        return false;
    }

    private static int blackjack(int a, int b) {
        if (a>21 && b>21)
            return 0;
        if (a>21)
            return b;
        if (b>21)
            return a;
        if ((21-b)<(21-a))
            return b;
        if ((21-a)<(21-b))
            return a;
        return 0;
    }

    private static boolean closeFar(int a, int b, int c) {
        if (Math.abs(a-b)<=1 && Math.abs(a-c)>=2 && Math.abs(b-c)>=2)
            return true;
        if (Math.abs(a-c)<=1 && Math.abs(a-b)>=2 && Math.abs(c-b)>=2)
            return true;

        return false;
    }

    private static int roundSum(int a, int b, int c) {
        int sum = round10(a)+ round10(b)+round10(c);
        return sum;
    }

    private static int round10(int n) {
        int m = n%10;
        if (m<5)
            return n-m;
        else
            return n-m+10;
    }

    private static int noTeenSum(int a, int b, int c) {
        int sum=fixTeen(a)+fixTeen(b)+fixTeen(c);
        return sum;
    }

    private static int fixTeen(int n) {
        if (n==13 || n==14)
            return 0;
        if (n>=17 && n<=19)
            return 0;
        return n;
    }

    private static int luckySum(int a, int b, int c) {
        int sum=0;
        if (a==13)
            return sum;
        else
            sum+=a;
        if (b==13)
            return sum;
        else
            sum+=b;
        if (c==13)
            return sum;
        else
            sum+=c;
        return sum;
    }

    private static int loneSum(int a, int b, int c) {
        int sum = 0;
        if (a!=b && b!=c)
            sum=a+b+c;
        if (a==b && b==c)
            sum=0;
        if (a==b && b!=c)
            sum=c;
        if (a==c && c!=b)
            sum=b;
        if (b==c && c!=a)
            sum=a;
        return sum;
    }

    private static boolean makeBricks(int small, int big, int goal) {
        int b = big;
        int s = small;
        int g = goal;
        while (g>0 && b>0) {
            g -= 5;
            b--;
        }
        if (g==0)
            return true;
        if (g<0)
            g+=5;
        while (g>0 && s>0) {
            g--;
            s--;
        }
        if (g==0) {
            return true;
        }
        return false;
    }


}
