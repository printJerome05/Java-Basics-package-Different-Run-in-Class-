/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectOriented_Programming;

/**
 *
 * @author JeromeMarco
 */
public class ObjectMethod_Character {
    
    String name, dialog;
    int hp,mp,age;
    
    // This is a constructor it should be a same name as the classname.
    ObjectMethod_Character(String name,String dialog,int hp,int mp,int age){
        this.name = name;
        this.dialog = dialog;
        this.hp = hp;
        this.mp = mp;
        this.age = age;
    }  
    
    /*this is a method becuase it have a return type witch is the = public void you can also just use void only becuase
      using public is when importing one class to another package. In our case we can use voidGreet only.
    
    */
    public void Greet(){
        System.out.println("Hello " + name);
    }
    
    void Say(){
          System.out.println(name + ": " + dialog );
    }
    
    //method example with parameter
    void GreetOther(String personname){
         System.out.println(name + ": " + dialog +" " + personname );
    }
}
