public static  Node insert(Node head,int data) {
    //Complete this method
    if (head == null)
    {
        Node newNode = new Node(data);
        head = newNode;
        
    }    
    else
    {
       Node temp = head;
        
        while ( temp.next != null)
        {
            temp = temp.next;    
        }   
        Node newNode = new Node(data);
        temp.next = newNode;
    }
   return head; 
}