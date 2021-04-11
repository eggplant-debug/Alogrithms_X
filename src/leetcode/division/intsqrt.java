package leetcode.division;

import com.sun.scenario.effect.Brightpass;

public class intsqrt {
    public int intsqrt(int num) {
        int left = 0;
        int right = num;
        if(num==0 || num==1){
            return num;
        }
        while(left<right){

            int mid = left + (right - left) / 2;
            if ((long)mid * mid == num) {
                return mid;
            } else if ((long)mid * mid > num) {
                right = mid - 1;
            } else {
                left = mid+1;
            }

        }
        if(left*left>num){
            return left-1;
        }
        else{
            return left;
        }

    }
    public static void main(String[] args){
            int num=2147483647;
            intsqrt i=new intsqrt();
            int nums=i.intsqrt(num);
            System.out.println(nums);
    }
}
