import edu.princeton.cs.algs4.StdRandom;

public class testforRandom {

    public static void main(String[] args) {
        int N=10;
        int[] startArray=new int[N];
        int[] resultArray=new int[N];
        for(int i=0;i<N;i++){
            startArray[i]=i;
        }
        for(int i=0;i<N;i++){
            int seed = StdRandom.uniform(0, N-i );
            resultArray[i]=startArray[seed];
            startArray[seed]=startArray[N-1-i];
        }
        for(int i=0;i<resultArray.length;i++){
            System.out.println(resultArray[i]);
        }
    }

}
