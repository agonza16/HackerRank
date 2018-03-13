public static int getHeight(Node root){
    //Write your code here
      Node temp = root;
      int height = 0;
      
      if(temp == null)
      {
          return -1;
      }  
      else
      {
          
          return 1 + Math.max(getHeight(temp.left),getHeight(temp.right));
      }        
  }