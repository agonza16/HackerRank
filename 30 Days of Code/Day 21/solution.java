    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    
    // Write your code here
    public<T>void printArray(T[] array)
    {
        for(int count = 0; count < array.length; count++)
        {
            System.out.println(array[count]);
        }    
    }