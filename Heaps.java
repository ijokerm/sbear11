import java.util.Arrays;

public class Heaps {
    //时间复杂度O（log（n））向下堆化
    public static void Heapify(int[] array,int size,int index){

        while(true) {
            /**
             * 前提除index 和他的孩子外 其他已经满足堆的性质
             * 经过堆化
             * 判断要调整的是否是叶子节点
             */
            int left = 2 * index + 1;
            if (left >= size) {
                return;
            }
            //叶子结点 直接返回
            int max = left;
            if (left + 1 < size) {
                if (array[left + 1] > array[left]) {
                    max = left + 1;
                }
            }
            //将<=改成>=即可以是调整成一个大堆(向下调整)
            if(array[index]>=array[max]){
                return;
               }
                swap(array,index,max);
                index=max;
        }
    }
    public static void swap(int[] array,int i,int j){
        int t =array[i];
        array[i]=array[j];
        array[j]=t;

    }
    //准确的结果是O（n）建堆
    public static void createHeap(int[]array,int size){
        //从最后一个非叶子结点向下调整
        //size-1 为最后一个叶子结点的下标
        //根据公式 已知孩子结点求双亲结点就是 (child-1)/2-->(size-2)/2
        for(int i=(size-2)/2;i>=0;i--){
            Heapify(array,size,i);
        }
    }
//向上调整
    public static void adjustUp(int[] array,int index){
        while(index>0) {
            int p = (index - 1) / 2;
            if(array[p]>array[index]){
                return;
            }
            swap(array,p,index);
            }
    }

    public static void createMin(int[] array,int size){
        //原理同上述创建结点（从最后一个非叶子结点开始）
        for(int i=(size-2)/2;i>=0;i--){
        heapMin(array,size,i);
        }
    }
    public static void heapMin(int[] array,int size,int index){
        while(true){
            int left=2*index+1;
            if(index>size){return;}
            if(index+1<size){
                int min=left;
              if(array[left]>array[left+1]){
                  min=left+1;
              }
              if(array[min]>array[index]){
                  return;
              }
                swap(array,index,min);
            }
        }


    }




    public static void main(String[] args) {
        int []arr={ 27,15,19,18,28,34,65,49,25,37};

        System.out.println(Arrays.toString(arr));
        int []arr2={-1, 8, 4, 6, 7, 2, 3, 1, 0};
        Heapify(arr2,arr2.length,0);
        System.out.println(Arrays.toString(arr2));
        adjustUp(arr2,0);
        System.out.println(Arrays.toString(arr2));


    }



}
