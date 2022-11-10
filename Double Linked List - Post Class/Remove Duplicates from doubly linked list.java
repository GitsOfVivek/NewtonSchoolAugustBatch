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

public static Node deleteDuplicates(Node head) {
//complete this function
  Node temp = head.next;
  while(temp != null) {
    if(temp.val == temp.prev.val) {
      if(temp.next != null) {
        Node prev = temp.prev;
        prev.next = temp.next;
        temp.next.prev = prev;
      }else if(temp.next == null) {
        temp.prev.next = null;
      }
    }
    temp = temp.next;
  }
  return head;
}
