/*

 class Node 
{  
    int data;  
    Node next;  
    Node(int x)  
    {  
        data = x;  
        next = null;  
    }  
};
*/
static Node deleteK(Node head, int k){
//Enter your code here
Node ptr=head;
while(true){
    Node ptr2=head;
    while(ptr2.next!=head){
        System.out.print(ptr2.data+"->");
        ptr2=ptr2.next;
    }
    System.out.print(ptr2.data+"->");
    System.out.println(ptr2.next.data);
    if (ptr.next==ptr) break;
    int count=k-1;
    while(count-->0){
        ptr=ptr.next;
    }
    if(ptr.next==head){
        ptr.next=head.next;
        head=head.next;
    }
    else if(ptr.next.next==head){
        ptr.next=head;
    }
    else{
        ptr.next=ptr.next.next;
    }
    
}
return head;
}
