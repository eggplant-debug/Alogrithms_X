import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BruteCollinearPoints {
    private int N;
    private List<LineSegment> resultLine;

    public BruteCollinearPoints(Point[] points){
       /*
       points 为null
       points 有重复值时
       points 中有一值为null时
        */


        int num = points.length;

            if(points ==null || points.length<4){
            throw new IllegalArgumentException();
        }
        Point [] clone=new Point[points.length];
        ArrayList<Point> result=new ArrayList<>();
        for(int i =0;i< points.length;i++){
            if(result.contains(points[i]) || points[i]==null){
                throw new IllegalArgumentException();
            }
            result.add(points[i]);
            clone[i]=points[i];
        }
        resultLine=new ArrayList<>();
         /*
        如果clone内部类实现了compareto方法，则按照其方法来排序
         */
        Arrays.sort(clone,Point::compareTo);// 避免线段选在中间点，需提前验证,已验证，

        for(int i=0;i<num-3;i++){
            for(int j=i+1;i<num-2;j++){
                for(int q=j+1;q<num-1;q++){
                    for(int p=q+1;p<num;p++){
                        double k1=clone[i].slopeTo(clone[j]);
                        double k2=clone[j].slopeTo(clone[q]);
                        double k3=clone[q].slopeTo(clone[p]);
                        if(k1==k2 && k2==k3){
                            //找到了有四个点的线段
                            //找一个集合来存放这些线段
                            LineSegment l=new LineSegment(clone[i],clone[p]);
                            resultLine.add(l);
                            N++;
                        }
                    }
                }
            }
        }



        /*
        检查points的斜率是否相等，首位和其他位计算斜率，看是否相等
         */









    }
    public int  numberOfSegments(){
        return N;

    }
    public LineSegment[] segments() {
        /*
        维持一个数组，把所有的LineSegment放入，
        放入时，注意把首尾点放入即可，不要将中间点放入。每个LineSegment的形式，toString 之后，类似于 p->q
        注意去重
         */

        return resultLine.toArray(new LineSegment[numberOfSegments()]);
    }

    public static void main(String[] args) {
        // read the n points from a file
        In in = new In(args[0]);
        int n = in.readInt();
        Point[] points = new Point[n];

        for (int i = 0; i < n; i++) {
            int x = in.readInt();
            int y = in.readInt();
            points[i] = new Point(x, y);
        }

        // draw the points
        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(0, 32768);
        StdDraw.setYscale(0, 32768);

        for (Point p : points) {
            p.draw();
        }

        StdDraw.show();

        // print and draw the line segments
        BruteCollinearPoints collinear = new BruteCollinearPoints(points);

        for (LineSegment segment : collinear.segments()) {
            StdOut.println(segment);
            segment.draw();
        }

        StdDraw.show();
    }



}
