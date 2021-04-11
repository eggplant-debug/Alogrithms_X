//package leetcode.division;
//
//public class findfirstAndLastIndex {
//    public int[] searchRange(int[] nums, int target) {
//        int left=0;
//        int right=nums.length-1;
//        int[] result;
//        int start;
//        int end;
//        if(nums.length==0){
//            result= new int[]{-1, -1};
//          return result;
//        }
//        while(left<right){
//            int mid=left+((right-left)>>1);
//            if(nums[mid]<target){
//                left=mid+1;
//            }
//            else if(nums[mid]>target){
//                right=mid;
//            }
//        }
//    return
//    }
//
//}
