/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectOriented_Programming.Abstraction_Interface;

/**
 *
 * @author JeromeMarco
 */

//can implement multiple interface in a class 
// just use , to space 
public class Grade1 implements MainGrade, Female, Male {
    
    // need to be public 
    public void Greet(){
        System.out.println("I am Grade 1");
    }
    public void isMale(){
        System.out.println("I am Male");
    }
    
    public void isFemale(){
        System.out.println("I am Female");
    }
}
