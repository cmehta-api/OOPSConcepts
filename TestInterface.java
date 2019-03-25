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
public class TestInterface {
    
    public static void main(String[]args){
        
        // BarclaysInterface b = new BarclaysInterface(); //can not create object of interfce ,it is not allowed , it's giving error 
        
        //CITIInterface c = new CITIInterface();  //can not create object of CITIInterface abstracts , same for barclays interface
                                                   //,it is not allowed
        
        System.out.println("Access the interfce variable "+BarclaysInterface.age);     
        
        //Static polymorphism or compile time polymorphism
        SBI s = new SBI();
        s.VAT();  //overriden method
        s.credit(); //overriden method
        s.debit(); //overriden method
        s.homeLoan();
        s.mutualFund(); 
        s.carLoan();
        
        
        
        //Dynamic polymorphism or run time polymorphism , child class object reffered by base class reference variable
        
        BarclaysInterface b1 = new SBI(); // new SBI() - object of child class 
                                          // b1 - base clase reference variable       
        b1.VAT();
        b1.credit();
        b1.debit();
        
        
       //SBI s1 = new BarclaysInterface();  //not allowed
       
       BarclaysInterface b = new BarclaysInterface //not allowed
        
        
        
    }
    
}
