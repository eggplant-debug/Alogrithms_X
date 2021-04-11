package how2j.ThreadLearn;
// 多线程，实现方法

//
public class testThread2 {
    public static void main(String [] args){
        Hero gareen =new Hero();
        gareen.name="盖伦";
        gareen.hp=616;
        gareen.damage=100;

        Hero teemo=new Hero();
        teemo.name="提莫";
        teemo.hp=300;
        teemo.damage=200;

        Hero bh=new Hero();
        bh.name="赏金猎人";
        bh.hp=700;
        bh.damage=65;

        Hero leesin=new Hero();
        leesin.name="盲僧";
        leesin.hp=350;
        leesin.damage=85;

        KillThread k1= new KillThread(gareen,teemo);
        k1.start();

        KillThread k2=new KillThread(bh,leesin);
        k2.start();

    }

}
