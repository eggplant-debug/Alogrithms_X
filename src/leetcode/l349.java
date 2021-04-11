package leetcode;

import java.util.HashSet;
import java.util.Set;

public class l349 {
    public int[] intersection(int[]num1, int[]num2){
        Set<Integer> set1= new HashSet<Integer>();
        Set<Integer> set2= new HashSet<Integer>();
        for (int num : num1){
            set1.add(num);
        }
        for (int num : num2){
            set2.add(num);
        }
        return getIntersection(set1,set2);


    }

    public int[] getIntersection(Set<Integer> set1,Set<Integer>set2){
        Set<Integer> set3=new HashSet<Integer>();
        if(set1.size()>set2.size()){
            return getIntersection(set2,set1);
        }
        for(int c:set1){
            if (set2.contains(c))
            {
                set3.add(c);
            }
        }
        int[] ids= new int[set3.size()];

        int index=0;
        for(int num:set3){
            ids[index]=num;
            index++;
        }

        return ids;
    }
    public static void main(String[] args){
        l349 l=new l349();
        int [] num1={2,3,3,5};
        int [] num2={2,3,4,6};
        int [] intersection=l.intersection(num1,num2);
        for (int num:intersection)
        {
            System.out.println(num);
        }
    }


}
