/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPSConcepts;

import java.util.Hashtable;

/**
 *
 * @author cmehta
 */
public class HashTable {
    
    public static void main(String[]args){
        
        
        Hashtable ht = new Hashtable();
        ht.put("A", 1);
        ht.put("B", "Test");
        ht.put(1, "Selenium");
        ht.put('c', 1);
        ht.put("Selenium", 1);
        
        int sizeht= ht.size();
        System.out.println("size of hashtable " +sizeht);
        
        System.out.println("value of hashtable ht[0] " +ht.get("A"));  // print the value of key A is 1
        
        for(int i=0;i<ht.size();i++){
            
            System.out.println(ht.get(i));   //printing the garbase values (null Selenium null null null)
            
            
        }
        
        
        
        System.out.println("*************************************************************");
        
        Hashtable<Integer,Integer> iht = new Hashtable<Integer,Integer>();
        
        iht.put(1, 10);
        iht.put(2, 20);
        iht.put(4, 30);
        iht.put(6, 40);
        
        System.out.println("size of hashtable " +iht.size());
        System.out.println("prnt the value of iht[2]" +iht.get(0));
        
        for(int i=0;i<iht.size();i++){
            
            
            System.out.println(iht.get(i));
        }
        
        
        
        
    }
    
}
