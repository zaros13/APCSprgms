/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg162i;

/**
 * Program name: From 3 to 9669
 * @author Noah Miller Johnson
 * Date: 10/07/15
 * Description: Given the initial balance and the interest rate each year display the amount of interest earned each year and the final value of a CD
 * Compiler: Java 8
 * What I learned: Nothing
 * Platform: Windows 7
 * Difficulties: Differentiating between the balance, interest and principle.
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter initial investment: ");
        double principle = scan.nextDouble();
        double rate;
        double balance = principle;
        double interest;
        
        for(int i=1;i<=5;i++){
            System.out.print("Enter Rate for year "+i+": ");
            rate = scan.nextDouble();
            rate*=.01;
            interest=Math.round(100*balance*rate)/100.0;
            balance+=interest;
            System.out.print("You earned $"+interest+" interest.\n\n");
        }
        System.out.print("Your CD is now worth $"+balance);
    }  
}
/*Sample Output
Enter initial investment: 5500
Enter Rate for year 1: 6.5
You earned $357.5 interest.

Enter Rate for year 2: 9
You earned $527.18 interest.

Enter Rate for year 3: 3
You earned $191.54 interest.

Enter Rate for year 4: 4.8
You earned $315.66 interest.

Enter Rate for year 5: 10
You earned $689.19 interest.

Your CD is now worth $7581.07
*/
