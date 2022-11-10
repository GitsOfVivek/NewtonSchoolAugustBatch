static Node addNumber(Node first, Node second)  
 {     Node res = null; // res is head node of the resultant list 
         Node prev = null; 
         Node temp = null; 
         int carry = 0, sum; 
   
         while (first != null || second != null) //while both lists exist 
         { 
             sum = carry + (first != null ? first.data : 0) 
                     + (second != null ? second.data : 0); 
   
             carry = (sum >= 10) ? 1 : 0; 
   
             sum = sum % 10; 
   
             temp = new Node(sum); 
   
 
             if (res == null) { 
                 res = temp; 
             } else // If this is not the first node then connect it to the rest. 
             { 
                 prev.next = temp; 
             } 
   
             prev = temp; 
   
             if (first != null) { 
                 first = first.next; 
             } 
             if (second != null) { 
                 second = second.next; 
             } 
         } 
   
         if (carry > 0) { 
             temp.next = new Node(carry); 
         } 
   
         // return head of the resultant list 
         return res; 
 }
