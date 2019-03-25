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
public class BMW extends Car{
    
    
    public void start(){   //this is overriden method  , same method name in Car class
        
        System.out.println("BMW ---start");
    }
    
    
    
    public void theftSafty(){
        
        System.out.println("BMW ---safty");
    }
    
}
