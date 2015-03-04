/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author user
 */
public class Arrays {

    public static void main(String[] args) {
        
        int[] arr = new int[10];
        
        arr[0] = 4;
arr[1] = arr[0] + 5;
        
        System.out.println(arr[1]);
        
        
        
        // πινακας numbers: θεση 0 -> 1, 
        //θεση 1->2, 
        //θεση 2->3
      int[] numbers = {1, 2, 3};
      
     
      
      // μεταβλητη length παιρνει την τιμη της , δηλαδη τον αριθμο στην θεση 2, αρα 3.
        int length = numbers[2];
        

        
        //πινακας chars παιρνει μεγεθος από length του numbers, δηλαδη 3 θεσεις.
       char[] chars = new char[length];
       
       

       // Βαζουμε ενα y στην θεση 0
        chars[numbers.length -3 ] = 'y';
        
        // 
         System.out.println(chars[0]);
        
        System.out.println("Done!");
    }
}


        
    
    

