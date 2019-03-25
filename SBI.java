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
public class SBI implements BarclaysInterface , CITIInterface ,HSBCInterface{
   
    
    //Overriden methods
    public void credit(){
        
        System.out.println("BarclaysInterface credit");
    }
    

    public void debit(){
        
        System.out.println("BarclaysInterface debit");
    }

    public void VAT(){
        
        System.out.println("BarclaysInterface VAT");
    }
    
    //Own method of SBI class
    public void homeLoan(){
        System.out.println("this is SBI method"); 
        
    }
    
    //CITIInterface interfce method 
    
    public void mutualFund(){
        
        System.out.println("This is CitiBank method");
    }
    
    
    
    public void carLoan(){
        
        System.out.println("HSBC method ");
    }

    
}
