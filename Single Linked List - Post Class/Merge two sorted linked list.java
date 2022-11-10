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
/*
below function is used to insert nodes in the linked list
public static Node insert111(Node head, int val) {
        if(head == null) {
            return new Node(val);
        } else {
            Node cur;
            cur = insert111(head.next, val);
            head.next = cur;
            return head;
        }
    }

*/
public static Node Merge (Node head1, Node head2){
//Enter your code here
    Node head = null;
    Node ans = head;
    while(head1 != null && head2 != null) {
        if(head1.val < head2.val) {
            head = insert111(head, head1.val);
            head1 = head1.next;
        }else {
            head = insert111(head, head2.val);
            head2 = head2.next;
        }
        // head = head.next;
    }
    while(head1 != null) {
        head = insert111(head, head1.val);
        head1 = head1.next;
        // head = head.next;
    }
    while(head2 != null) {
        head = insert111(head, head2.val);
        head2 = head2.next;
        // head = head.next;
    }
    return head;
}
