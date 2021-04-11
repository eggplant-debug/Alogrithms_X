package nowCoder;

public class FindNumInTwoArrays {
    public boolean Find(int target, int [][] array) {
        for(int col=0;col<array.length;col++){
            for(int row=0;row<array[0].length;row++){
                if(array[col][row]==target){
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args){
        int [][] a= new int[5][4];
        System.out.println(a.length);
        System.out.println(a[0].length);

    }
}
