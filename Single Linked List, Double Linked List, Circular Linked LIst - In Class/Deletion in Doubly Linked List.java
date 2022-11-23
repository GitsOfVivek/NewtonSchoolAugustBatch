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
public static Node deleteElement(Node head,int k) {
//enter your code here
    if(head == null || head.next == null) {
        return null;
    }
    Node temp = head;
    int size = 0;
    while(temp != null) {
        size++;
        temp = temp.next;
    }
    if(size == k) {
        head = head.next;
        return head;
    }
    temp = head;
    int x = size-k;
    while(x-- > 1) {
        temp = temp.next;
    }
    temp.next = temp.next.next;
    return head;
}
