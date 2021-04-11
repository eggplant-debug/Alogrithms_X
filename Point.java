import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;


import java.util.Arrays;
import java.util.Comparator;

public class Point implements Comparable<Point>{
    private int x_value;
    private int y_value;

    public Point(int x, int y){
        x_value=x;
        y_value=y;
    }

    public   void draw(){
        StdDraw.point(x_value,y_value);
    }                               // draws this point
    public   void drawTo(Point that){
        StdDraw.line(this.x_value,this.y_value,that.x_value,that.y_value);

    }                   // draws the line segment from this point to that point
    public String toString(){
        return "("+ x_value + ", " + y_value+ ")" ;
    }                           // string representation

    public  int compareTo(Point that){
        if(this.y_value<that.y_value || ((this.y_value== that.y_value) && this.x_value<that.x_value)) return -1;
        else if(this.y_value== that.y_value && this.x_value==that.x_value) return 0;
        else return 1;
    }     // compare two points by y-coordinates, breaking ties by x-coordinates
    public  double slopeTo(Point that){
        if ((this.x_value == that.x_value) && (this.y_value == that.y_value)) {
            return Double.NEGATIVE_INFINITY;
        } else if (this.x_value == that.x_value) {
            return Double.POSITIVE_INFINITY;
        } else if (this.y_value == that.y_value) {
            return 0;
        } else {
            return (that.y_value - this.y_value) / (double) (that.x_value - this.x_value);
        }


    }       // the slope between this point and that point



    private class Order implements Comparator<Point> {

       @Override
       public int compare(Point o1, Point o2) {
           if (slopeTo(o1) < slopeTo(o2)) {
               return -1;
           } else if (slopeTo(o1) > slopeTo(o2)) {
               return 1;
           } else {
               return 0;
           }
       }
   }



    public Comparator<Point> slopeOrder() {

        return new Order();


    }

    public static void main(String[] args) {
        Point p=new Point(1,1);
        Point [] p1=new Point[10];
        for(int i=0;i<p1.length;i++){
            int a= StdRandom.uniform(10);
            int b= StdRandom.uniform(10);
            Point p_r=new Point(a,b);
            p1[i]=p_r;
            System.out.println(a+" , "+b);
        }
        for(Point p3:p1){
            System.out.println(p3);
        }
        Arrays.sort(p1);

        System.out.println("--------------");
        for(Point p3:p1){

            System.out.print(p3);
        }

        System.out.println("--------------");
        Arrays.sort(p1,Point::compareTo);

        for(Point p3:p1){
            System.out.print(p3);
        }

    }


}
