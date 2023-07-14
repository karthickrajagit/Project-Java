package PRACTICE;

import java.util.Scanner;

public class ifcondition {
    public static void main(String[] arg) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int x = num.nextInt();
        System.out.println("Enter the second number = ");
        int y = num.nextInt();
        if (x >= y) {
            System.out.println("x is bigger than y");
        }
        else
        {
            System.out.println("x is smaller than y");
        }
    }
}
