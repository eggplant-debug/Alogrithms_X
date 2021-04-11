package nowCoder.sort;
// 归并排序算法，算法复杂度O(N*logN),运用master公式求复杂度，因为是递归算法
public class mergesort {
    public static void Mergesort(int [] arr){
        if(arr==null||arr.length<2){
            return;
        }
        process(arr,0,arr.length-1);

    }
    public static void process(int[] arr,int L,int R){
        if(L==R){
            return;
        }
        int mid=L+((L-R)>>1);
        process(arr,L,mid);
        process(arr,mid+1,R);
        merge(arr,L,mid,R);
    }
    public static void merge(int[] arr,int L,int mid, int R){
        int[] help=new int[R-L+1];
        int i=0;
        int p1=L;
        int p2=mid+1;
        while(p1<=mid&p2<=R){
            help[i++]=arr[p1]<=arr[p2]?arr[p1++]:arr[p2++];//指针左移的最好示范，其中要明白i++是先赋值再自增的
        }
        while(p1<=mid){
            help[i++]=arr[p1++];

        }
        while(p2<=R){
            help[i++]=arr[p2++];
        }
        for(int j=0;j<arr.length;j++){
            arr[L+j]=help[j];
        }
    }
}
