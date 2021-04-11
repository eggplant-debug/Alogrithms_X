package leetcode.Array;

import java.util.Arrays;

public class L628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3],nums[nums.length-1]*nums[0]*nums[1]);
    }
    public static void main(String [] args){
        int [] nums={-1,-2,4,0};
        L628 l= new L628();

        System.out.println(l.maximumProduct(nums));

        }
}
