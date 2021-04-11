package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class l500 {
    public static void main(String[] args){
        String[] onelines= {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        int[] lines= new int[128];
        for (int i=0;i< onelines.length;i++){
            for(char c:onelines[i].toCharArray()){
                lines[c]=i+1;//加1很关键
            }
        }
//        ArrayList<String> temp =new ArrayList<>();

        String [] words= {"abdfs","cccd","a","qwwewm"};
        String [] temp = new String[words.length];
        int count=0;
        for(String c:words){

            int linenum=0;
            boolean oneline =true;
            for(char a:c.toUpperCase().toCharArray()){

                if(linenum!=0&&linenum!=lines[a]){
                    oneline=false;
                    break;
                }
                else{
                    linenum=lines[a];
                }

            }
            if(oneline){
//                temp.add(c);
                temp[count]=c;
                count++;
            }

        }
        System.out.println(Arrays.toString(temp));
    }





}
