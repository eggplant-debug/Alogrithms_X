package how2j;

public class reverseList {
    public  static  void main(String [] args){
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
        System.out.println("逆转数组");
        int [] b =new int[5];
        for(int i=0;i<a.length;i++){
            b[b.length-i-1]=a[i];
            System.out.println(b[b.length-i-1]);
//            System.out.println(a[i]);
        }
}
}
