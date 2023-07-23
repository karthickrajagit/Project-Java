//Java practice for become Back-end Developer
//This program is for check the class.

package PRACTICE;  //package

import java.util.Scanner;

public class for_class_Practice {

    public static void main(String[] args) {
        System.out.println("enter the four numbers : ");  //statement for  user to enter the numbers

        Scanner Num1 = new Scanner(System.in);  //Value stored in num1 from the user input
        Scanner Num2 = new Scanner(System.in);
        Scanner Num3 = new Scanner(System.in);
        Scanner Num4 = new Scanner(System.in);

        sum s1 = new sum();         //s1 object calls sum class and class contains properties and variable
        sum s2 = new sum();         //s2 is another object but calls same class of s1 and it own Properties and variables

        s1.a = Num1.nextInt();        // a is a property of class that we declared with variable on s1 object.
        s1.b = Num2.nextInt();        // b ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' ' '
        s2.a = Num3.nextInt();        // s2.a is a another object for same class.
        s2.b = Num4.nextInt();

        System.out.println("S1.a: " + s1.a);        //For get the output from the input with the help of class properties
        System.out.println("S1.b: " + s1.b);
        System.out.println("S2.a: " + s2.a);
        System.out.println("S2.b: " + s2.b);
        System.out.println("Sum of s1a + s1b: " + (s1.a + s1.b)); //sum of both variable in same object
        System.out.println("Sum of s2a + s2b: " + (s2.a + s2.b));
    }
}
// Sum Class for code_gym
class sum {
    int a, b;           //Properties and Variables to contribute the value for object
}