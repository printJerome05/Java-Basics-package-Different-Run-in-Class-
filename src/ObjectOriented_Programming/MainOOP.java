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
        
        
        System.out.println("--------------------ObjectMethod--------------------");  
        ObjectMethod_Character Ch = new ObjectMethod_Character("Jerome","Hello THERe",120,100,12);
        ObjectMethod_Character Ch1 = new ObjectMethod_Character("Marco","Hola",100,100,12);
        
        // Ch is the instantiate of the Constructor ObjectMethod_Charcter. Then the Gree() is the method inside the class of it.
        Ch.Greet();
        Ch.Say();
        Ch1.Greet();
        Ch1.Say();
        
        System.out.println("--------------------ObjectMethod with user input --------------------");  
        Scanner s = new Scanner(System.in);
        System.out.print("Greet another person: ");
        String other = s.nextLine();
        Ch.GreetOther(other);
        Ch1.GreetOther(other);
        
        
        System.out.println("--------------------Example OOP OBJECT METHOD STUDENT --------------------");  
        ObjectMethod_STUDENT obs = new ObjectMethod_STUDENT("Jerome","Marco","BSIT","A",4,80,80);
        ObjectMethod_STUDENT obs1 = new ObjectMethod_STUDENT("Mara","Oruga","BSBA","A",4,99,99);
        ObjectMethod_STUDENT obs2 = new ObjectMethod_STUDENT("Joy","marco","BSBA","A",4,91,91);
        ObjectMethod_STUDENT obs3 = new ObjectMethod_STUDENT("secret","arf","BSBA","A",4,96,96);
        ObjectMethod_STUDENT obs4 = new ObjectMethod_STUDENT("qwerty","iop","BSBA","A",4,101,101);
        ObjectMethod_STUDENT obs5 = new ObjectMethod_STUDENT("secret1","meow","BSBA","A",4,74,74);


        obs.introduceSelf();
         obs1.introduceSelf();
          obs2.introduceSelf();
           obs3.introduceSelf();
            obs4.introduceSelf();
             obs5.introduceSelf();
            
        obs.evaluateGrade();
         obs1.evaluateGrade();
          obs2.evaluateGrade();
           obs3.evaluateGrade();
            obs4.evaluateGrade();
             obs5.evaluateGrade();
             
             
        System.out.println("--------------------Encapsulation --------------------");  
        //SETTER ENCAPSULATION
        Encapsulation e = new Encapsulation(1,"Jerome","JEROME123");
        
        //using encapsulation individual you can access it the id
        // instantiate new varible liek in the example = int id .
        // so the value will be 12 if we print it
        e.setId(12);
        int id = e.GetId();
        
        //the one you will print is the id variable 
        System.out.println(id);
        
        //getter is only for read only example
        // so the value would be JEROME123 the one we first defined
        // just make a getter first in the class only 1 variable at a time no a construct
        String usname1 = e.username();
        System.out.println(usname1);
        
        
        System.out.println("--------------------Overloading constructors --------------------");  
        //this example of overloading constructors\
       // below is the example of 3 overloading constructor defined in the class
        OverLoadingConstructor olc = new  OverLoadingConstructor("jerome","marco","araiz");
        //below is the example of the all variables defined in the constructor
        OverLoadingConstructor olc1 = new  OverLoadingConstructor("jerome","marco","araiz","male",12);
        
        // to print the value of encapsulated value need to have a getter
        // intantiate first the variable
        String fname = olc.getFirstname();
        String lname = olc.getlastname();
        String mname = olc.middletname();
        String gen = olc.gender();
        int age = olc.getage();
        System.out.println(fname +" "+lname+" "+mname+" "+gen+" "+age );
      
    }    
}
