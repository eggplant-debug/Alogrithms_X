package leetcode.division;

public class LC {
    public int search(int[] nums, int target) {
        int l=0;
        int R=nums.length;
        if(nums.length==0){
            return -1;
        }
        if(nums.length==1){
            return nums[0]==target?0:-1;
        }
        while(l<=R){
            int mid=l+((R-l)>>1);
            //寻找出某边有序数组
            if(mid>nums.length-1){
                return -1;
            }
            if(nums[mid]==target){
                return mid;
            }

            if(nums[0]<=nums[mid]){// mid前的数组有序
                if(target<nums[mid]&& target>=nums[0]){
                    R=mid-1;
                }
                else{
                    l=mid+1;
                }

            }
            else{//mid前的数组无序，mid后的数组有序
                if(target>nums[mid]&&target<=nums[nums.length-1]){
                    l=mid+1;
                }
                else{
                    R=mid-1;
                }
            }
        }
        return -1;
    }
    public static void  main(String[] args){
        LC l=new LC();
        int[] nums={1,3};
        int target=0;

        System.out.println(l.search(nums,target));
    }
}
