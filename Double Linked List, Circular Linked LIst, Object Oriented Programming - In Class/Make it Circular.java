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

public static Node MakeCircular(Node head) {
//enter your code here
    Node temp = head;
    while(temp.next != null) {
        temp = temp.next;
    }
    temp.next = head;
    return head;
}
