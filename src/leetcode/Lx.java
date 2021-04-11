package leetcode;
//x的平方根
public class Lx {
    public int mySqrt(int x) {
        int ansewer = 0;
        int left=0;
        int right=x;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid*mid<=x){
                ansewer=mid;
                left=mid+1;
            }
            else {
                right=mid-1;

            }

        }
        return ansewer;
    }
    public static void main(String[] args){
        Lx l= new Lx();
        System.out.println(l.mySqrt(1000));
    }
}
