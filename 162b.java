/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg162b;

/**
 * Program name: Summing Some Numbers
 * @author Noah Miller Johnson
 * Date: 10/07/15
 * Description: Take an initial population and growth rate and show how the population changes and find when it will have doubled
 * Compiler: Java 8
 * What I learned: Nothing
 * Platform: Windows 7
 * Difficulties: Off by one errors with the year
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Declare scanner class
        int year = 2015;
        System.out.print("Growth Rate: ");
        double rate = scan.nextDouble(); //Get growth rate
        System.out.print("Population (Millions in 2015): ");
        double initial_population = scan.nextLong(); //Get initial Population
        rate*=.01; //Convert percentage to a decimal
        double population = initial_population; //Make a comparison variable
        
        while((population<initial_population*2)&&(rate!=0)){ //Print out the population until it doubles an prevent it from looping forever is rate=0
            year++;
            population=Math.round(population*(1+rate));
            System.out.println(year+"		"+population);
        }
        System.out.print("The population will double by the year "+year); //Output the results
    }
    
}
/*Sample output
Population (Millions in 2015): 100
2016		110.0
2017		121.0
2018		133.0
2019		146.0
2020		161.0
2021		177.0
2022		195.0
2023		215.0

Test case 1:
Population (Millions in 2015): 978
2016		1002.0
2017		1027.0
2018		1053.0
2019		1079.0
2020		1106.0
2021		1134.0
2022		1162.0
2023		1191.0
2024		1221.0
2025		1252.0
2026		1283.0
2027		1315.0
2028		1348.0
2029		1382.0
2030		1417.0
2031		1452.0
2032		1488.0
2033		1525.0
2034		1563.0
2035		1602.0
2036		1642.0
2037		1683.0
2038		1725.0
2039		1768.0
2040		1812.0
2041		1857.0
2042		1903.0
2043		1951.0
2044		2000.0

Test case 2:
Growth Rate: 0
Population (Millions in 2015): 100
The population will double by the year 2015

Test case 3:
Growth Rate: 100
Population (Millions in 2015): 6000
2016		12000.0
2017		24000.0
*/
