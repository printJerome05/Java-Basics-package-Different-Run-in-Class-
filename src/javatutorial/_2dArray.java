/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatutorial;

/**
 *
 * @author JeromeMarco
 */

//A 2d array is an array withing an array it looks like a table 
// with rows and column 
// stores data 1 at  time like 1d arrays
public class _2dArray {
    public static void main(String []args){
        
    // Example of 2d Array
    
    String users [][] ={
        {"jerome","MARCO123"},
        {"MARA","Oruga123"},
        {"joy","marco123"},
    };
    
    // when printing imagine it is in the table
    // it have and index to every columns and rows start with 0 
    // for example
    System.out.println(users[2][0] +" "+ users[2][1]);
    System.out.println(users[0][0]);
    System.out.println(users[0][1]);
    
    int s1 = 0;
    int s2 = 1;
    
    int s3 = 0;
    int s4 = 1;
    
    // Array sytax withiout values
    // rows = horizontal data ---------------
    //                        ---------------
    //                        ---------------
    // columns the vertical data  ^ ^ ^ ^ ^
    // dataype identifier [][] = new datatype[rows][columns]
    
    String user1 [][] = new String[4][2];
      
    // NESTED FOR LOOP 
    // IT IS A FOR LOOP INSIDE A FOR LOOP
    
    for(int i = 0;i < 5;i++){ // << code is to run 5 times
    
        for(int x = 1;x < 5;x++){       // << this block of code will be run 5 times because the condtion in the first for is set to 5
        System.out.println(x);          // its like for the first for its 5 the second for condtion is x set to 1 means if will run four times because 1<5
    }                                   // syntax is like for first for 5 second for 4 == 5x4= 20 times 5 times the second for will run 
         System.out.println("");   
    }
    
    //Iterating 2d arrays using nested for loop
    // for loop to print 2d array
    String users1 [][] ={
        {"jerome","MARCO123"},
        {"MARA","Oruga123"},
        {"joy","marco123"},
    };
    
    for(int us = 0;us < users1.length;us++){
        for(int us2 = 0;us2 < users1[us].length;us2++){
            System.out.println(users1[us][us2]);
        }
           System.out.println(" ");
    }
    
    }
}
