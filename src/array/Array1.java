package array;

public class Array1 {
    public static void main(String[] args) {

        int[] a1 = {1,2,4,6,7};
        int[] a2 = {6,2,7,8,3,12};
        int[] a3 = {1,3,5,1};
        int[] a4 = {1,2,3};
        int[] a5 = {4,5,6};
        int[] a6 = {3,4};
        int[] a7 = {3,2};
        int[] a8 = {};

//        System.out.println(firstLast6(a2));
//        System.out.println(sameFirstLast(a3));
//        System.out.println(sameFirstLast(a2));
//        int[] pi = makePi();
//        System.out.println(commonEnd(a4, a1));
//        System.out.println(commonEnd(a2, a1));
//        System.out.println(sum3(a4));
//        int[] rl3 = rotateLeft3(a4);
//        int[] r3 = reverse3(a4);
//        int[] me3 = maxEnd3(a4);
//        int sum = sum2(a3);
//        int[] mw = middleWay(a4,a5);
//        int[] me = makeEnds(a2);
//        System.out.println(has23(a1));
//        System.out.println(no23(a1));
//        int[] ml = makeLast(a1);
//        System.out.println(double23(a1));
//        int[] f23 = fix23(a4);
//        int s = start1(a2,a3);
//        int[] bt = biggerTwo(a6,a7);
//        int[] mm = makeMiddle(a2);
//        int[] pt = plusTwo(a6,a7);
//        int[] se = swapEnds(a2);
//        int[] mt = midThree(a1);
        int mt = maxTriple(a1);
        int[] fp = frontPiece(a1);
        System.out.println(unlucky1(a1));
        int[] m2 = make2(a8,a2);
        int[] f11 = front11(a5,a4);

    }

    private static int[] front11(int[] a, int[] b) {

        int[] tmp={};
        if (a.length==0 && b.length==0)
            return tmp;

        if (a.length==0){
            tmp = new int[1];
            tmp[0] = b[0];
        }
        else if(b.length==0){
            tmp = new int[1];
            tmp[0] = a[0];
        }
        else {
            tmp = new int[2];
            tmp[0] = a[0];
            tmp[1] = b[0];
        }

        return tmp;
    }

    private static int[] make2(int[] a, int[] b) {

        int[] tmp = new int[2];

        if (a.length==0){
            tmp[0]=b[0];
            tmp[1]=b[1];
        }
        if (a.length==1){
            tmp[0]=a[0];
            tmp[1]=b[0];
        }
        if (a.length>1){
            tmp[0]=a[0];
            tmp[1]=a[1];
        }

        return tmp;
    }

    private static boolean unlucky1(int[] nums) {

        if (nums.length<2)
            return false;
        if (nums[0]==1 && nums[1]==3)
            return true;
        if (nums[1]==1 && nums[2]==3)
            return true;
        if (nums[nums.length-2]==1 && nums[nums.length-1]==3)
            return true;

        return false;
    }

    private static int[] frontPiece(int[] nums) {

        int[] tmp;
        if (nums.length<=1){
            tmp=nums;
        }

        else {
            tmp = new int[2];
            tmp[0]=nums[0];
            tmp[1]=nums[1];
        }

        return tmp;
    }

    private static int maxTriple(int[] nums) {

        int max=0;
        int m = nums.length/2;
        int l = nums.length-1;

        if (nums[0] >= nums[m] && nums[0]>=nums[l])
            max = nums[0];
        if (nums[m]>=nums[l] && nums[m]>=nums[0])
            max=nums[m];
        if (nums[l]>=nums[0] && nums[l]>=nums[m])
            max=nums[l];

        return max;
    }

    private static int[] midThree(int[] nums) {

        int[] tmp = new int[3];

        int n = nums.length/2;

        tmp[0] = nums[n-1];
        tmp[1] = nums[n];
        tmp[2] = nums[n+1];

        return tmp;
    }

    private static int[] swapEnds(int[] nums) {

        int[] tmp = nums;
        int t = tmp[0];
        tmp[0]=tmp[tmp.length-1];
        tmp[tmp.length-1]=t;

        return tmp;
    }

