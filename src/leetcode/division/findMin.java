package leetcode.division;

public class findMin {
    public int findMin(int[] nums) {

        //寻找旋转点，旋转点满足，旋转点的数，大于右边的，且0位置上的数，大于旋转点右边的数
        int left=0;
        int right=nums.length;
        while(left<right){
            int mid= left+((right-left)>>1);
            if(nums[mid]>nums[right]){
                left=mid+1;

            }
            else if(nums[mid]<nums[right]){
                right=mid;
            }

            else if(nums[mid]==nums[right]){
                right-=1;
            }
        }
        return nums[left];
    }
}
