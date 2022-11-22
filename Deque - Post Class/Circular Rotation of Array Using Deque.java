static void circularRotate(Deque<Integer> deq, int d, int n)
{       
        d = d % n;
        for(int i = 0; i < d; i++) {
                deq.addFirst(deq.removeLast());
        }
        for(int i = 0; i < n; i++) {
                System.out.print(deq.removeFirst() + " ");
        }
 }
