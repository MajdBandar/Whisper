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

public class encryption {
         
    String msg;
    
    
    public encryption(String msg){
        this.msg=msg;
    }
    
    public  String convert(String a) {
        int length = a.length();
        String total = "";
        char c;
        for (int i = 0; i < length; i++) {
            c = a.charAt(i);
            switch (c) {
                case 'A':
                    total += 'N';
                    break;
                case 'B':
                    total += 'W';
                    break;
                case 'C':
                    total += 'E';
                    break;
                case 'D':
                    total += 'C';
                    break;
                case 'E':
                    total += 'D';
                    break;
                case 'F':
                    total += 'V';
                    break;
                case 'G':
                    total += 'B';
                    break;
                case 'H':
                    total += 'O';
                    break;
                case 'I':
                    total += 'A';
                    break;
                case 'J':
                    total += 'X';
                    break;
                case 'K':
                    total += 'M';
                    break;
                case 'L':
                    total += 'T';
                    break;
                case 'M':
                    total += 'S';
                    break;
                case 'N':
                    total += 'Z';
                    break;
                case 'O':
                    total += 'J';
                    break;
                case 'P':
                    total += 'K';
                    break;
                case 'Q':
                    total += 'U';
                    break;
                case 'R':
                    total += 'R';
                    break;
                case 'S':
                    total += 'F';
                    break;
                case 'T':
                    total += 'L';
                    break;
                case 'U':
                    total += 'I';
                    break;
                case 'V':
                    total += 'H';
                    break;
                case 'W':
                    total += 'Q';
                    break;
                case 'X':
                    total += 'P';
                    break;
                case 'Y':
                    total += 'G';
                    break;
                case 'Z':
                    total += 'Y';
                    break;
                case '0':
                    total += '4';
                    break;
                case '1':
                    total += '3';
                    break;
                case '2':
                    total += '0';
                    break;
                case '3':
                    total += '6';
                    break;
                case '4':
                    total += '9';
                    break;
                case '5':
                    total += '5';
                    break;
                case '6':
                    total += '8';
                    break;
                case '7':
                    total += '1';
                    break;
                case '8':
                    total += '7';
                    break;
                case '9':
                    total += '2';
                    break;
                case ' ':
                    total += '~';
                    break;
                case 'a':
                    total += 'n';
                    break;
                case 'b':
                    total += 'w';
                    break;
                case 'c':
                    total += 'e';
                    break;
                case 'd':
                    total += 'c';
                    break;
                case 'e':
                    total += 'd';
                    break;
                case 'f':
                    total += 'v';
                    break;
                case 'g':
                    total += 'b';
                    break;
                case 'h':
                    total += 'o';
                    break;
                case 'i':
                    total += 'a';
                    break;
                case 'j':
                    total += 'x';
                    break;
                case 'k':
                    total += 'm';
                    break;
                case 'l':
                    total += 't';
                    break;
                case 'm':
                    total += 's';
                    break;
                case 'n':
                    total += 'z';
                    break;
                case 'o':
                    total += 'j';
                    break;
                case 'p':
                    total += 'k';
                    break;
                case 'q':
                    total += 'u';
                    break;
                case 'r':
                    total += 'r';
                    break;
                case 's':
                    total += 'f';
                    break;
                case 't':
                    total += 'l';
                    break;
                case 'u':
                    total += 'i';
                    break;
                case 'v':
                    total += 'h';
                    break;
                case 'w':
                    total += 'q';
                    break;
                case 'x':
                    total += 'p';
                    break;
                case 'y':
                    total += 'g';
                    break;
                case 'z':
                    total += 'y';
                    break;
                case '~':
                    total += '~';
                    break;
                case '|':
                    total += '|';
                    break;  
                     case '}':
                    total += '}';
                    break; 

            }

        }
        return total;
    }

    public String ASCII(String b) {
        int length = b.length();
        String tota = "";
        int c;

        char ch;
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(b.charAt(i))) {
                ch = (char) b.charAt(i);
                c=ch;
                tota += "0"+c;
                continue;
            }
            
            if (Character.isUpperCase(b.charAt(i))){
            c = b.charAt(i);
            tota += "0"+c;
            continue;
            }
            
            if(b.charAt(i)=='a'||b.charAt(i)=='b'|| b.charAt(i)=='c'){
                c = b.charAt(i);
                tota += "0"+c; 
               continue; 
             }
            
            c = b.charAt(i);
            tota += c;
            
        }

        return tota;
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
             result= str4 + str3 + str1 +str2;
        }
        if (mod == 1) {
           s=s+"~|}";
            str1 = s.substring(0, (s.length()/ 4));
            str2 = s.substring((s.length()/ 4), 2 * (s.length() / 4));
            str3 = s.substring(2 * (s.length() / 4) ,3 * (s.length() / 4) );
            str4 = s.substring(3 * (s.length()/ 4));
             result= str4 + str3 + str1 +str2;
        }
        if (mod == 2) {
             s=s+"~|";
            str1 = s.substring(0, (s.length()/ 4));
           str2 = s.substring((s.length() / 4), 2 * (s.length() / 4));
            str3 = s.substring(2 * (s.length() / 4) ,3 * (s.length() / 4) );
            str4 = s.substring(3 * (s.length() / 4));
           result= str4 + str3 + str1 +str2;
   
        }
        if (mod == 3) {
             s=s+"~";
            str1 = s.substring(0, (s.length()/ 4));
            str2 = s.substring((s.length()/ 4), 2 * (s.length()/ 4));
            str3 = s.substring(2 * (s.length() / 4) ,3 * (s.length()/ 4) );
            str4 = s.substring(3 * (s.length()/ 4));
             result= str4 + str3 + str1 +str2;
        }

        return result;

    }
    
    public  boolean validate(String s){ //return true if the input is valid false other wise
       
        if(s.length() < 1)
            return false;
        for(int i=0 ; i<s.length() ;i++)
       if (!Character.isLetterOrDigit(s.charAt(i)) && (s.charAt(i) != ' ')){
             System.out.println("you are allowed to enter digits and characters only");
            return false;}
            
            return true;
        
    }
    public  String RialFence(String s){
        String odd ="";
        String even ="";
       
        for(int i= 1 ; i<= s.length() ;i++){
            if(i %2 == 0)
                even+= s.charAt(i-1);
            else odd+= s.charAt(i-1);
        }
      return  odd + even ;
        
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
