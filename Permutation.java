import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class Permutation {
    public static void main(String[] args) {
        int num= Integer.parseInt(args[0]);
        RandomizedQueue<String> a = new RandomizedQueue<String>();

        while(!StdIn.isEmpty()){
            a.enqueue(StdIn.readString());
        }
        for(int i=0;i<num;i++){
            System.out.println(a.dequeue());
        }

}
}
