package leetcode.Mathmatic;

import java.util.ArrayList;
import java.util.List;

public class uglynum {
    public int nthUglyNumber(int n){
        int [] p= {2,3,5};

        int count=0;
        if(n==1){
            return 1;
        }

        int result_num=1;
        while(count<n){
            //*
            int i=result_num;
            for(int num:p){
                while(i%num==0){
                    i/=num;
                }
            }
            if(i==1){
                count+=1;

            }

            result_num+=1;
        }

        return result_num-1;
    }

    public static void main(String[] args) {
        uglynum n= new uglynum();
        System.out.println(n.nthUglyNumber(9));
    }
}
