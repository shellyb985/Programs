package com.bridgelabz.main;

import com.bridgelabz.utility.utility;
import java.util.Scanner;

public class BalancedParentheses{
  //************************************************************
  //main function
  public static void main(String []args){
    BalancedParentheses BPObject=new BalancedParentheses();
    Scanner scan=new Scanner();

    System.out.println(".....Arithmetic Expression is balanced or not.....");
    System.out.print("Enter the Expression : ");
    String tString=scan.next();
    String tString1="";
    tString1+=tString.charAt(i);
    for(int i=0;i<tString.length();i++){
      char tChar=tString.charAt(i);
      if(tChar=='(' || tChar=='+' || tChar=='-' || tChar=='*' || tChar=='/' ){
        BPObject.push(tString1);
        flag=1;
        tString1="";
      }
      if(flag==1){
        tString1="";
        flag=0;

      }
      tString1+=tChar;

    }//End of for loop
  }//End of main function
  //*****************************************************
}//End of main class
