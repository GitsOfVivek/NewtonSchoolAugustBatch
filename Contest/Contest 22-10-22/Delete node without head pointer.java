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

public static void deleteNode(Node D) {
//Enter your code here
        D.val = D.next.val;
        if(D.next.next == null) {
            D.next = null;
        }else {
            D.next = D.next.next;
        }
}
