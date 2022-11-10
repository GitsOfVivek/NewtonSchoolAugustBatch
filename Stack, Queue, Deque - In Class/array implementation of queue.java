/*

  class Queue{ 
    static final int MAX = 10000; 
    int rear=0,front=0; 
    int a[] = new int[MAX]; 
}
   int rear=0,front=0; //pointer to rear and front
    int a[] //array that contain elements of queue
*/ 
public static void enqueue(int x, int k)
    {
      if(rear == k) {
        System.out.println("Queue is full");
      }else {
        a[rear] = x;
        rear++;
      }
    }


   public static  void dequeue()
    {
     if(front == rear) {
       System.out.println("Queue is empty");
       return;
     }
     // i cane use loop too. 
     for(int i = 0; i < rear; i++) {
       a[i] = a[i+1];
     }
     rear--;
      
    }

    public static void displayfront()
    {
      if(front == rear) {
        System.out.println("Queue is empty");
        return;
      }
      System.out.println(a[front]);
    }
}
