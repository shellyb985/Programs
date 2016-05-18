package com.bridgelabz;
/**
  *created by bridgelabz on 09/05/2016
  *program to check the two Strings are Anagram or not.
**/
import java.util.Scanner;

public class Anagram{
  public static void main(String []args){
    String str1,str2;
    //Reading input
    str1=read();
    str2=read();
    //Calling method
    checkAnagram(str1,str2);
  }
  //Method to read input string
  public static String read(){
    Scanner scan=new Scanner(System.in);
    String str=new String();
    System.out.print("Enter the string : ");
    str=scan.nextLine();
    return str;
  }
  //Method to check anagram or not
  public static void checkAnagram(String str1,String str2){
    if(str1.length()!=str2.length()){
      System.out.println("Strings are not Anagram");
      return;
    }
    int tNum1=0,tNum2=0; //to store ascii value of character in a string
    for(int i=0;i<str1.length();i++){
      //sum of ascii value of characters in a string1
      tNum1+=(int)str1.charAt(i);
      //sum of ascii value of character in a string2
      tNum2+=(int)str2.charAt(i);
    }
    //Comparing ascii value of two string
    if(tNum1==tNum2){
      System.out.println("This is anagram");
    }
    else{
      System.out.println("This is not anagram");
    }
  }
}
