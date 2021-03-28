import java.util.Iterator;
import java.util.NoSuchElementException;
import edu.princeton.cs.algs4.StdRandom;
//要实现Iterator 类，必须实现iterator方法
/*
RandomizeQueue与普通Queue的区别在于 ， 它取出的队列一般是从队列中随机取出

不能使用linkedlist和ArrayList
 */


public class RandomizedQueue<Item> implements Iterable<Item> {
    private Item [] a;
    private int size;
    private void resize(int max){
        //由于不能进行 类似 Item [] temp=new Item [max] 的 “泛型”数组的操作，所以必须使用这种强制转换，父类转为子类
        /*
        知识点
        1.强制转换
        2.父类，子类，继承
        3.泛型
         */
        Item [] temp=(Item [])new Object [max];
        for(int i=0;i<size;i++){
            temp[i]=a[i];
        }
        a=temp;
    }
    // construct an empty randomized queue
    /*
    考虑维护一个用于专门筛选随机选取的队列。
     */
    public  RandomizedQueue(){
        a=(Item []) new Object[1];
        size=0;
    }

    // is the randomized queue empty?
    public boolean isEmpty(){
        return size==0;
    }

    // return the number of items on the randomized queue
    public int size(){
        return size;
    }

    // add the item
    public void enqueue(Item item){
        if(item==null){
            throw new IllegalArgumentException();
        }
        if(size==a.length){
            resize(2*size);

        }
        a[size++]=item;

    }

    // remove and return a random item
    // 不能在已抽到的数中抽取,随机数取值范围应在0，size之间
    /* 随机取索引，取完索引后立即

     */
    public Item dequeue(){
        if(this.isEmpty()){
            throw new NoSuchElementException();
        }
       int i =StdRandom.uniform(0,size); // 左闭右开区间，注意，此时a[size]是可能越界的
        /*
        如何运用自如地在数组中取不重复地随机数
         */
       Item item =a [i];//取数赋值给item,
       a[i]=a[--size];//将被取到的数和数组末尾调换位置
       a[size]=null;//将数组末尾的值赋值为null,当做已被取到，且下回取数时，不会取到末尾数，这里用a[size]为何不会越界，因为之前执行过--size操作
       if(0<size && size==a.length/4) resize(a.length/2);
       return item;

    }

    // return a random item (but do not remove it)
    public Item sample(){
        if(isEmpty()) throw new NoSuchElementException();
        return a[StdRandom.uniform(0,size)];
    }

    // 要求返回 乱序的 独立迭代器，所以要重新打乱并赋值
    @Override
    public Iterator<Item> iterator() {
        return new RandomizeQueueIterator();
    }
    private class RandomizeQueueIterator implements Iterator<Item>{
        private Item[] aaray;
        private int N;
        public RandomizeQueueIterator(){
            aaray=(Item []) new Object [size];
            for(int i=0;i<size;i++){
                aaray[i]=a[i];
            }
            StdRandom.shuffle(aaray);
        }

        @Override
        public boolean hasNext() {
            return size>N;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override
        public Item next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            return aaray[N++];
        }
    }

    public static void main(String[] args) {
        RandomizedQueue r=new RandomizedQueue();
        r.enqueue(4);
        r.dequeue();
        Iterator i=r.iterator();
        i.hasNext();
        i.next();

    }
}
