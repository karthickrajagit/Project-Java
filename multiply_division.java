package PRACTICE;

import javax.security.sasl.SaslClient;
import java.sql.SQLOutput;
import java.util.Scanner;

public class multiply_division {
    public static void main(String args[]){
        System.out.println("You will get multiple and Division of two number!");
        Scanner add = new Scanner(System.in);
        System.out.println("Enter the first number = ");
        int a = add.nextInt();
        System.out.println("Enter the second number = ");
        int b = add.nextInt();
        int c = a * b;
        int d = a / b;
        int e = a % b;
        System.out.println("The product of " + a + " and  " + b + " is = "+ c);
        System.out.println("The Division of " + a + " and  " + b + " is = "+ d);
        System.out.println("The Reminder " + a + " and  " + b + " is = "+ e);
    }
}
