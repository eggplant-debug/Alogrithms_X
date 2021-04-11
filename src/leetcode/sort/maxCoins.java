package leetcode.sort;

import java.util.Arrays;

public class maxCoins {
    //2,4,1,2,7,8
    //9,8,7,6,5,4,3,2,1
    public int maxcoins(int [] piles){
        Arrays.sort(piles);
        int length=piles.length;
        int rounds=length/3;
        int coins=0;
        int index=length-2;
        for(int i=0;i<rounds;i++){
            coins+=piles[index];
            index-=2;
        }
        return coins;

    }
    public static void main (String[] args){
        maxCoins m=new maxCoins();
        int [] nums;

    }

}
