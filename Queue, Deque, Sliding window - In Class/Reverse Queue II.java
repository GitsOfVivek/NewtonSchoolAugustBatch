import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

//  3 2 1 4 5    - Q
// .    - q

//   3 2 1 4 5

// 1 2 3
// 1=x


// revq(1 2 3)  
//                                                    q= 3 2 1
class Main {

    public static void reverseQueue(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int x=q.remove();
        reverseQueue(q);
        q.add(x);
    }

    public static void reverseQueueKFirstElement(Queue<Integer> Q,int k){
        int n=Q.size();
        Queue<Integer> q=new LinkedList<Integer>();

        for(int i=0;i<k;i++){
            q.add(Q.remove());
        }

        reverseQueue(q);

        for(int i=0;i<k;i++){
            Q.add(q.remove());
        }

        for(int i=0;i<n-k;i++){
            Q.add(Q.remove());
        }

    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// size of queue
        int k=sc.nextInt();// first k elements to be reversed

        Queue<Integer> queue=new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            queue.add(sc.nextInt()); // n elements into the queue
        }

        reverseQueueKFirstElement(queue,k);
        // reverse first k elements of queue

        for(int i=0;i<n;i++){
            System.out.print(queue.remove()+" ");
        }

    }
}
