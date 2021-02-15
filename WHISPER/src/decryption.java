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


public class decryption {
          String msg;
    
    
    public decryption(String msg){
        this.msg=msg;
    }
    
    public  String convert(String a) {
        int length = a.length();
        String total = "";
        char c;
        for (int i = 0; i < length; i++) {
            c = a.charAt(i);
            switch (c) {
                case 'N':
                    total += 'A';
                    break;
                case 'W':
                    total += 'B';
                    break;
                case 'E':
                    total += 'C';
                    break;
                case 'C':
                    total += 'D';
                    break;
                case 'D':
                    total += 'E';
                    break;
                case 'V':
                    total += 'F';
                    break;
                case 'B':
                    total += 'G';
                    break;
                case 'O':
                    total += 'H';
                    break;
                case 'A':
                    total += 'I';
                    break;
                case 'X':
                    total += 'J';
                    break;
                case 'M':
                    total += 'K';
                    break;
                case 'T':
                    total += 'L';
                    break;
                case 'S':
                    total += 'M';
                    break;
                case 'Z':
                    total += 'N';
                    break;
                case 'J':
                    total += 'O';
                    break;
                case 'K':
                    total += 'P';
                    break;
                case 'U':
                    total += 'Q';
                    break;
                case 'R':
                    total += 'R';
                    break;
                case 'F':
                    total += 'S';
                    break;
                case 'L':
                    total += 'T';
                    break;
                case 'I':
                    total += 'U';
                    break;
                case 'H':
                    total += 'V';
                    break;
                case 'Q':
                    total += 'W';
                    break;
                case 'P':
                    total += 'X';
                    break;
                case 'G':
                    total += 'Y';
                    break;
                case 'Y':
                    total += 'Z';
                    break;
                case '4':
                    total += '0';
                    break;
                case '3':
                    total += '1';
                    break;
                case '0':
                    total += '2';
                    break;
                case '6':
                    total += '3';
                    break;
                case '9':
                    total += '4';
                    break;
                case '5':
                    total += '5';
                    break;
                case '8':
                    total += '6';
                    break;
                case '1':
                    total += '7';
                    break;
                case '7':
                    total += '8';
                    break;
                case '2':
                    total += '9';
                    break;
                case '~':
                    total += ' ';
                    break;
                    case 'n':
                    total += 'a';
                    break;
                case 'w':
                    total += 'b';
                    break;
                case 'e':
                    total += 'c';
                    break;
                case 'c':
                    total += 'd';
                    break;
                case 'd':
                    total += 'e';
                    break;
                case 'v':
                    total += 'f';
                    break;
                case 'b':
                    total += 'g';
                    break;
                case 'o':
                    total += 'h';
                    break;
                case 'a':
                    total += 'i';
                    break;
                case 'x':
                    total += 'j';
                    break;
                case 'm':
                    total += 'k';
                    break;
                case 't':
                    total += 'l';
                    break;
                case 's':
                    total += 'm';
                    break;
                case 'z':
                    total += 'n';
                    break;
                case 'j':
                    total += 'o';
                    break;
                case 'k':
                    total += 'p';
                    break;
                case 'u':
                    total += 'q';
                    break;
                case 'r':
                    total += 'r';
                    break;
                case 'f':
                    total += 's';
                    break;
                case 'l':
                    total += 't';
                    break;
                case 'i':
                    total += 'u';
                    break;
                case 'h':
                    total += 'v';
                    break;
                case 'q':
                    total += 'w';
                    break;
                case 'p':
                    total += 'x';
                    break;
                case 'g':
                    total += 'y';
                    break;
                  case 'y':
                    total += 'z';
                    break;
                case ' ':
                    total += ' ';
                    break;
                case '|':
                    total += ' ';
                    break;  
                case '}':
                    total += ' ';
                    break; 

            }

        }
        return total;
    }

    public String ASCII(String b) {
      int F=0;
      int L =3; 
     char c;
     String result = "" ;
     while(F<b.length() && L<b.length()){
      c=(char)Integer.parseInt(b.substring(F, L));
      result += c;  
     F+=3;
     L+=3;
     }
      c=(char)Integer.parseInt(b.substring(F));
      result += c;
      
      return result;
    }

    public String swap(String s) {
        String str1 = "";
        String str2 = "";
        String str3 = "";
        String str4 = "";
        String result = "";
 

        int length = s.length();

        
        int mod = length % 4;
        if (mod == 0) {
            str1 = s.substring(0, (length / 4));
            str2 = s.substring((length / 4), 2 * (length / 4));
            str3 = s.substring(2 * (length / 4) ,3 * (length / 4) );
            str4 = s.substring(3 * (length / 4));
             result= str3 + str4 + str2 +str1;
        }
        if (mod == 1) {
           s=s+"~|}";
            str1 = s.substring(0, (s.length()/ 4));
            str2 = s.substring((s.length()/ 4), 2 * (s.length() / 4));
            str3 = s.substring(2 * (s.length() / 4) ,3 * (s.length() / 4) );
            str4 = s.substring(3 * (s.length()/ 4));
              result= str3 + str4 + str2 +str1;
        }
        if (mod == 2) {
             s=s+"~|";
            str1 = s.substring(0, (s.length()/ 4));
           str2 = s.substring((s.length() / 4), 2 * (s.length() / 4));
            str3 = s.substring(2 * (s.length() / 4) ,3 * (s.length() / 4) );
            str4 = s.substring(3 * (s.length() / 4));
            result= str3 + str4 + str2 +str1;
   
        }
        if (mod == 3) {
             s=s+"~";
            str1 = s.substring(0, (s.length()/ 4));
            str2 = s.substring((s.length()/ 4), 2 * (s.length()/ 4));
            str3 = s.substring(2 * (s.length() / 4) ,3 * (s.length()/ 4) );
            str4 = s.substring(3 * (s.length()/ 4));
             result= str3 + str4 + str2 +str1;
        }

        return result;

    }
    
    public  boolean validate(String s){   //return true if the input is valid false other wise
      if(s.length()<1)
           return false;
       if (s.length() % 12 !=0){
           System.out.println("The length has to be multiplier of 12");
           return false;}
       
        for(int i=0 ; i<s.length() ;i++)
       if (!Character.isDigit(s.charAt(i)) ){
           System.out.println("you are allowed to enter digits only");
            return false;}
            
            return true;
        
    }
    public  String RialFence(String s){
        String odd = s.substring(0,  (s.length()/ 2));
        String even =s.substring(s.length()/ 2);
        String result ="";
        for(int i= 0 ; i < (s.length()/2) ;i++){
                result = result + odd.charAt(i) +""+ even.charAt(i)+"";
        }
      return  result ;
        
    }
    
    public String convertAscii(String s){
    
        int length = s.length();
        char[] array = s.toCharArray();
        String total="";
        int j=1;
        int k = 0;
            for(; j+2<=length && k+2<=length;j+=2,k+=2){
           total=total+""+ array[j]+""+array[k];
   
           }
                total=total+""+ array[j]+""+array[k];

    return total;
    }
    
}
