/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg152d;

/**
 * Program name: Summing Some Numbers
 * @author Noah Miller Johnson
 * Date: 10/05/15
 * Description: Find the sum and average or a series using a do while loop.
 * Compiler: Java 8
 * What I learned: How to format a do while loop.
 * Platform: Windows 7
 * Difficulties: Getting the loop to start and end at the correct time.
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Declare Scanner
        
        //Get input values
        System.out.println("Enter Starting Value:  "); 
        int initial = scan.nextInt();
        System.out.println("Enter Ending Value :  ");
        int last = scan.nextInt();
        System.out.println("\n");
        
        //Initialize variables
        int sum = 0;
        int counting = initial;
        
        do { //Force the loops to always execute at least once
            System.out.println(counting); //Display each of the numbers
            
            //Calculations
            sum+=counting;
            counting++;
        }while(counting<=last); //Summ up the numbers less than or equal to the last number.
        
        //Output results
        System.out.println("sum of the numbers "+initial+"-"+last
                +" is "+sum);
        System.out.println("The average of the numbers "+initial+"-"+last+" is "+(last+initial)/2.0);
    }
    
}
/*Sample Output:
Enter Starting Value:  
5
Enter Ending Value :  
8


5
6
7
8
sum of the numbers 5-8 is 26
The average of the numbers 5-8 is 6.5

Test Case 1:
Enter Starting Value:  
7
Enter Ending Value :  
19


7
8
9
10
11
12
13
14
15
16
17
18
19
sum of the numbers 7-19 is 169
The average of the numbers 7-19 is 13.0

Test Case 2:
Enter Starting Value:  
7
Enter Ending Value :  
7


7
sum of the numbers 7-7 is 7
The average of the numbers 7-7 is 7.0

Test Case 3:
Enter Starting Value:  
-2
Enter Ending Value :  
2


-2
-1
0
1
2
sum of the numbers -2-2 is 0
The average of the numbers -2-2 is 0.0

Test Case 4:
Enter Starting Value:  
-5
Enter Ending Value :  
0


-5
-4
-3
-2
-1
0
sum of the numbers -5-0 is -15
The average of the numbers -5-0 is -2.5

Test Case 5:
Enter Starting Value:  
0
Enter Ending Value :  
1


0
1
sum of the numbers 0-1 is 1
The average of the numbers 0-1 is 0.5
*/
