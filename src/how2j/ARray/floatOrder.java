package how2j.ARray;

public class floatOrder {
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
        for(int j=0;j<a.length;j++){
            for (int i=0;i<a.length-j-1;i++){
                if(a[i]>a[i+1]){
                    int temp=a[i+1];
                    a[i+1]=a[i];
                    a[i]=temp;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
