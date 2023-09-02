/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ObjectOriented_Programming;

/**
 *
 * @author JeromeMarco
 */
// import class syntax = import packagename.classname;
import ObjectOriented_Programming.Person;
import java.util.Scanner;
public class MainOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //you can instantiate a class to simplify the code
        Person p = new Person();
        
        //printing attributes example
        p.age = 12;
        p.firstname = "Jerome";
        p.lasttname = "Marco";
        p.sex = 'M';
        System.out.println("----------Printing instantiated variable classes-------- pre defined value------");
        System.out.println(p.age);
        System.out.println(p.firstname);
        System.out.println(p.lasttname);
        System.out.println(p.sex);
        
        // Example of Getting value from user Input
        System.out.println("----------Printing instantiated variable classes-------- User Defined Value------");
        Scanner s1 = new Scanner(System.in);
          Scanner s2 = new Scanner(System.in);
            Scanner s3 = new Scanner(System.in);
              Scanner s4 = new Scanner(System.in);
              
        System.out.print("Enter Age: ");
        p.age = s1.nextInt();
        System.out.print("First Name: ");
        p.firstname = s2.nextLine();
        System.out.print("Last Name: ");
        p.lasttname = s3.nextLine();
        System.out.print("Sex: ");
        // the = next().charAt(1) use to get user input if the variable is a char the number 1 represetn how many the letter / charcter should be inputed
        p.sex = s4.next().charAt(0);
        System.out.println("Result");  
        System.out.println(p.age);
           System.out.println(p.firstname);
              System.out.println(p.lasttname);
                System.out.println(p.sex);
    }
    
}
