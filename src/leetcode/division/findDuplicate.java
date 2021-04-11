package leetcode.division;

public class findDuplicate {
        //抽屉原理
    public int findDuplicate(int[] nums){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+((right-left)>>1);

            int cnt=0;
            for(int num:nums){
                if(num<mid){
                    cnt+=1;
                }
            }
            if(cnt>=mid){
                right=mid-1;
            }
            else{
                left=mid;
            }

        }
        return left;
    }
}
