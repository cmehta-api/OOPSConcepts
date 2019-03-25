/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPSConcepts;

/**
 *
 * @author cmehta
 */
public class PolymorphismInheritance {
    
    public static void main(String[]args){
        
        //PolymorphismInheritance obj = new PolymorphismInheritance();
        System.out.println("**************BMW*****************");
        BMW bmwObj = new BMW(); 
        bmwObj.start();       // method overriding , base class as well child class has same method name with same parameter 
        bmwObj.theftSafty();  //And also called static inheritance polymorphism or compile time polymorphism 
        bmwObj.refeal();
        bmwObj.engine();
        
        System.out.println("**************Car*****************");
        Car carObj = new Car();
        carObj.refeal();
        carObj.start();
        carObj.stop();
        carObj.engine();
        
        
        System.out.println("**************vehical*****************");
        
        Vehical vehicalObj = new Vehical();
        
        vehicalObj.engine();
        
        
        //Dynamic polymorphism or run time polymorphism
        
        Car obj = new BMW(); 
        obj.start(); // this is overriden method in BMW class hence overriden method called first  
               
    }
    
}
