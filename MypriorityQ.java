public class MypriorityQ {
    private int[] arr=new int[100];
    private int size=0;
//O(log(n))
    public void add(int element){
        arr[size++]=element;
        Heaps.adjustUp(arr,size-1);
    }
//O(log(n))
    public int poll(){
        int e=arr[0];
        arr[0]=arr[--size];
        Heaps.Heapify(arr,size,0);
        return e;
    }
//O(log(1))
    public int peek(){
        return arr[0];
    }
}
