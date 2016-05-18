package com.bridgelabz.main;

import com.bridgelabz.utility.Stack;
import java.util.Scanner;

public class BalanceExpression{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    Stack<Character> stackObject=new Stack();

    System.out.println("......Balanced Simple Expression.........");
    System.out.print("Enter the expression : ");
    String expString=scan.nextLine();

    for(int i=0;i<expString.length();i++){
      char tChar=expString.charAt(i);

      if(tChar=='('){
        stackObject.push(tChar);
      }
      else if(tChar==')'){
        stackObject.pop();
      }

    }
    if(stackObject.isEmpty()){
      System.out.println("Expression is Balanced...");
    }
    else{
      System.out.println("Expression is not Balances...");
    }
  }
}
