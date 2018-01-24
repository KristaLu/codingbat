package array;

import java.util.*;

public class Array3 {
    public static void main(String[] args) {

        int[] mas1 = {2, 2, 2, 2, 4};
        int[] mas2 = {2,4};

        System.out.println(maxSpan(mas1));
//        System.out.println(fix34(mas1));
//        System.out.println(fix45(mas1));
//        System.out.println(canBalance(mas1));
//        System.out.println(linearIn(mas1, mas2));
//        System.out.println(squareUp(3));
        System.out.println(seriesUp(3));




    }

    private static int[] seriesUp(int n) {
        int[] tmp = new int[n*(n+1)/2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                tmp[i*n-j]=j;
            }
        }
        return tmp;
    }

    private static int[] squareUp(int n) {
        int[] tmp = new int[n*n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                tmp[i*n-j]=j;
            }
        }
        return tmp;
    }

    private static boolean linearIn(int[] outer, int[] inner) {
        int idxO=0;
        int idxI=0;
        int count = inner.length;
        for (int i = idxO; i < outer.length; i++) {
            for (int j = idxI; j < inner.length; j++) {
                if (outer[i]==inner[j]){
                    count--;
                    idxO++;
                    idxI++;
                }
            }
        }
        if (count==0)
            return true;
        return false;
    }

    private static boolean canBalance(int[] nums) {
        int sum1=0;
        for (int i = 0; i < nums.length; i++) {
            sum1+=nums[i];
            int sum2=0;
            for (int j = nums.length-1; j > i ; j--) {
                sum2+=nums[j];
                if (sum1==sum2 && j-i==1)
                    return true;
            }
        }
        return false;
    }

    private static int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if ((nums[i]==5 && i==0) || (nums[i]==5 && nums[i-1]!=4)) {
                int idx = i;
                for (int j = 0; j < nums.length; j++)
                    if (nums[j]==4 && nums[j+1]!=5) {
                        int tmp = nums[j+1];
                        nums[j+1] = 5;
                        nums[idx] = tmp;
                        break;
                    }
            }
        return nums;
    }

    private static int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==3) {
                int tmp = nums[i+1];
                nums[i+1]=4;
                for (int j = i+2; j < nums.length; j++) {
                    if (nums[j]==4){
                        nums[j]=tmp;
                    }
                }
            }
        }
        return nums;
    }

    private static int maxSpan(int[] nums) {
        int idx = 0;
        if (nums.length>1) {
            int max = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (max <= nums[i]) {
                    max = nums[i];
                    idx = i;
                }
            }
        }
        return idx;
    }
}
