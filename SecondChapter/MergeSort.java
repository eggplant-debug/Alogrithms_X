//package SecondChapter;
//import edu.princeton.cs.algs4.*;
///*
//1.假设一个数组前半部分和后半部分是已经排好序的数组（排序由递归来完后）
//2.合并大的排序数组。 a.将原数组拷贝到另一个复制数组中，b.将排好的顺序重新装入原数组。c.在排序过程中遵循以下几条原则，1.左右两个指针比较，数组小的放入原数组中，原数组指针往后加一,放入的指针也加一，未放入的不动
//                                                                                                 2.如果两个指针代表的值相同，则放入左边的指针对应的值
//                                                                                                 3.如果有一边空了，那么另一边只需按顺序放入数组即可。
//3.
// */
//public class MergeSort {
//    private static void merge(Comparable[] a,Comparable[] aux, int lo, int mid, int hi){
//        assert isSorted(a,lo,mid);
//        assert isSorted(a,mid+1,hi);
//
//       for(int k=lo;k<=hi;k++){
//           aux[k]=a[k];
//       }    //复制数组
//
//       int i=lo, j=mid+1;
//       for(int k=lo;k<=hi;k++)// 相当于是对原数组遍历一遍，扫出每一个空要填的值
//       {
//           if(i>mid){
//               a[k]=aux[j++];
//           }
//           else if(j>hi){
//               a[k]=aux[i++];
//           else if (less(aux[i],aux[j])) {a[k]=aux[j++];
//               }
//           else {
//               a[k]=aux[i++];
//               }
//       }
//
//       }
//       assert isSorted(a,lo,hi);
//    }
//    private static void sort(Comparable[] a,Comparable[] aux,int lo,int hi){
//        if(hi<=lo) return;
//        int mid = lo+(hi-lo)/2;
//        sort(a,aux,lo,mid);   //给前半部分排序
//        sort(a,aux,mid+1,hi);//给后半部分排序
//        merge(a,aux,lo,mid,hi);//merge他们
//    }
//
//    /*
//    分治法雏形，归并算法性能差主要原因是把小数组也放进了私有sort方法中
//     */
//
//    public static void sort(Comparable[] a){
//        Comparable[] aux=new Comparable[a.length];
//        sort(a,aux,0,a.length-1);
//    }
//    //创建辅助数组的任务用这个对外的sort来完成，不要将其放入到那个私有的sort方法中，因为那样会创建更多的不必要的小数组影响性能
//    //实际上如果使用上述来创建aux数组的话，其实就只创建一次，但是如果使用私有的方法，需创建无数次。
//
//    private static boolean isSorted(Comparable[] a, int lo, int hi) {
//    }
//}
