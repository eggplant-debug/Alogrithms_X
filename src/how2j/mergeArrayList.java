package how2j;

public class mergeArrayList {
    public static void main(String [] args){
        int [] a =new int[5];
        a[0]=(int)(Math.random()*100);
        a[1]=(int)(Math.random()*100);
        a[2]=(int)(Math.random()*100);
        a[3]=(int)(Math.random()*100);
        a[4]=(int)(Math.random()*100);

        System.out.println("数组中的各个随机数是");
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        int [] b =new int[5];
        b[0]=(int)(Math.random()*100);
        b[1]=(int)(Math.random()*100);
        b[2]=(int)(Math.random()*100);
        b[3]=(int)(Math.random()*100);
        b[4]=(int)(Math.random()*100);

        System.out.println("数组中的各个随机数是");
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        int[] c=new int[10];
        System.arraycopy(a,0,c,0,5);
        System.arraycopy(b,0,c,5,5);
        for (int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}
