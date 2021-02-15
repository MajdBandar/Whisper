/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahaa
 */

//Whisper 2019 , Made by: 
/*Majd Bandar Bin Musibeh	438200829
Ghada Abdurrahman AlGhurairi	438201865
Shahad Omar AlHarbi	438201706
Lujain Abdullah Almuhaitheef	438201099
Rahaf Mohammed Al-Omar	438202048*/

import java.util.*; 
public class Security {
     static Scanner sc = new Scanner(System.in);
    public static void main(String[] a) {
       
        // encrypt 
       String userInput="";
       boolean flag =true;
        System.out.println(" Enter the text that you want to encrept it ");
        
        while(flag){
        try{
         userInput = sc.nextLine();
         encryption enc = new encryption(userInput);
         if(! enc.validate(userInput))
             throw new Exception(); 
         flag=false;
        }catch(Exception e){
           System.out.println(" invalid input, reEnter the text:"); 
        }
        }
      
        encryption enc = new encryption(userInput);
      
        String encc ="";
        encc= encrypt( enc ,userInput );
        encc= encrypt( enc ,encc );  
         
        String ascii = enc.ASCII(encc); 
        String convert = enc.convertAscii(ascii);
              System.out.println(convert);
      

        
       // decrypt
       String userInput2="";
       boolean flag2 =true;
       System.out.println(" Enter the text that you want to decrypt it ");
       while(flag2){
           try{
          userInput2 = sc.nextLine();
         decryption dec = new decryption(userInput2);
         if(! dec.validate(userInput2))
             throw new Exception(); 
         flag2=false;
           }catch(Exception e){
               System.out.println("invalid input, enter again: ");
           }
           
       }
       decryption dec = new decryption(userInput2);
        String decc ="";
        
        
        String convert2 = dec.convertAscii(userInput2);

        String ascii2 = dec.ASCII(convert2);
     
        decc= decrypt( dec ,ascii2 );
        decc= decrypt( dec ,decc );
         

        System.out.println(decc);
        
        
        
        
        
        

    }
public static String encrypt(encryption enc ,String input ){

    
        String convert = enc.convert(input);
    
        String swap = enc.swap(convert);
    
        String RF = enc.RialFence(swap);
    
   
    return RF;

}
public static String decrypt(decryption dec ,String input ){
    

      
        String RF = dec.RialFence(input);
  
        String swap = dec.swap(RF);
    
        String convert = dec.convert(swap); 
     
    
     return convert;
    
}
    
}
