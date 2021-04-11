package leetcode.Array;

public class L495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int duringtime=0;
        if(timeSeries.length>1){
            duringtime=duration;
            for(int i=0;i<timeSeries.length-1;i++){
                if(timeSeries[i]+duration<=timeSeries[i+1]){
                    duringtime+=duration;
                }
                else{
                    int temp=timeSeries[i+1]-timeSeries[i];
                    duringtime+=temp;
                }
            }
        }
        else if(timeSeries.length==1){
            duringtime=duration;
        }
        else {
            duringtime=0;
        }
        return   duringtime;
    }

    public static void main(String[] args){
        L495 l=new L495();
        int[] timeSeries={1};
        int duration=10;
        System.out.println(l.findPoisonedDuration(timeSeries,duration));
    }
}
