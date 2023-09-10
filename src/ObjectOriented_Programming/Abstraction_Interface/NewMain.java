/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ObjectOriented_Programming.Abstraction_Interface;

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
        // in implement you cannot instantiate like this
        // the main interface is the MainGrade you cannot   Maingrade mg = new Maingrade();
        // only the classes with implement can don instatiation
        Grade1 g1 = new Grade1();
        Grade2 g2 = new Grade2();
        Grade3 g3 = new Grade3();
        
        g1.Greet();
        g2.Greet();
        g3.Greet();
        
        g1.isFemale();
    }
    
}
