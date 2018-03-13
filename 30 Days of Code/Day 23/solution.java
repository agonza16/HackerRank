static void levelOrder(Node root){
    //Write your code here
    Node temp = root;
      
    if (temp == null)
    {
        System.out.println("tree is empty");
    }
    else
    {
      Queue<Node> myQueue = new LinkedList<Node>();
      myQueue.add(temp); 
        
      while (myQueue.peek() != null)  
      {
          Node tempNode = myQueue.remove();  
          System.out.print(tempNode.data + " ");  
          
          if(tempNode.left != null){myQueue.add(tempNode.left);}
          if(tempNode.right != null){myQueue.add(tempNode.right);}
          
      } 
    }   
  }