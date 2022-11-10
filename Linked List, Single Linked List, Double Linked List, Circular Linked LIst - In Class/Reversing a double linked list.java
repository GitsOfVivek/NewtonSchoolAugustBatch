/*
class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/
  public static Node Reverse(Node head) {
//complete this function
  Node last = head;
    while(last.next != null) {
      last = last.next;
    }
    while(last != null) {
      System.out.print(last.val +  " ");
      last = last.prev;
    }
    return last;
}
