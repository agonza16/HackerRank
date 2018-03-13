//Write your code here
class Calculator implements AdvancedArithmetic{
    
    public int divisorSum( int n)
    {
        int sum = 0;
        
        for (int count = 1; count <= n; count++)
        {
           if (n%count== 0)
           {
               sum += count;
           }    
           
        }    
        
        return sum;
    }
    
}