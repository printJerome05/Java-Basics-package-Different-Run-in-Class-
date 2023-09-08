/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectOriented_Programming;

/**
 *
 * @author JeromeMarco
 */
public class Inheritance_Person {
    String fname, lname;
    int age;
    
    //this class can be instatiated in the main java by the todler because it have extend on the public class name
    // see example mainOOP java file
    public void Name(){
        System.out.println("Firstname is: " + fname);
        System.out.println("Lastname is: " + lname);
        System.out.println("age is: " + age);
    }
}
