package com.aurionpro.test; 
 
public class CallByReference { 
 public static void main(String[] args) { 
  int[] numbers= {10,20,30,40,50};  
  incrementNumberByone(numbers); 
   for(int x : numbers) 
   { 
    System.out.println(x); 
   } 
    
  } 
   
 
 private static void incrementNumberByone(int[] numbers) { 
        for(int i=0;i<numbers.length;i++) 
        { 
         numbers[i]+=1; 
        } 
 } 
}