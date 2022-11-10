/*
// information about the class Nodeclass Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/


public static Node ReverseLinkedList(Node head) {
		// return the head of the modified linked list
        Node d = null;
        while(head != null) {
            Node temp = head.next;
            head.next = d;
            d = head;
            head = temp;
        }
        return d;
    }
