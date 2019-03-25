/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPSConcepts;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cmehta
 */
public class ArraysList {
    
    public static void main(String[]args){
        
        
        
        //initialize the ArrayList  
        
        ArrayList ar = new ArrayList();   //it collects all data types & its values & also retrieve all data type values
        ar.add(1);
        ar.add("a");
        ar.add('a');
        ar.add(10.50);
        
        int size = ar.size();
        
        System.out.println("size of arrays " +ar.size());
        
        ar.remove(2);
        System.out.println("size of arrays after remove one element " +ar.size());
        
        //ar.clear();
        //System.out.println("size of arrays after remove all elements " +ar.size());
        //System.out.println("size of arrays after remove one element " +ar.get(2)); //java.lang.IndexOutOfBoundsException
        
        
        
        //print all array values
        
        for(int i=0;i<ar.size();i++){
            
            System.out.println("print the array value " +ar.get(i));
            
            
        }
    
        System.out.println("**************************************************************************");
        
        ArrayList<String> sal = new ArrayList<String>(); //store only string values 
        
        //sal.add(1); //giving error , int value can not store
        
        sal.add("A");
        sal.add("Selenium testing is on semand");
        sal.add("Barclays Bank etc.");
        sal.add("string ends");
        
        for(int i=0;i<sal.size();i++){
            
            System.out.println(sal.get(i));
            
            
        }
        
        
        System.out.println("**************************************************************************");
        
        ArrayList<Integer> iar = new ArrayList<Integer>();
        
        iar.add(1);
        iar.add(2);
        iar.add(5);
        iar.add(10);
        //iar.add(10.5);  // not allowed
        
        for(int i=0;i<iar.size();i++){
            
            System.out.println(iar.get(i));
        }
        
        
        
        System.out.println("**************************************************************************");
        
        
        ArrayList<Character> charal = new ArrayList<Character>();
        
        charal.add('a');
        charal.add('b');
        charal.add('c');
        charal.add('d');
        
        for(int i=0;i<charal.size();i++){
            System.out.println(charal.get(i));
            
        }       
        
    }
    
}
