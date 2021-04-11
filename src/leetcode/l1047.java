package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class l1047 {
//    public void removeDuplicates(String s){
//        StringBuffer S =new StringBuffer();
//        S.append(s);
//        System.out.print(S);
//        return;
//        for(int i=0;i<S.length-1;i++){
//            if(S[i]==S[i+1]){
//
//            }
//        }

    public static void main(String [] args){
        String s="accabbccc";
        StringBuffer S=new StringBuffer();
        S.append(s);

        while(true){
            boolean flag =true;
            for (int i=0;i<S.length()-1;i++){
                if(S.charAt(i)==S.charAt(i+1)){
                    S.deleteCharAt(i);
                    S.deleteCharAt(i--); //这点可以解决由于删除元素带来的索引错误问题
                    flag=false;
                }
            }
            if(flag){
                break;
            }
        }
        System.out.println(S);
        S.toString();


    }
}
