package PRACTICE;

import java.util.Scanner;

public class vote {
    public static void main(String[] arg){
        System.out.println("This is age verification portal for vote");
        Scanner age  = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = age.nextLine();
        System.out.println("Enter the year of your birth");
        int year = age.nextInt();
        int Diff =  year - 2005;
        if (2005 >= year)
        {
            System.out.println("Yes " + name +" , You can vote in this year");
        }
        else
        {
            System.out.println("Thanks for verification " + name + " You can vote in " + Diff + " years");
        }








    }
}
