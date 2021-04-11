package leetcode.division;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
//有更优解法，二分，待会再看
public class SearchArray {
        public int[] Searchbybinary(int[] nums,int target) {
            int leftidx=-1;
            int rightidx=-1;
            int [] idexlist=new int[2];
            if (nums.length==0){
                idexlist[0]=-1;
                idexlist[1]=-1;
                return idexlist;
            }
            if(nums[0]==target){
                leftidx=0;

            }
            if(nums[nums.length-1]==target){
                rightidx=nums.length-1;
            }
            for(int i=1;i<=nums.length-1;i++){

                if(nums[i-1]<target && nums[i]==target){
                    leftidx=i;
                }

                if(nums[i-1]==target && nums[i]>target){
                    rightidx=i-1;
                }


            }
            idexlist[0]=leftidx;
            idexlist[1]=rightidx;
            return  idexlist;
        }
    public static void main(String[] args){
        SearchArray s=new SearchArray();
        int [] nums={5,7,7,8,8,10};
        int target=8;
        int [] idexlist= s.Searchbybinary(nums,target);
        System.out.println(idexlist);
    }


}
