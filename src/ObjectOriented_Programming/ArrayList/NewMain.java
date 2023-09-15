/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ObjectOriented_Programming.ArrayList;
// need to import arraylist first
import java.util.ArrayList;
import ObjectOriented_Programming.ArrayList.TEST;
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
        
        // arraylist cannot be a primitive calss 
        // primitive class = int float char etc
        // non primitive class is string
        // wrapper class is also a non primitive 
        // wrapper class is just a big variable for example
        // example of wrapper class = Integer, Float, Double, Character
     
        //example of arraylist syntax
        ArrayList<String> names  = new ArrayList<String>();
        names.add("Jerome");
        names.add("Mara");
        names.add("JOYDEE");
        //for wrapper class
         ArrayList<Integer> number  = new ArrayList<Integer>();
         number.add(12);
         number.add(15);
         
         // to print array list values
         String name = names.get(0);
         System.out.println(name);
         
        System.out.println("----------------PRINTING ARRAYLIST USING FOR LOOP------------------");
         // to print the arraylist = variable.size()
         for(int i = 0;i < names.size();i++){
             System.out.println(names.get(i));
         }
         
         
         System.out.println("----------------PRINTING ARRAYLIST USING FOR each LOOP------------------");

         for(String n:names){
             System.out.println(n);
         }
         
     
         
        System.out.println("----------------ARRAYLIST OF MULTIPLE DATA CONSTRUCTOR CLASS------------------");
        // Arraylist that holds multiple data
        ArrayList<TEST> tests = new ArrayList<TEST>();
        tests.add(new TEST("jerome","Marco"));
        tests.add(new TEST("mara","oruga"));
        tests.add(new TEST("mara1","oruga1"));
        tests.add(new TEST("mara2","oruga2"));
        
         System.out.println("----------------PRINTING ARRAYLIST TEST USING  FOR LOOP------------------");
         // to print the arraylist = variable.size()
        
         for(int i = 0;i < tests.size();i++){
             tests.get(i).Displaytest();
         }
        
        System.out.println("----------------PRINTING ARRALIST LIST CLASS CONSTRUCTOR------------------");
        // need to instantiate first before printing it
        TEST ts = tests.get(1);
        ts.Displaytest();
        
         System.out.println("----------------SIMPLIFIED VERSION OF PRINTING------------------");
        // simplified version of printing
        tests.get(1).Displaytest();
        
        System.out.println("----------------UPDATING INDEX NAME------------------");
        // updating values of index names
        System.out.println(names.get(1));
        names.set(1, "secret");
        System.out.println(names.get(1));
        
        System.out.println("----------------UPDATING INDEX ARRALIST TEST CLASS------------------");
       //Current value
       tests.get(0).Displaytest();
        // updating values of A CLASS TEST CONSTRUCTOR ARRAYLIST
       tests.set(0,new TEST("jerome","UWU"));
       System.out.println();
       
       //displaying the output
       tests.get(0).Displaytest();
        
        
        System.out.println("----------------UPDATING INDEX NAME WITH USER INPUT------------------");
        Scanner s = new Scanner(System.in);
         
        System.out.println(names.get(2));
        System.out.println("Input new name");
        String newname = s.nextLine();
        names.set(2, newname);
        System.out.println(names.get(2));
        
        System.out.println("----------------DELETING ARRAYLIST INDEX NAME------------------");
        //displaying the current index 0
        System.out.println(number.get(0));
        
        // deleting index 0
        number.remove(0);
        
        //Displaying the current index 0
        System.out.println(number.get(0));
        
        
        System.out.println("----------------DELETING ARRAYLIST CLASS TEST------------------");
        tests.get(2).Displaytest();
        
        tests.remove(2);
        
        tests.get(2).Displaytest();
    }
    
}
