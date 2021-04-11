package leetcode.division;

import jdk.nashorn.internal.objects.Global;

public class findMinInArray {
    //4,5,6,7,2,3
    public int findmin(int [] nums){
        int left=0;
        int right=nums.length-1;
        if(nums[0]<nums[right]){
            return nums[0];
        }
        int mid;
        while(left<right){
            mid=left+((right-left)>>1);
            if(nums[mid]>nums[0]){
                left=mid+1;
            }
            else{
                right=mid;
            }
            if(nums[mid+1]<nums[mid]){
                return nums[mid+1];
            }
            if(nums[mid-1]>nums[mid]){
                return nums[mid];
            }
        }
        return -1;
    }
    public static void main(String [] args){
        findMinInArray f=new findMinInArray();
        int [] nums={2,1};
        System.out.println(f.findmin(nums));
    }


}
