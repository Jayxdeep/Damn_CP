import java.util.PriorityQueue;
public class MinHeap {
    private PriorityQueue<Integer> minHeap;
    public MinHeap(){
        minHeap=new PriorityQueue<>();
    }
    public void insert(int value){
        minHeap.add(value);
    }
    public int extractMin(){
        return minHeap.poll();
    }
    public int getMin(){
        return minHeap.peek();
    }

    public void display(){
        System.out.println("MinHeap: "+ minHeap);
    }
    public static void main(String[] args) {
        MinHeap heap=new MinHeap();
        heap.insert(10);
        heap.insert(20);
        heap.insert(15);
        heap.insert(40);
        heap.display();
        System.out.println("MIN ELEMENT: "+heap.extractMin());
        heap.display();
    }
}
