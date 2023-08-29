/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatutorial;
import java.util.Scanner;

/**
 *
 * @author JeromeMarco
 */
public class SwitchStatement {
    
    public static void main (String [] args){
        
        // WHEN DOING CHARACTER only ' ' if "" it will error
        char letter = 'C';
        
        // EXAMPLE OF SWITH STATEMENT
        switch(letter){
            
        case 'A' :
        System.out.println("Letter is a");
        // break is need in order to stop processing 
        //if there is no break in a case it will continue its code to the next case
        break;
        
        case 'B' :
        System.out.println("Letter is B");
        break;
        
        // default is run when the switch statement dont have the equal of its variable or statement
        // if there is no default and the swithstatement dont match any case it will not display anything
        default:
        System.out.println("No letter is equal");
        
        
        //EXAMPLE OF SWITCH STATEMENT
        // DATE FORMATER using user input number into string
        
        int month, Date, Year;
        
        Scanner mTH = new Scanner(System.in);
        Scanner dT = new Scanner(System.in);
        Scanner yR = new Scanner(System.in);
        
        System.out.print("Month: ");
        month = mTH.nextInt();
        
        
        System.out.print("Day: ");
        Date = dT.nextInt();
       
        System.out.print("Year: ");
        Year = yR.nextInt();
        
        String Monthword = "";
        
        switch(month){
            case 1:
                Monthword = "January";
                break;
            case 2:
                Monthword = "February";
                break;  
            case 3:
                Monthword = "March";
                break;
            case 4:
                Monthword = "April";
                break; 
            case 5:
                Monthword = "May";
                break;
            case 6:
                Monthword = "June";
                break;
            case 7:
                Monthword = "July";
                break;
            case 8:
                Monthword = "August";
                break;
            case 9:
                Monthword = "September";
                break;
            case 10:
                Monthword = "October";
                break; 
            case 11:
                Monthword = "November";
                break;
            case 12:
                Monthword = "December";
                break;
            default:
          
        }
        
        // the dataype variables input not the scanner variables for the print
         System.out.println();
        // to check if the date and month is correct
         // can use if else or do while method
         if(Date >= 32){
             System.out.println("Invalid Date");
         }else{
             if(month >= 13){
                   System.out.println("Invalid Month");
             }else
               System.out.println(Monthword + " "+ Date + ", "+ Year);
         }
        
        
    }
    }
}
