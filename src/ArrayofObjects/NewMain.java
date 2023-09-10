/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArrayofObjects;
import java.util.Scanner;

/**
 *
 * @author JeromeMarco
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    Scanner scannum = new Scanner(System.in);
    Scanner s = new Scanner(System.in);
    
   
    
    
    System.out.println("Enter how many student you want to enter");
    int number = scannum.nextInt();
    // syntax to create a Constructor objecxt array
    Student stu1[] = new Student[number];
    
   
  
    
    
    
    for(int i = 0;i < stu1.length;i++){
        String first;
        String last;
        String course;
        int year;
        char section;
        
        System.out.println("Student # " + (i + 1));
        System.out.println("");
        System.out.print("Enter First Name : ");
        first = s.nextLine();
        
        System.out.print("Enter Last Name : ");
        last = s.nextLine();
        
        System.out.print("Enter Course : ");
        course = s.nextLine();
        
        System.out.print("Enter Year : ");
        year = s.nextInt();
        // after string input and you int is next in input it need the .nextline to not error
        //this below next line need to be inputed to not error because of the int input 
        s.nextLine();
        
        System.out.print("Enter Section : ");
        section = s.nextLine().charAt(0);
        
        stu1[i] = new Student(first,last,course,year,section); 
    }
    System.out.println("*******************************************************");
    System.out.println("Display Students");
    System.out.println("");
    // to dsiplay the input in constructor
    for(int i = 0;i <stu1.length;i++){
        System.out.println("Student no: " + (i + 1));
        stu1[i].Introduce();
        System.out.println("");
    }
 
    }
    
}
