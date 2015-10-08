/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123a;

/**
 * Program name: From 3 to 9669
 * @author Noah Miller Johnson
 * Date: 9/29/15
 * Description: Make a 5x5 square of the numbers 1-25
 * Compiler: Java 8
 * What I learned: How to nest loops
 * Platform: Windows 7
 * Difficulties: Getting the nested loops to properly increment
 * Notes: The format class is a seperate class I wrote to make formating easier
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Numbers"); //Display title
        for(int i=0;i<5;i++){ //Make a new row
            for (int j=1;j<=5;j++){ //Display each row
                System.out.print(Format.padRight(5*i+j,5)); //Pad the results and display them
            }
        System.out.println(); //New row
        }
    }
    
}
/* Sample output
Numbers
1    2    3    4    5    
6    7    8    9    10   
11   12   13   14   15   
16   17   18   19   20   
21   22   23   24   25   
*/
