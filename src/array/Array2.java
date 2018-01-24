package array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Array2 {
    public static void main(String[] args) {

        int[] mas1 = {1, 2, 1, 1, 3};
        int[] mas2 = {0, 5, 0, 3};

//        System.out.println(countEvens(mas1));
//        System.out.println(digDiff(mas1));
//        System.out.println(centeredAverage(mas1));
//        System.out.println(sum13(mas1));
//        System.out.println(sum67(mas2));
//        System.out.println(has22(mas1));
//        System.out.println(lucky13(mas2));
//        System.out.println(sum28(mas2));
//        System.out.println(more14(mas2));
//        System.out.println(fizzArray(4));
//        System.out.println(only14(mas2));
//        System.out.println(fizzArray2(4));
//        System.out.println(no14(mas2));
//        System.out.println(isEverywhere(mas2,2));
//        System.out.println(either24(mas2));
//        System.out.println(matchUp(mas1, mas2));
//        System.out.println(has77(mas2));
//        System.out.println(has12(mas2));
//        System.out.println(modThree(mas2));
//        System.out.println(haveThree(mas2));
//        System.out.println(twoTwo(mas2));
//        System.out.println(sameEnds(mas2,2));
//        System.out.println(tripleUp(mas2));
//        System.out.println(fizzArray3(3,10));
//        System.out.println(shiftLeft(new int[]{}));

        System.out.println(tenRun(mas1));

//        System.out.println(pre4(mas1));
//        System.out.println(post4(mas1));
//        System.out.println(notAlone(mas1,2));
//        System.out.println(zeroFront(mas1));
//        System.out.println(withoutTen(mas1));
//        System.out.println(zeroMax(mas2));
//        System.out.println(evenOdd(mas1));
//        System.out.println(fizzBuzz(1,11));

    }

    private static String[] fizzBuzz(int start, int end) {
        String[] tmp = new String[end-start];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i]=String.valueOf(i+start);
            if ((i+start)%3==0)
                tmp[i]=String.valueOf("Fizz");
            if ((i+start)%5==0)
                tmp[i]=String.valueOf("Buzz");
            if ((i+start)%3==0 && (i+start)%5==0)
                tmp[i]=String.valueOf("FizzBuzz");
        }
        return tmp;
    }

    private static int[] evenOdd(int[] nums) {
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0 || nums[i]%2==0)
                tmp.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==1)
                tmp.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]=tmp.get(i);
        }
        return nums;
    }

    private static int[] zeroMax(int[] nums) {
        int mo = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] % 2 == 1) {
                        if (nums[j] > mo) {
                            mo = nums[j];
                            nums[i] = mo;
                        }
                    }
                }
            }
            mo = 0;
        }
        return nums;
    }

    private static int[] withoutTen(int[] nums) {
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=10)
                tmp.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==10)
                tmp.add(0);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]=tmp.get(i);
        }
        return nums;
    }

    private static int[] zeroFront(int[] nums) {
        List<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0)
                tmp.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0)
                tmp.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]=tmp.get(i);
        }
        return nums;
    }

    private static int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i]==val && nums[i-1]!=val && nums[i+1]!=val) {
                if (nums[i - 1] > nums[i + 1])
                    nums[i] = nums[i - 1];
                else nums[i] = nums[i + 1];
            }
        }
        return nums;
    }

    private static int[] post4(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==4) {
                idx = i;
            }
        }
        int[] tmp = new int[nums.length-idx-1];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i]=nums[i+idx+1];
        }
        return tmp;
    }

    private static int[] pre4(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==4) {
                idx = i;
                break;
            }
        }
        int[] tmp = new int[idx];
        for (int i = 0; i < idx; i++) {
            tmp[i]=nums[i];
        }
        return tmp;
    }

    private static int[] tenRun(int[] nums) {

        if (nums.length>1) {
            int tmp = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (tmp % 10 != 0)
                    tmp=nums[i];
                if (nums[i]%10==0)
                    tmp=nums[i];

                nums[i]=tmp;
            }
        }
        return nums;
    }

    private static int[] shiftLeft(int[] nums) {

        if (nums.length>0) {
            int tmp = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] = nums[i + 1];
            }
            nums[nums.length - 1] = tmp;
        }

        return nums;
    }

    private static int[] fizzArray3(int start, int end) {
        int[] tmp = new int[end-start];
        for (int i = 0; i < end-start; i++) {
            tmp[i]=start+i;
        }
        return tmp;
    }

    private static boolean tripleUp(int[] nums) {
        for (int i = 1; i < nums.length-1; i++) {
            if ((nums[i]-nums[i-1])==1 && (nums[i+1]-nums[i])==1)
                return true;
        }
        return false;
    }

    private static boolean sameEnds(int[] nums, int len) {
        int end = nums.length-len;
        int count = len;
        for (int i = 0; i < len; i++) {
            if (nums[i]==nums[end+i])
                count--;
        }
        if (count==0)
            return true;
        return false;
    }

    private static boolean twoTwo(int[] nums) {
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==2){
                if(i<nums.length-1 && nums[i+1]==2)
                    flag = true;
                else if (i>0 && nums[i-1]==2)
                    flag = true;
                else flag = false;
            }
            if (flag==false)
                return false;
        }
        return flag;
    }

    private static boolean haveThree(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==3)
                count++;
        }
        if (count!=3)
            return false;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==3 && nums[i+1]==3)
                return false;
        }
        return true;
    }

    private static boolean modThree(int[] nums) {
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i-1]%2==0 && nums[i]%2==0 && nums[i+1]%2==0)
                return true;
            if (nums[i-1]%2!=0 && nums[i]%2!=0 && nums[i+1]%2!=0)
                return true;
        }
        return false;
    }

    private static boolean has12(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1){
                for (int j = i; j < nums.length; j++) {
                    if (nums[j]==2)
                        return true;
                }
            }
        }
        return false;
    }

    private static boolean has77(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==7 && nums[i+1]==7)
                return true;
        }
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i-1]==7 && nums[i+1]==7)
                return true;
        }
        return false;
    }

    private static int matchUp(int[] nums1, int[] nums2) {
        int count=0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i]!=nums2[i] && Math.abs(nums1[i]-nums2[i])>0 && Math.abs(nums1[i]-nums2[i])<3)
                count++;
        }
        return count;
    }

    private static boolean either24(int[] nums) {
        int count2=0;
        int count4=0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==2 && nums[i+1]==2)
                count2++;
            if (nums[i]==4 && nums[i+1]==4)
                count4++;
        }

        if (count2>0 && count4==0)
            return true;
        if (count4>0 && count2==0)
            return true;
        return false;
    }

    private static boolean isEverywhere(int[] nums, int val) {

        int count = 0;
        for (int i = 0; i < nums.length; i+=2) {
            if (nums[i]==val)
                count++;
        }
        if (count==(nums.length+1)/2)
            return true;

        count = 0;
        for (int i = 1; i < nums.length; i+=2) {
            if (nums[i]==val)
                count++;
        }
        if (count==nums.length/2)
            return true;

        return false;
    }

    private static boolean no14(int[] nums) {
        int count1=0;
        int count4=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1)
                count1++;
            if (nums[i]==4)
                count4++;
        }
        if (count1>0 && count4>0)
            return false;
        return true;
    }

    private static String[] fizzArray2(int n) {
        int[] tmp = new int[n];
        for (int i = 0; i < n; i++) {
            tmp[i]=i;
        }
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i]=String.valueOf(tmp[i]);
        }
        return str;
    }

    private static boolean only14(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=1 && nums[i]!=4)
                return false;
        }
        return true;
    }

    private static int[] fizzArray(int n) {
        int[] tmp = new int[n];
        for (int i = 0; i < n; i++) {
            tmp[i]=i;
        }
        return tmp;
    }

    private static boolean more14(int[] nums) {
        int count1=0;
        int count4=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1)
                count1++;
            if (nums[i]==4)
                count4++;
        }
        return (count1>count4);
    }

    private static boolean sum28(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==2)
                sum+=nums[i];
        }

        if (sum==8)
            return true;
        return false;
    }

    private static boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1 || nums[i]==3)
                return false;
        }
        return true;
    }

    private static boolean has22(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1]==2 && nums[i]==2)
                return true;
        }
        return false;
    }

    private static int sum67(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1]==6){
                sum-=nums[i-1];
                while (nums[i]!=7){
                    sum-=nums[i];
                    i++;
                }
                sum-=nums[i];
            }
        }
        return sum;
    }

    private static int sum13(int[] nums) {

        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i]==13)
                count++;
        }

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==13 && nums[i+1] != 13) {
                sum -= nums[i+1];
            }
        }
        return sum-(count*13);
    }

    private static int centeredAverage(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<min)
                min = nums[i];
            else if (nums[i]>max)
                max=nums[i];

            res+=nums[i];
        }

        int tmp = nums.length-2;
        return (res-(min+max))/tmp;
    }

    private static int digDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<min)
                min = nums[i];
            else if (nums[i]>max)
                max=nums[i];
        }
        return max-min;
    }

    private static int countEvens(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0)
                count++;
        }
        return count;
    }
}
