package nowCoder;
//斐波那契数列，f(n)=f(n-1)+f(n-2);
//暴力解法
public class fibArray {
    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }

    }
    public static void main(String[] args){
        fibArray f=new fibArray();
        System.out.println(f.Fibonacci(4));
    }
}
