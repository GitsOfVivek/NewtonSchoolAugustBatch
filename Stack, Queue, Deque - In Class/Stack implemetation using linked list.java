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

 Node top = null;
public void push(int x){
//enter your code here
    Node temp = new Node(x);
    temp.next = top;
    top = temp;
}

public void pop(){
//enter your code here
    if(top != null) {
        top = top.next;
    }
}

public void top(){
//enter your code here
    if(top == null) {
        System.out.println(0);
    }else {
        System.out.println(top.val);
    }
}
