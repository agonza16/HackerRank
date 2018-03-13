import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(obtainMaxTotal(arr));
    }
    
    public static int obtainMaxTotal(int arr[][])
    {
        int totalMax = -1000;
        
        for(int counter = 0; counter <= 3; counter++)
        {
            int tempTotal = 0;
            for(int count = 0; count<= 3; count++)
            {
                tempTotal = arr[counter][count]+arr[counter][count+1]+arr[counter][count+2]+arr[counter+1][count+1]+
                    arr[counter+2][count]+arr[counter+2][count+1]+arr[counter+2][count+2];
                
                
                if (tempTotal > totalMax)
                 {
                totalMax = tempTotal;
                 }  
            }  
          
        }
        
        return totalMax;
    }
}
