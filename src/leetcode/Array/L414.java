package leetcode.Array;

import java.security.PublicKey;
import java.util.HashSet;
import java.util.Set;

public class L414 {
    public int thirdMax(int[] nums) {
        Set<Integer> numSet=new HashSet<Integer>();
        for(int num:nums){
            numSet.add(num);
        }
        if(numSet.size()<3){
            return getMax(numSet);
        }
        else{
            Set<Integer> numSet2=new HashSet<Integer>();
            numSet2=dropMaxValue(dropMaxValue(numSet));
            return getMax(numSet2);
        }
    }

    public Set<Integer> dropMaxValue(Set<Integer> nums){
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        nums.remove(max);
        return nums;
    }
    public int getMax(Set<Integer> nums){
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        return max;
    }

    public static void main(String[] args){
        L414 l=new L414();
        int []nums={1,2,3,4};
        System.out.println(l.thirdMax(nums));
    }

}
