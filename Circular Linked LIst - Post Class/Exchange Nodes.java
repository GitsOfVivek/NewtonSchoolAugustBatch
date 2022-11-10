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
public static Node exchangeNodes(Node head) {
//Enter your code here
Node ptr=head;
Node previ=null;
while(ptr.next!=head){
     previ=ptr;
    ptr=ptr.next;
}
Node ptr2=ptr;
previ.next=head;
ptr2.next=head.next;
head=ptr2;
return head;
}
