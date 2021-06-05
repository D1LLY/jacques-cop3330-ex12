/*
The formula for simple interest is A = P(1 + rt), where P is the principal amount, r is the annual rate of interest, t is the number of years the amount is invested, and A is the amount at the end of the investment.

Example Output
Enter the principal: 1500
Enter the rate of interest: 4.3
Enter the number of years: 4
After 4 years at 4.3%, the investment will be worth $1758.

Constraints
Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
Ensure that fractions of a cent are rounded up to the next penny.
Ensure that the output is formatted as money.
 */

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dilly Jacques
 */

package programming1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    private static DecimalFormat df2 = new DecimalFormat("#.00");

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double principal= in.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double interest=in.nextDouble();

        System.out.print("Enter the number of years: ");
        int years= in.nextInt();

        double amount=principal*(1 + (interest/100)*years);

        double rownd=Math.round(amount*1000)/1000.0;

        String out="After "+years +" years at "+interest+"%, the investment will be worth $"+rownd+".";
        System.out.println(out);
    }
}
