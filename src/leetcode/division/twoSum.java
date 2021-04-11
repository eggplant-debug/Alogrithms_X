package leetcode.division;

public class twoSum {
    public int[] twosum(int [] numbers, int target){
        int left=0;
        int right=numbers.length-1;
        int [] result=new int[2];
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){

                    result[0]=i;
                    result[1]=j;
                    return result;

            }
        }
}
     return result;
    }


//    public static void main(String[] args){
//        int target
//    }
}

