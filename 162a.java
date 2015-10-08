/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg162a;

/**
 * Program name: Summing Some Numbers
 * @author Noah Miller Johnson
 * Date: 10/06/15
 * Description: Using a do-while loop make a function that finds the factorial of an input
 * Compiler: Java 8
 * What I learned: How to let the user repeat something as many times as they want.
 * Platform: Windows 7
 * Difficulties: How to compare two strings for equality using .equals().
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Declare Scanner
        int product; //Delcare product
        String cont; //Declare the continue variable
        
        
        do{ //Run the factorial function at least once
            System.out.println("What to factorialize: ");
            int fact = scan.nextInt(); //Get input
            product = 1; //Make sure that the old prodcut doesn't change the next iteration.
            
            for(int i=1;i<=fact;i++){ //Find the factorial of an input
                product*=i;
            }
            
            System.out.println(fact+"!="+product); //Output the result
            System.out.println("Again? ");
            cont = scan.next(); //
        }while("yes".equals(cont.toLowerCase())); //Only continue if the user wants to do it again
    }
    
}
/*Sample Output:
What to factorialize: 
5
5!=120
Again? 
yes
What to factorialize: 
0
0!=1
Again? 
no

Test Case 1:
What to factorialize: 
-1
-1!=1
Again? 
Yes
What to factorialize: 
5
5!=120
Again? 
no

Test Case 2:
What to factorialize: 
72
72!=0
Again? 
no

Test Case 3:
What to factorialize: 
20
20!=-2102132736
Again? 
yes
What to factorialize: 
15
15!=2004310016
Again? 
no

Test Case 4:
What to factorialize: 
-7
-7!=1
Again? 
yes
What to factorialize: 
0
0!=1
Again? 
yes
What to factorialize: 
10
10!=3628800
Again? 
no

Test Case 5:
What to factorialize: 
13
13!=1932053504
Again? 
;aEFB

Test Case 6:
What to factorialize: 
6
6!=720
Again? 
YES
What to factorialize: 
5
5!=120
Again? 
yES
What to factorialize: 
4
4!=24
Again? 
yeS
What to factorialize: 
3
3!=6
Again? 
yEs
What to factorialize: 
2
2!=2
Again? 
no
*/
