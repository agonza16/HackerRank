import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner myScanner = new Scanner(System.in);
        int numberOfValues = myScanner.nextInt();
        int[] array = new int[numberOfValues];
        
        for (int c = 0; c < numberOfValues; c++)
        {
            array[c] = myScanner.nextInt();    
        }   
        
        for( int counter = 0; counter < numberOfValues; counter ++)
        {
            int instances = 0;
            
            if (array[counter] == 1){System.out.println("Not prime");}
            else if(array[counter] == 2){System.out.println("Prime");}
            else if (array[counter]%2 == 0 && array[counter] != 2){System.out.println("Not prime");}
            else
            {
                for (int x = 2; x <= (int)Math.sqrt(array[counter]); x++)
                {
                    if (array[counter]%x == 0)
                    {
                        instances++;
                    }    
                }  
            
                if ( instances == 0)
                {
                    System.out.println("Prime");
                } 
                else
                {
                    System.out.println("Not prime");
                }    
            }  
    }
    }
}