package how2j.ThreadLearn;

public class testThread {
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

        while(!teemo.isDead()){
            gareen.attackHero(teemo);
        }
        while(!leesin.isDead()){
            bh.attackHero(leesin);
        }

    }

}
