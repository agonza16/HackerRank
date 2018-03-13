//Write your code here

class Calculator{
    int p;
    int n;
    
    public int power(int newN, int newP) throws Exception
    {
        if (newN < 0 || newP < 0)
        {
            throw new Exception("n and p should be non-negative");
        }
        else
        {   
            p = newP;
            n = newN;    
             return (int) Math.pow(n, p);
        }
       // return (int) Math.pow(n, p);
    }
        
    
}