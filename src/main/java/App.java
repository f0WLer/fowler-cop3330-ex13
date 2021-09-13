import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Fowler
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double P = scanner.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double r = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        int t = scanner.nextInt();
        System.out.print("How many times is the interest compounded per year? ");
        int n = scanner.nextInt();

        double A = P * Math.pow(1 + ((r/100)/n), n * t);

        System.out.println(String.format("$%.2f invested at %s%% for %s years compounded %s times per year is $%.2f",
                P, r, t, n, A));

    }
}
