package leetcode;
//二分查找
public class L704 {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid;
        if(target>nums[nums.length-1] || target<nums[0]){
            return -1;
        }
        while (left<=right){
            mid=(right-left)/2+left;

            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                left=mid+1;
                continue;
            }
            else if(target<nums[mid]){
                right=mid-1;
                continue;
            }
        }
        return -1;

    }
    public static void main(String [] args) {
        L704 l=new L704();
        int []nums={1,2,3,4,5,6,7,8,9};
        int target = 9;
        System.out.println(l.search(nums,target));

    }

}
