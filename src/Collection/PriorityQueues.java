package Collection;
import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String args[])
    {
        PriorityQueue<Integer> Queue = new PriorityQueue<Integer>();
        for(int i=10;i>0;i--){
           Queue.add(i);//9,8,7,6,5,4,3,2,1.
        }
        //queue=1=head,2,3,4,5,6,7,8,9.
        //peeking = getting the head of array.
        //polling=removing head of the array.
        System.out.println("list is ");
        for(int i=1;i<10;i++){
            System.out.println(i);
        }
        System.out.println(Queue.peek());
        Queue.poll();
        System.out.println(Queue.peek());
        System.out.println("queue size is "+Queue.size());
    }
}
