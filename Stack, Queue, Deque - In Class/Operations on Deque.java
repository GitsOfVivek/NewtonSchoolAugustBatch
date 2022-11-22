static void push_back_pb(Deque<Integer> dq, int x)
{
         //Your code
         dq.addLast(x);
 }
 static void push_front_pf(Deque<Integer> dq, int x)
 {
       dq.addFirst(x);

 }
 static void pop_back_ppb(Deque<Integer> dq)
 {
        // Your code here
        if(dq.size() != 0) {
              dq.removeLast();
        }

 }
static int front_dq(Deque<Integer> dq)
{
         // Your code here
         if(dq.size() != 0) {
              return dq.peekFirst();
        }
        return -1;
}
