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
public class conditionalStatement {
    
    public static void main (String[] args){
       // Relational Operators
       //  == Equals
       // != not Equals to
       // < less than
       // <= less than or equals to
       // > greater than
       // >= greater than equals
        
       //if statement done with done condition example
       int Myage = 18;
       
       if(Myage <= 22){
           System.out.println("Not the same age");
       }
       
     // if else statment handles 2 condition
       boolean isTall = false;
       
       if(isTall = true){
           System.out.println("You are taller");
       }
       else{
           System.out.println("You are not taller");
       }
       
       
       // if - elseif -else statement 3 condtion Example with input
       int age;
       Scanner s = new Scanner(System.in);
       
       System.out.print("Enter Your age: ");
       age = s.nextInt();
       
       if(age >= 22){
        System.out.println(" Your an Aldult");
       }
       else if(age >= 17){
        System.out.println(" Youre an Teenage");
       }
       else {
           System.out.println("Unknown"); 
       }
      
      // nested Conditional Statement a condition where you can do if statement inside also a if statement for example
      String name = "jerome";
      //change false into true to access admin system prunt welcome user
      boolean access = true;
      
      if(name == "jerome"){
          System.out.println("Login Success");
          if(access){
               System.out.println("Welcome Admin");
          }else{
              System.out.println("Welcome User"); 
          }
      }else{
          System.out.println("Error");
      }
       
       
     // String Comparing use .euqals
     String name1 = "joy";
     
     if(name1.equals("joy")){
         System.out.println("String Equasls to");
     }else{
                System.out.println("Not equalst to");
     }
     
     // String Comparing use .euqalsIgnoreCase to ignore case senstive 
     //notice the it is Joy in the if statement but in the String name1 = joy lowercase but same letter it will be equals to the if statement
      if(name1.equalsIgnoreCase("JOY")){
         System.out.println("String is Correct");
     }else{
                System.out.println("Not equalst to");
     }
      
      
    // Logical Operators
    //  and =  && Both Conditions needs to be true
    //  or =  || Either Conditions need to be true
    // not =  ! Inverts the current conditons
    
    // && example
    //false statement
    boolean hasPen = false;
    boolean hasPaper = true;
    
    if(hasPen && hasPaper){
        System.out.println("You can write");
    }else{
           System.out.println("You cannot write");
    }
    
    // true Statement
    boolean hasPen1 = true;
    boolean hasPaper1 = true;
    
    if(hasPen1 && hasPaper1){
        System.out.println("You can write");
    }else{
           System.out.println("You cannot write");
    }
    
    // || statement
    // both booleans false = output is else
    boolean hasPen2 = false;
    boolean hasPaper2 = false;
    
    if(hasPen2 || hasPaper2){
        System.out.println("You can write");
    }else{
           System.out.println("You cannot write");
    }
    
    // one booleans false = output is if
    boolean hasPen3 = true;
    boolean hasPaper3 = false;
    
    if(hasPen3 || hasPaper3){
        System.out.println("You can write");
    }else{
           System.out.println("You cannot write");
    }
    
     // ! statment
    boolean hasPen4 = true;

    
    if(!hasPen4){
        System.out.println("You go home");
    }else{
           System.out.println("You can write");
    }
    
    // Grade Calculator Example 
    Scanner eng = new Scanner(System.in);
     Scanner mat = new Scanner(System.in);
      Scanner sci = new Scanner(System.in);
       Scanner com = new Scanner(System.in);
  
    float g1;
    float g2;
    float g3;
    float g4;
    
    System.out.println("General Average Program");
    System.out.print("English : ");
    g1 = eng.nextFloat();
    System.out.print("Math : ");
    g2 = mat.nextFloat();
    System.out.print("Science : ");
    g3 = sci.nextFloat();
    System.out.print("Computer : ");
    g4 = com.nextFloat();
    
   float gen = (g1+g2+g3+g4);
   float over = (gen/4);


   
   if(over >= 100){
       System.out.println("Average: " + over);
        System.out.println("Invalid Grade");
   }
   else if(over >= 98){
       System.out.println("Average: " + over);
        System.out.println("With Highest Honor");
   }
   else if((over <= 97.99f) && (over >= 95)){
       System.out.println("Average: " + over);
        System.out.println("With High Honor");
   }
   else if((over <= 94.99f) && (over >= 90)){
       System.out.println("Average: " + over);
        System.out.println("With Honors");
   }
    else if((over <= 89.99f) && (over >= 75)){
       System.out.println("Average: " + over);
        System.out.println("Passed");
   }
    else if(over <= 74){
           System.out.println("Failed");
    }
    else{
        System.out.println("Error");
    }
       
    
    
  
      
    
    
    }
    
    
}
