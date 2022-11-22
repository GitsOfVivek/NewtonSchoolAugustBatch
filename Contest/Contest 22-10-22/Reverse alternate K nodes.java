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
 public static Node ReverseAlternateK(Node head,int k){
//enter your code here
Node temp = head;
Node next;
Node prev = null;
int count = 0;
while(temp != null && count < k) {
    next = temp.next;
    temp.next = prev;
    prev = temp;
    temp = next;
    count++;
}
if(head != null) {
    head.next = temp;
}
count = 0;
while(count < k-1 && temp != null) {
    temp = temp.next;
    count++;
}
if(temp != null) {
    temp.next = ReverseAlternateK(temp.next, k);
}
return prev;
}