    private static int[] plusTwo(int[] a, int[] b) {

        int[] tmp = new int[a.length+b.length];

        //System.arraycopy(a,0,tmp,0, a.length);
        //System.arraycopy(b,0,tmp,a.length,b.length);

        tmp[0] = a[0];
        tmp[1] = a[1];
        tmp[2] = b[0];
        tmp[3] = b[1];

        return tmp;
    }

    private static int[] makeMiddle(int[] nums) {

        int[] tmp = new int[2];

        int i = nums.length/2;
        tmp[0] = nums[i-1];
        tmp[1] = nums[i];

        return tmp;
    }

    private static int[] biggerTwo(int[] a, int[] b) {

        int s1 = a[0]+a[1];
        int s2 = b[0]+b[1];

        int[] tmp = new int[2];

        if (s1>=s2)
            tmp=a;
        else tmp=b;

        return tmp;
    }

    private static int start1(int[] a, int[] b) {

        int n = 0;
        if(a.length!=0 && a[0]==1)
            n++;
        if(b.length!=0 && b[0]==1)
            n++;

        return n;
    }

    private static int[] fix23(int[] nums) {

        int[] tmp;
        tmp = nums;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i]==2 && nums[i+1]==3){
                tmp[i+1]=0;
            }
        }

        return tmp;
    }

    private static boolean double23(int[] nums) {

        if (nums.length!=2)
            return false;

        if ((nums[0]==2 && nums[1]==2) || (nums[0]==3 && nums[1]==3))
            return true;

        return false;
    }

    private static int[] makeLast(int[] nums) {

        int[] tmp = new int[nums.length*2];

        tmp[tmp.length-1]=nums[nums.length-1];

        return tmp;
    }

    private static boolean no23(int[] nums) {
        if (nums.length<2 || nums.length>2)
            return false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i]==2 || nums[i]==3)
                return false;
        }
        return true;
    }

    private static boolean has23(int[] nums) {
        if (nums.length<2 || nums.length>2)
            return false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i]==2 || nums[i]==3)
            return true;
        }

        return false;
    }

    private static int[] makeEnds(int[] nums) {

        int[] tmp = new int[2];
        tmp[0] = nums[0];
        tmp[1] = nums[nums.length-1];

        return tmp;
    }

    private static int[] middleWay(int[] a, int[] b) {

        int[] tmp = new int[2];
        tmp[0]=a[1];
        tmp[1]=b[1];

        return tmp;

    }

    private static int sum2(int[] nums) {

        if (nums.length==0)
            return 0;

        if (nums.length==1)
            return nums[0];

        return nums[0]+nums[1];
    }

    private static int[] maxEnd3(int[] nums) {
        if (nums.length!=3)
            return nums;

        int[] tmp = new int[3];
        if (nums[0]>nums[2]){
            tmp[0]=nums[0];
            tmp[1]= nums[0];
            tmp[2]= nums[0];
        }
        else {
            tmp[0]=nums[2];
            tmp[1]= nums[2];
            tmp[2]= nums[2];
        }

        return tmp;
    }

    private static int[] reverse3(int[] nums) {
        if (nums.length!=3)
            return nums;

        int[] tmp = new int[3];
        tmp[0]=nums[2];
        tmp[1]= nums[1];
        tmp[2]= nums[0];

        return tmp;
    }

    private static int[] rotateLeft3(int[] nums) {
        if (nums.length!=3)
            return nums;

        int[] tmp = new int[3];
        tmp[0]=nums[1];
        tmp[1]= nums[2];
        tmp[2]= nums[0];

        return tmp;
    }

    private static int sum3(int[] nums) {

        if (nums.length!=3)
            return 0;

        return nums[0]+nums[1]+nums[2];
    }

    private static boolean commonEnd(int[] a, int[] b) {

        if (a.length<1 || b.length<1)
            return false;

        if (a[0]==b[0])
            return true;

        if (a[a.length-1]==b[b.length-1])
            return true;

        return false;
    }

    private static int[] makePi() {

        int[] tmp = {3,1,4};
        return tmp;
    }

    private static boolean sameFirstLast(int[] nums) {
        if (nums.length<1)
            return false;

        if (nums[0]==nums[nums.length-1])
            return true;

        return false;
    }

    private static boolean firstLast6(int[] nums) {

        if (nums.length<1)
            return false;

        if (nums[0]==6 || nums[nums.length-1]==6)
            return true;

        return false;
    }
}
