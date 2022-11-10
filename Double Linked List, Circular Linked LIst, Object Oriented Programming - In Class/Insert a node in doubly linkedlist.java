/*
 
 class Node {
     Node next;
     Node prev;
     int val;
 
     Node(int val) {
         this.val = val;
         next = null;
         prev = null;
     }
 }
 */
 
 
 //.       head
 //.   <null- 1-. -2-. -3 <-> 4 <-> 10 ->null
 //c                          b    -p
 //c              b    -p           b         p
 //c.    b    -p  
 //. 5 12
 
 
 //1 3 4 5 10
 
 public static Node insertnew(Node head,int k) {  
     // create new Node
     Node newNode=new Node(k); //   [null,k,null]
 
     if(head==null){
        head=newNode;
        return head; 
     }
 
     Node ptr=head;
     Node behind =null;
     while(ptr!=null){
         if(ptr.val<k){
             behind=ptr;
             ptr=ptr.next;
         }
         else{
             break;
         }
     }
 
     if(ptr==head){
         // insert it at the starting
          newNode.next=head;  // - next
          head.prev=newNode;  // - prev
          head=newNode;      //  - head
          return head;
     }
 
     if(ptr!=null){
         // insert in middle behind ptr
         newNode.next=ptr;
         newNode.prev=ptr.prev;
         ptr.prev=newNode;
         newNode.prev.next=newNode;
         return head;
 
     }
     else{
         // inserting at end
         behind.next=newNode;
         newNode.prev=behind;
         return head;
     }
 
     }
