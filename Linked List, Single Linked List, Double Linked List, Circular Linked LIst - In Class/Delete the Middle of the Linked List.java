/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

public static Node deleteMiddleElement(Node head) {
		// return the head of the modified Linked List
    if(head.next == null) {
        return new Node(-1);
    }
    Node x = head;
    int size = 0;
    while(x != null) {
        x = x.next;
        size++;
    }
    int mid = (size)/2;
    Node copyOfHead = head;
    while(mid-- > 1) {
        head = head.next;
    }
    head.next = head.next.next;
    return copyOfHead;
}
