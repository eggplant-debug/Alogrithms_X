package leetcode.division;

public class findPeak {
    public int findPeakElement(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid+1]>nums[mid]){
                left=mid+1;
            }
            else{
                right=mid ;
            }
        }
        return left;
    }
    public static void main(String [] args){
        findPeak p=new findPeak();
        int[] nums={1,2,3,1};
        System.out.println(p.findPeakElement(nums));
    }
}
