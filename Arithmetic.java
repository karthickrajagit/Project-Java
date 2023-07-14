package PRACTICE;

import java.util.Scanner;

public class Arithmetic {                                                   //Java should be begin with classes
    public static void main( String arg[]){                                 //Main function is used to make the program to runn
        System.out.println("Hey, Welcome to Program Journey with Java");    // Welcome statement fromm the beginning
        Scanner add = new Scanner(System.in);                               //Scanner is used to get the data from user
        System.out.println("Enter the first number = ");
        int x = add.nextInt();                                              //next int statement for should be in integer
        System.out.println("Enter the second number = ");                   //User have to enter the number for x
        int y = add.nextInt();                                              //User have to enter the number for y
        int Z = x + y;                                                      //+ means sum of two number
        int W = x - y;                                                      //- to get difference of two numbers
        System.out.println("The sum of " + x + " and " + y + " is = "+ Z);
        System.out.println("The Difference of " + x + " and " + y + " is = "+ W);

    }
}
