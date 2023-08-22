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
public class aRRAYeLEMENTSiNDEX {
   public static void main(String[] args){
    
    //Array group of elements
    // Elements the data inside array
    
    
    // array with values
    String name[] = {"jerome", "marco"
    };
    
    // index represent the value of each individual for ref in the num array number 1 represent the 0 index and so on.
    int num[] = {1,2,3,4,5};
    
    // Array wihtout value the [4] is need in order to know what is the limit of the array
    String Enames[] = new String[4];
    int oddnumbers[] = new int[10];
    
    
    //accesing arrays
    System.out.println(name[1]);
    System.out.println(name[0]);
    
    
    // can change the value of index by these example
    name [0] = "JEROME";
    System.out.println(name[0]);
    
    //input to array
    Scanner s = new Scanner (System.in);
    System.out.print("Employee name: ");
    Enames[0] = s.nextLine();
    
    System.out.println("Employee name is : " + Enames[0]);
    
    //for Example 
     String Email [] = {"jerome@gmail.com" , "marco@gmail.com", "Araiz@gmail.com"};
     String Username [] = {"jerome123" , "marco123", "Araiz123"};
     String Password [] = {"pass123" , "qwerty", "uwu123"};
     
     System.out.println("Index     : 0");
     System.out.println("Email       : " + Email[0]);
     System.out.println("Username    : " + Username[0]);
     System.out.println("Password    : " + Password[0]);
     
    
    
 
 
    
    
   }
}
