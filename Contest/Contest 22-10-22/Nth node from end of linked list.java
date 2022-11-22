/*
// information about the class Node
class Node
{
    int data;
    Node next;
    Node(int d) 
    {
        data = d; 
        next = null;
    }
}
*/
static int getNthFromLast(Node head, int n)
{

       // Your code here
    Node temp = head;
    while(n-->1) {
        temp = temp.next;
    }
    while(temp.next != null) {
        head = head.next;
        temp = temp.next;
    }
    return head.data;
}
