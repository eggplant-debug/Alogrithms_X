package leetcode.division;

import jdk.nashorn.internal.objects.Global;

public class nextGreatestLetter {
    public static void main(String [] args){
//        char c='c';
//        char a='a';
//        if(c>a){
//            System.out.println(1);
//        }
//        System.out.println(c);

        nextGreatestLetter n=new nextGreatestLetter();
        char [] j={'a','b','j','k'};
        char target='k';
        char s=n.nextGreatestLetter(j,target);
        System.out.println(s);

    }
    public char nextGreatestLetter(char[] letters,char target){
        int count=0;

        for(char c:letters){

            if(target>=c){
                count++;

            }
            else{

                break;
            }
        }
        if(count>=letters.length||count==0){
            return letters[0];
        }
        else{
            return letters[count];
        }

    }
}
