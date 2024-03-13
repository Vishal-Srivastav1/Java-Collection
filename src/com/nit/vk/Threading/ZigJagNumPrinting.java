package com.nit.vk.Threading;
/*
	 * Approach: The goal is to determine the distance between the major columns and a step 
	 * value for the in-between columns in order to print the spaces until the string's 
	 * final character is reached. To solve this issue, adhere to the methods listed below:
	
	Determining a variable intervals 2*R-2 to store the gap between the major columns.
	Iterate in the range [0, R-1]using the variable i
	Initialize a variable steps interval-2*i to stock step values for each row.
	Iterate in the range [i, N-1]using the variable j, incrementing j by interval in each iteration,
	Print the character, S[j].
	If the value of step sprawl in the range [1, interval-1]and step+j<N, then print (interval-R-i) number of spaces, then print s[j+step] and finally print (i-1)
	Else print (interval-R)number of spaces.
	Print New Line after each iteration of the outer loop.

 */

// Java program for the above approach  
public class ZigJagNumPrinting{  
//Function to print any string  
// in zigzag fashion  
static void zigzag(String str, int rows) throws InterruptedException  
{  
    // Store the gap between the major columns  
    int interval = 2 * rows - 2;  
    // Traverse through rows  
    for(int i = 0; i < rows; i++)  
    {  
        // Store the step value for each row  
        int step = interval - 2 * i;  
        // Iterate in the range [1, N-1]  
        for(int j = i; j < str.length(); j = j + interval)  
        {     
            // Print the character  
            System.out.print(str.charAt(j));  
            if (step > 0 && step < interval &&  
                step + j < str.length())  
            {  
                // Print the spaces before the character  
                // str[j+step]  
                for(int k = 0; k < (interval - rows - i); k++)  
                    System.out.print(" ");  
                // Print the character  
                System.out.print(str.charAt(j + step));  
                // Print the spaces after the character  
                // after str[j+step]  
                for(int k = 0; k < i - 1; k++)  
                    System.out.print(" ");  
                Thread.sleep(300);
            }  
            else  
            {  
                // Print the spaces for the first and last rows  
                for(int k = 0; k < (interval - rows); k++)  
                    System.out.print(" ");  
            }  
        }  
        System.out.println();  
    }  
}  
public static void main(String args[])throws InterruptedException  
{     
    // Input given  
    String str = "123456789ABCDEFGHIJKLM" +  
            "NOPQRSTUVWXYZabcdefghi" +  
            "jklmnopqrstuvwxyz";  
    int rows = 9;  
    // Calling the function  
    zigzag(str, rows);  
}  
}  