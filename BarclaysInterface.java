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
public interface BarclaysInterface {
    
    int age = 25; //by default it is declayed static variable & it can not be change , this is final variable value
    
    //interface does not have main method
    //interfac methods does not have method body , its only have method declaration
    //BY default all interface method as a sattic method
    // interface variables are static by default
    //Can not create object of interfcae class
    
    public void credit();  //method does have method body
    public void debit();
    public void VAT();
    
    
}
