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

public static int check(Node head) {
//enter your code here
    Node firstNode = head;
    while(head != null) {
        head = head.next;
        if(firstNode == head) {
            return 1;
        }
        if(head == null) {
            return 0;
        }
    }
    return -1;
}
