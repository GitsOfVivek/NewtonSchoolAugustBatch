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

public static Node Insertion(Node head, int K){
//Enter your code here
    Node temp = head;
    while(temp.next != head) {
        temp = temp.next;
    }
    Node newNode = new Node(K);
    newNode.next = head;
    temp.next = newNode;
    return head;

}
