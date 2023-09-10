/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ObjectOriented_Programming.Polymorphism;

/**
 *
 * @author JeromeMarco
 */
public class MainGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //simple way of iterating classes
        Grade1 g1 = new Grade1();
        Grade2 g2 = new Grade2();
        
        g1.SAY();
        g2.SAY();
        
        //the main polymorphism class is the Main class it can do this also =    MainClass mc = new Grade1();
        MainClass A = new Grade1();
        MainClass B = new Grade2();
        MainClass C = new Grade1();
        
        C.SAY();
        A.SAY();
        B.SAY();
        
    }
    
}
