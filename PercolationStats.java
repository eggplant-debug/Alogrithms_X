import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.StdIn;



public class PercolationStats {
    private int T;
    private double [] PercolateOpenNumbers;
    private double stdmean;
    private double stddev;
    private void validate(int n ,int trials){
        if(n<=0 || trials<=0){
            throw new IllegalArgumentException();
        }
    }
    //
    public PercolationStats(int n, int trials) {

        validate(n,trials);
        //todo 校验n 和 trials
        T = trials;// 代表做多少次实验
        PercolateOpenNumbers = new double[T];


        //这里的随机算法很关键，考虑了实现非重复随机的方式
        //这里是随机取数，然后打开任意一个site

        for(int t=0;t<T;t++){
            Percolation p = new Percolation(n);
            int[] resultArray = new int[n * n];
            int[] startArray = new int[n * n];
            for (int i = 0; i < startArray.length; i++) {
                startArray[i] = i;
            }
            for (int i = 0; i < n * n; i++) {
                int seed = StdRandom.uniform(0, startArray.length-i );
                resultArray[i] = startArray[seed];//这个是双随机出来的数，但还是要经过转换变成col,row

                int row =(resultArray[i] /n )+1;
                int col =(resultArray[i] %n )+1;

                startArray[seed] = startArray[startArray.length - i - 1];

                p.open(row,col);


                if(p.percolates()){
                    PercolateOpenNumbers[t]=p.numberOfOpenSites()/((double)n*(double)n);
                    break;
                }
            }

        }
        stdmean=StdStats.mean(PercolateOpenNumbers);
        stddev=StdStats.stddev(PercolateOpenNumbers);

    }

    // sample mean of percolation threshold
    public double mean() {
        return stdmean;
    }

    // sample standard deviation of percolation threshold
    public double stddev() {
        return stddev;
    }

    // low endpoint of 95% confidence interval
    public double confidenceLo() {
        return mean() - 1.96 * stddev() / (Math.sqrt(T));
    }

    // high endpoint of 95% confidence interval
    public double confidenceHi() {
        return mean() + 1.96 * stddev() / (Math.sqrt(T));
    }

    // test client (see below)
    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        int trials=Integer.parseInt(args[1]);
        PercolationStats p =new PercolationStats(n,trials);
        System.out.println("mean                       ="+p.mean());
        System.out.println("stddev                     ="+p.stddev());
        System.out.println("95% confidence Interval = "+"["+p.confidenceLo()+", "+p.confidenceHi()+"]");
    }

}
