package leetcode.division;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import sun.reflect.generics.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

public class findclosetElements {
    //思路，按照算法便利，并计数
    public List<Integer> findcloseElements(int[] arr, int k, int x){
//        利用collections来解决问题
//        List<Integer> ret = Arrays.stream(arr).boxed().collect(Collectors.toList());
//        Collections.sort(ret, (a,b) -> a == b ? a - b : Math.abs(a-x) - Math.abs(b-x));
//        ret = ret.subList(0, k);
//        Collections.sort(ret);
//        return ret;
        //删除法，从两边来删除数
        int size=arr.length;
        int removenum = arr.length-k;
        int left=0;
        int right=arr.length-1;
        while(removenum>0){
            if(x-arr[left]<=arr[right]-x){
                right--;
            }
            else{
                left++;
            }
            removenum--;


        }
        List<Integer> temp=new ArrayList<>();
        for(int i=left;i<right+1;i++){
            temp.add(arr[i]);
        }
        return temp;
    }

    public static  void main(String [] arges){
        findclosetElements f=new findclosetElements();
        int [] nums={2,3,4,5,6,7,8};
        int k=4;
        int x=6;
        List<Integer> l=f.findcloseElements(nums,k,x);
        System.out.println(l);
    }


}
