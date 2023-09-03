/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectOriented_Programming;

/**
 *
 * @author JeromeMarco
 */
public class Account {
    
    String Username;
    String Password;
    
    
    Account(String Username,String Password){
        this.Username = Username;
        this.Password = Password;
        
        System.out.println("Account created Email: " + Username + "| Password: " + Password);
  
    }
}
