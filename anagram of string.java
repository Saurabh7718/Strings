// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String str1="saam";
        String str2="mas";
        
        char []ar1=str1.toCharArray();
        char []ar2=str2.toCharArray();
        
        int len1= ar1.length;
        int len2= ar2.length;
        
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        
        int count=0;
        if(len1!=len2){
            System.out.println("length of string is not same");
        }
        if(len1==len2){
            for(int i=0;i<len1;i++){
                if(ar1[i]==ar2[i]){
                    count++;
                }
            }
        }
        if(count==len1){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }   
        
    }
}



/*
java -cp /tmp/os9uctYXOu/HelloWorld
Try programiz.pro
length of string is not same
not anagram

=== Code Execution Successful ===
*/
