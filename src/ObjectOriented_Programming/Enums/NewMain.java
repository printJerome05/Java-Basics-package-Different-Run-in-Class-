/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ObjectOriented_Programming.Enums;

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
        
        // syntax to instantiate enums
        // it will not have the new keyword
        // Enums mostly use for switch and if else
        Level lvl = Level.Insane;
        
        String name;
        System.out.println("**********************If else enum example***********************");
        // enums use examples
        // this IF ELSE statement without {} is use for one liner if and else if
        if(lvl == Level.Easy) System.out.println("BEGINNER");
        else if(lvl == Level.Meduim) System.out.println("SOPHOMORE");
        else if(lvl == Level.Hard) System.out.println("MASTER");
        else if(lvl == Level.Insane) System.out.println("GRANDMASTER");
        
         System.out.println("**********************Switch enum example***********************");
        // CASE STATEMENT
        switch(lvl){
            case Easy : 
                System.out.println("Easy");
                break;
            case Meduim :
                System.out.println("Meduim");
                break;
            case Hard :
                System.out.println("Hard");
                break;
            case Insane :
                System.out.println("Insane");
                break;    
        }
        
        // Money Enums
        System.out.println("**********************Enum with Constructor class***********************");
        Money lima = Money.LIMA;
        Money sampu = Money.SAMPO;
        
        

        
       
    }
    
}
