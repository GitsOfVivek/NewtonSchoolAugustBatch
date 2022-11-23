/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/
static public Node moveZeroes(Node head)
{
       // Your code here
    Node temp = head;
    while(temp.next != null) {
        if(temp.next.data == 0) {
            temp.next = temp.next.next; // deleted this node
            Node newNode = new Node(0); // add this at first
            newNode.next = head;
            head = newNode;
        }else {
            temp = temp.next;
        }
    }
    return head;
}
