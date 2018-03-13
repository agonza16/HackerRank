	// Add your code here
    Difference(int[] a){
        elements = a;
    }
    
   public void computeDifference()
   {
       int max = elements[0];
       int min = elements[0];
        for (int count = 1; count < elements.length; count++)
        {
            if(max < elements[count])
            {
                max = elements[count];    
            }
            if(min > elements[count])
            {
                min = elements[count];
            }
        }
       
       maximumDifference = max - min;
   }