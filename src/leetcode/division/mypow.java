package leetcode.division;
//计算平方数
public class mypow {
    public double mypow(double x, int n){
        if(n==0){
            return 1;
        }
        else if(n==1){
            return x;
        }
        else if(n==-1){
            return 1/x;
        }
        double half=mypow(x,n/2);
        double rest=mypow(x,n%2);
        return half*half*rest;
    }
    public static void main(String[] args){
        int n =10;
        double x=2.000;
        mypow m=new mypow();
        double y=m.mypow(x,n);
        System.out.println(y);
    }
}
