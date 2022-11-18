package Array;

import java.util.Arrays;

public class Arr1{
    public static void main(String[] args) {
        //String num1="11";
        //String num2="123";
        int[] nums = {0,1,0,3,12};
        int t=0;
        int c=0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0){
                t=nums[j];
                nums[j]=nums[c];
                nums[c++]=t;
            }
        }
        System.out.println(Arrays.toString(nums));
        int[] prices ={2,1,-1};
        System.out.println(pivotIndex(prices));
    }

    public static int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(lsum(i-1,nums)==rsum(i+1,nums)){
                return i;
            }
        }
        return -1;
    }
    public static int lsum(int x,int[] nums){
        int s=0;
        if(x==-1){
            return 0;
        }
        for (int j = 0; j <= x; j++) {
            s=s+nums[j];
        }
        return s;
    }
    public static int rsum(int y,int[] nums){
        int s=0;
        for (int k = y; k < nums.length; k++) {
            s=s+nums[k];
        }
        return s;
    }

    public static int maxpro122(int[] prices) {
        int p=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                p=p+prices[i]-prices[i-1];
            }
        }
        return p;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
        int[] arr= new int[m+n];
        while(k< arr.length){
            if(nums1[i]<nums2[j]){
                arr[k] = nums1[i];
                k++;
                i++;
            } else if (nums1[i]>nums2[j]) {
                arr[k] = nums2[j];
                k++;
                j++;
            } else if (nums1[i]==nums2[j]) {
                arr[k] = nums1[i];
                k++;
                arr[k] = nums2[j];
                k++;
                j++;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static int maxProfit(int[] prices) {
        int p=0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            p =Math.max(p,prices[i]- min);
        }
        return p;
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]+nums[i+1]==target){
                return new int[] {i,i+1};
            }
        }
        return new int[] {};
    }
    public static boolean isPalindrome(int x) {
        int n =x;
        int r =0;
        int c=0;
        for(int i=0;x>0;i++){
            r=x%10;
            c=c*10+r;
            x=x/10;
        }
        if(c==n){
            return true;
        }
        return false;
    }
}
