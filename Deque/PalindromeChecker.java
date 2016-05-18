package com.bridgelabz.main;

/**
  *created by bridgelabz on 12/05/2016
  *purpose
  *Program to input a string of characters and check whether it is a palindrome using deque;
**/
import com.bridgelabz.utility.utility;
import java.util.Scanner;

public class PalindromeChecker{
  public static void main(String []args){
    Scanner scan=new Scanner(System.in);
    utility<Character> ut=new utility();

    System.out.println("..........Palindrime Checker..........");
    System.out.print("Enter the String : ");
    String cString=scan.next();
    //adding each character to the rear of the deque
    for(int i=0;i<cString.length();i++){
      char c=cString.charAt(i);
      ut.addRear(c);
    }
    int flag=0;
    while(ut.size()>1){
      if(ut.removeFront()!=ut.removeRear()){
        flag=1;
        break;
      }//End of if
    }

    if(flag==0)
      System.out.println("String is Palindrome");
    else
      System.out.println("String is Not Palindrome");
  }
}
