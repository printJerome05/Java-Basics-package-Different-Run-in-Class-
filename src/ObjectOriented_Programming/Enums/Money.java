/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ObjectOriented_Programming.Enums;

/**
 *
 * @author JeromeMarco
 */

// in enums when declaring value in a variable it bneed a constructor
// example 
public enum Money {
    
    LIMA(5),SAMPO(10),BENTE(20),SINGKWENTA(50),ISANGDAAN(100);
    
    
    int money;
    
    Money(int money){
        this.money = money;
    }
    
}
