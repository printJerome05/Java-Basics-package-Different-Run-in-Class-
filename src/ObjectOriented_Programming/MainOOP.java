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
import ObjectOriented_Programming.Account;

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
        
        System.out.println("--------------------Product Class--------------------");        
        /* no need to import the class if it is in the same package like this .
           Example is this Product it is in the same package (Object Oriented Programming) So we can just instantiate it.
        */
        Product pt = new Product();
        
        System.out.println("--------------------Main Product Class--------------------");  
        //need to define values if the method have parameters
        MainProduct mp = new MainProduct("Nova ",20);
        MainProduct mp1 = new MainProduct("Piatos ",14);
        MainProduct mp2 = new MainProduct("Stick O ",1);
        
        
        
        System.out.println("--------------------Example with user input--------------------");  
        Scanner accuser = new Scanner(System.in);
        Scanner accpass = new Scanner(System.in);
        
        // when passing data to the other class define varialbes first
        String usname;
        String pass;
                                                                   
       
        
        System.out.print("Input Username: ");
        usname = accuser.nextLine();
        System.out.print("Input Password: ");
        pass = accuser.nextLine();
        
        // stantiate the method then use the defined variable inside this class ex usname , pass to pass the data from the Account.java defined parameters
        Account Acc = new Account(usname,pass);    
        
    }    
}
