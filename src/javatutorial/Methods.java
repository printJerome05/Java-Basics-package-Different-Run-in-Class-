/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatutorial;
import java.util.Scanner;
/**
 *
 * @author JeromeMarco
 */

// methods is also functions
// use to divide a sort of functionalities within a class so
// it will be organize example
// you have a metyhod for adding , substracting and dividing
// method should be done outside the main method 
public class Methods {
    
    //example of global variable
    // neeed to have static to access in any static methods
   
    static String jerome = "jerome";
    static int y = 10;
    public static void main(String []args){
    
   System.out.println("---------------printing method---------------");
    // to print hello
    hello();
   
   System.out.println("---------------print method with arguement---------------");
   /* to print the method with arguement
      example the add method it have ab int declared i 
      so in the main method it should have a value inside ();           
    */
   add(12);
   
     System.out.println("---------------manually typing data from method---------------");
   // you can manually type the int value in the add two example
   addTwo(12,5);
   
   
     System.out.println("---------------getting value to the method declaration---------------");
   // example of getting value from input user to the methods arguements (int qwe, int rty)
   int x1, x2;
   Scanner s1 = new Scanner(System.in);
   Scanner s2 = new Scanner(System.in);
   System.out.println("Enter 2 numbers to add seperated by enter:");
   x1 = s1.nextInt();
   x2 = s2.nextInt();
   
   addTwo(x1,x2);
  
   
     System.out.println("---------------returntype---------------");
   //RETURN TYPE
   //you can declare new variable  example\
   // you can now print the new variable which is minus 2
   int minus2 = minusTwo(2,2);
   System.out.println(minus2);
   
   /*
        PRINTING OVERLOADING METHODS
   */
   //overloading method
   System.out.println("---------------Overloading methods---------------");
   System.out.println(add1(1,2)); //static int add1 (int add1,int add2)
   System.out.println(add1(1,2,3)); //static int add1 (int add1,int add2,int add3)
   System.out.println(add1(2.5,2.1,3.1)); //static double add1 (double add1,double add2)
   System.out.println(add1(2.5,3.1)); // static double add1 (double add1,double add2,double add3)
   
   System.out.println("---------------arrayMethod Declaration---------------");
   // adding all the array synxtax
   int numbers[] = {2,2,4,5,6};
   int sumation1 = summation(numbers);
 
     System.out.println(sumation1);
   
   
    }
    
     // example of methods jut print
     static void hello(){
     System.out.println("Hello: " + jerome);
    }
     
     // example of method that have arguement
     static void add(int i){
         // the Y came from the global variable
         System.out.println(i + y);
    }  
     
     // example of method that have arguement
    static void addTwo(int qwe, int rty){
         System.out.println(qwe + rty);
    } 
    
    //example of return
    // if you return static void it will error beacuase void means nothing
    // you can do static string, static int, static bool and so on
    // this method means we return int because we ha static int
    static int minusTwo(int qwe1, int rty1){
        return qwe1 - rty1;
    } 
    
    //overloding methods example
    /*
        Overloading means same name of data type or variable in this case same add
        but the return type and the declaration should be others and not the same
        as the others best use for calculators
    */
    static int add1 (int add1,int add2){
        return add1 + add2;
    }
     static int add1 (int add1,int add2,int add3){
        return add1 + add2 + add3;
    }
     static double add1 (double add1,double add2){
        return add1 + add2;
    }
    static double add1 (double add1,double add2,double add3){
        return add1 + add2 + add3;
    }
  
    //Summation of array int
    // the for () explanation = int number is the itteration of declared int num in the method shortcut
    static int summation(int num[]){
     int sum = 0;
     
     for(int number : num){
         sum = sum + number;
     }
     return sum;
               
    }
   
    
    
    



    
}


