import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner myScanner = new Scanner(System.in);
        int[] dayArray = new int[6];
        for(int count = 0; count < 6; count++)
        {
            dayArray[count] = myScanner.nextInt();
        }    
        
        if (dayArray[5] == dayArray[2]) // if expected year is >= to returned year
        {
            if (dayArray[4] == dayArray[1]) // returned within sam year and within time frame for month
            {
                if (dayArray[3] >= dayArray[0])
                {
                    System.out.println("0");
                }  
                else // returned after due day but within same month and year
                {
                    System.out.println(15 * (dayArray[0] - dayArray[3]));
                }    
            }
            else if (dayArray[4] > dayArray[1]) // returned within same year and before month due
            {
                System.out.println("0");
            }    
            else // month returned was after due month but within correct year
            {
                System.out.println(500*(dayArray[1] - dayArray[4]));
            }    
        }  
        else if (dayArray[5] > dayArray[2]) // returned before the year it was due
        {
            System.out.println("0");
        }
        else // returned year is greater than expected year
        {
            System.out.println("10000");
        }    
    }
}