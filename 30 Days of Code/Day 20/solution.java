import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int numberOfSwaps = 0;
        
        for (int count = 0 ; count < a.length; count++)
        {
            for (int innerCount = 0 ; innerCount < a.length-1; innerCount++)
            {
                if(a[innerCount] > a[innerCount + 1])
                {
                    int temp = a[innerCount];
                    a[innerCount] = a[innerCount+1];
                    a[innerCount + 1] = temp;
                    numberOfSwaps++;
                }    
                
            }    
        }   
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }
}
