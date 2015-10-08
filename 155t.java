/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg155t;

/**
 *
 * @author Noah
 */

import java.util.*;
import java.io.*;
public class Main {

/**
 * Program name: Summing Some Numbers
 * @author Noah Miller Johnson
 * Date: 10/07/15
 * Description: Take an input from a file and output the sum, average and quantity from it
 * Compiler: Java 8
 * What I learned: How to read a file with java
 * Platform: Windows 7
 * Difficulties: Getting java to find the file
 * @param args
 * @throws java.io.IOException
 */
    public static void main(String[] args) throws IOException{
	Scanner inFile = null; //Declare scanner
        int sum = 0;
        int num;
        int i =0;
        
	try{
       	//Make a new file using the path of ini.txt
       		inFile = new Scanner (new File("C:\\Users\\Noah.Noah-PC\\Documents\\NetBeansProjects\\155t\\src\\pkg155t\\ini.txt")); //Path for the file
    	} 
    	catch (FileNotFoundException e){ //Catch the error if nothing is found
      		System.out.println ("File not found!");
      		// Stop program if no file found
      		System.exit (0);
    	}
        System.out.println("Scores");
	while(inFile.hasNext()){ //Loop through each of the numbers in the file
                num = inFile.nextInt();
		System.out.println(num); //Output the score
                sum+=num; //Total the scores
                i++; //Count the number of scores
	}
        
        //Output the results
        System.out.println("The sum of the numbers is "+ sum);
        System.out.println("The number of scores is "+i);
        System.out.println("The average of the numbers is "+sum/(double)i);
        
	inFile.close(); //Close the file
    }
}
/*Sample output
Scores
3
8
1
13
18
15
7
17
1
14
0
12
3
2
5
4
The sum of the numbers is 123
The number of scores is 16
The average of the numbers is 7.6875
*/
