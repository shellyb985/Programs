package com.bridgelabz;
/**
  *Created by bridgelabz on 11/05.2016
  *purpose:
  *There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be returned by Vending Machine.
  *Program to calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine as a Change
**/
import java.util.Scanner;

public class VendingMachine{
  static int totChange;//to store no of notes needed
  public static void main(String[] args){
    int index=7;
    Scanner scan= new Scanner(System.in);
    int rs;
    System.out.print("Amount : ");
    rs=scan.nextInt();
    findNote(rs,index);
  }
  //method to heck for largest value of the Note to return change
  public static void findNote(int rs,int index){
    int[] arrRs={1,2,5,10,50,100,500,1000};
    if(index<0 && rs<1){
      System.out.println("No of mininum Note  Needed : "+totChange);
      return;
    }
    else{
      int quo=rs/arrRs[index];
      //if number is divisible by arrRs[index]
      if(quo>0){
        totChange+=quo;
        //Display no for notes
        System.out.println(arrRs[index]+"\t*"+quo+"\t=   "+(quo*arrRs[index]));
        rs=rs-(quo*arrRs[index]);
        index=index-1;
        //calling function
        findNote(rs,index);
      }
      //if not divisible by arrRs[index]
      else{
        index=index-1;
        findNote(rs,index);
      }
    }
}
}//End of main class
