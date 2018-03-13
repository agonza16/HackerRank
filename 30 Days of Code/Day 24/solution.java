    
    public static Node removeDuplicates(Node head) {
        //Write your code here
          Node temp  = head;
          
          while (temp.next != null)
          {
              if(temp.data == temp.next.data)
              {
                  if (temp.next.next != null)
                  {    
                      temp.next = temp.next.next;
                      
                  }    
                 else
                 {
                      temp.next = null;    
                 }
              } 
              else
              {
                  temp = temp.next;
              }
          }   
   
          return head;
      }  