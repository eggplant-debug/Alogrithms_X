package how2j.Stringbuffer;

public class MyStringbuffer implements IStringBuffer{
    int capacity=16;
    int length=0;
    char [] value;
    public MyStringbuffer(){
        value=new char[capacity];
    }
    //带参数构造方法
    public MyStringbuffer(String str){
        //稍微修改一下
        this();
        if(null == str){
            return;
        }
        if(capacity<str.length()){
            capacity=str.length()*2;//类似于ArrayList的resize
        }


        if(capacity>= str.length()){
            System.arraycopy(str.toCharArray(),0,value,0,str.length());
        }

        length= str.length();

    }


    @Override
    //*增加一大串东西在末尾
    public void append(String str) {
        //相当于在最后一个位置上插入字符
           insert(length,str);
    }

    @Override
    public void append(char c) {
       /*
       由于insert 只接受了String类型的参数
        */
       insert(length,String.valueOf(c));
    }

    @Override
    public void insert(int pos, char b) {
       insert(pos,String.valueOf(b));
    }

    @Override
    /*
    这种情况最复杂，实现这一种，可以应用到其他的方法上
     */
    public void insert(int pos, String b) {
        if(pos<0) return;
        if(pos>length) return;
        if(null==b) return;
        /*
        准备数组
         */
        while(length+b.length()>capacity){ //可能存在一次性插入较大的情况
            capacity=(int)((length+b.length())*1.5f);// 二倍或许也可以，
            char[] newValue=new char[capacity];
            System.arraycopy(value,0,newValue,0,length);
            value=newValue;
        }
        char[] cs =b.toCharArray();
        //把已存在的数据往后移
        System.arraycopy(value,pos,value,pos+cs.length,length-pos);
        System.arraycopy(cs,0,value,pos,cs.length);
        length=length+cs.length;
    }

    @Override
    public void delete(int start) {
        delete(start,length);

    }

    @Override
    public void delete(int start, int end) {
         if(start<0 || end<0 ){
             return;
         }
         if(start>length ||end>length){
             return;
         }
         if(start>=end){
             return;
         }
         System.arraycopy(value,end,value,start,length);
         length-=end-start;

    }

    @Override
    public void reverse() {
        /*
        反转字符串
         */
        for(int i=0;i<length/2;i++){
            char temp=value[i];
            value[i]=value[length-i-1];
            value[length-i-1]=temp;
        }
        /*
        可以涵盖所有情况
       
         */

    }
    public String toString(){
        char[] realValue=new char[length];
        System.arraycopy(value,0,realValue,0,length);
        return new String(realValue);
    }

    @Override
    public int length() {
        return length;
    }

    public static void main(String[] args) {
        MyStringbuffer m=new MyStringbuffer("sadbsadbas");
        m.append("km");
        System.out.print(m); // 隐藏的调用toString方法
    }
}
