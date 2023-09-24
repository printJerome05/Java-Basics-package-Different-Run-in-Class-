/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;



/**
 *
 * @author Jerome
 */
import java.util.Scanner;
public class Cashier {
     public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        
       
        
       boolean answer = true; 
          do{
        System.out.println("Chowking menu");
        System.out.println("Options");
        System.out.println("Option: 1 - Porkchop Lauriat - 178");
        int pk = 178;
        System.out.println("Option: 2 -  Shanghai 165");
        int sh = 165;
        System.out.println("Option: 3 -  SweetandSour 150");
        int ss = 150;
        System.out.print("Order Number: ");
        int orderNumber = s.nextInt();
        System.out.print("How many orders you want to have?: ");
        int howMany = s.nextInt();
        switch(orderNumber){
        case 1:  
            int sum1 = pk * howMany;
            System.out.println("Your order is: 1 - Porkchop Lauriat - 178");
            System.out.println("Sum of orders: " + sum1);
            System.out.print("How much money: " );
            int hm1 = s.nextInt();
            int change1 = sum1 - hm1;
            System.out.print("Change: " + Math.abs(change1) );
            System.out.println("-----------------------------------------------------------------------------" );
            break;
        case 2: 
            int sum2 = sh * howMany;
            System.out.println("Your order is: 2 -  Shanghai 165");
            System.out.println("Sum of orders: " + sum2);
            System.out.print("How much money: " );
            int hm2 = s.nextInt();
            int change2 = sum2 - hm2;
            System.out.print("Change: " + Math.abs(change2) );
            System.out.println("-----------------------------------------------------------------------------" );
            break;
            
        case 3:  
            int sum3 = ss * howMany;
            System.out.println("Your order is: 3 -  SweetandSour 150");
            System.out.println("Sum of orders: " + sum3);
            System.out.print("How much money: " );
            int hm3 = s.nextInt();
            int change3 = sum3 - hm3;
            System.out.println("Change: " + Math.abs(change3) );
            System.out.println("-----------------------------------------------------------------------------" );
            break;
        
            
        default:
            System.out.println("Invalid Number");
        
          }
        
        
         
           

       }while(answer = true);
    }
    
    
}
