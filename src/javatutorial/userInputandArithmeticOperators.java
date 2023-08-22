/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatutorial;

// The ability to have get user input
import java.util.Scanner;
/**
 *
 * @author JeromeMarco
 */
public class userInputandArithmeticOperators {
       
    //  public static void main(String[] args) {  } === this is need in order to run this is where the main function
     public static void main(String[] args) {
         
          String name;
          Scanner scan1 = new Scanner(System.in);
          
          System.out.println("Input your name below: ");
          // the .nextLine is for String only
          name = scan1.nextLine();
          
          //output 
           System.out.println("Your name is: " + name);
           
           
           //for number 
           int num;
           Scanner scannum1 = new Scanner(System.in);
           System.out.println("Input age below: ");
           num = scannum1.nextInt();
           System.out.println("age: " + num);
          
           
           //if you want to input is the same line erase the ln in System.out.println
           String fname, lname;
           
           Scanner scan2 = new Scanner(System.in);
           Scanner scan3 = new Scanner(System.in);
           
            System.out.print("First name: ");
            fname = scan2.nextLine();
            System.out.print("Last name: ");
            lname = scan3.nextLine();
            
            System.out.print("Your name is : " + fname +" "+lname);
            
            // Arithmetic Operators
            // + - / *
            // % modules remainder
            // ++ increment add 1
            // -- decrement subtract 1
            
            int a = 5;
            int b = 4;
            // need to enclose the operator to actually compute it.
            System.out.println("INT A = 5, INT B = 4");
            System.out.println("Addition: "+ (a+b));
            System.out.println("Subtraction: " + (a-b));
            System.out.println("Division: " + (a/b));
            System.out.println("Multiplication: " + (a*b));
            System.out.println("Modulo: " + (a%b));
            a++;
            System.out.println("Increament: " + a);
            b--;
            System.out.println("Decreament: " + b);
            
            // Input and Arithmetic Example
            int num2;
            int num3;
            
            Scanner nscan = new Scanner(System.in);
            Scanner nscan2 = new Scanner(System.in);
            
            System.out.print("Num 1: ");
            num2 = nscan.nextInt();
            System.out.print("Num 2: ");
            num3 = nscan2.nextInt();
            
            System.out.print("Result: " + num2 +" + " +num3 +" = " + (num2+num3));
            
            
        
        
        
    }
}
