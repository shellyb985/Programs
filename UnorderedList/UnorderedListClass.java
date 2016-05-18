package com.bridgelabz;

import com.bridgelabz.Functions;
import com.bridgelabz.Node;

import java.util.Scanner;
//Main class
public class OrderedListClass{
  static Node start;//Creating object for Node class
  //Main method
  public static void main(String []args){

    Functions funObj=new Functions(); //Creating object for functions class
    start=funObj.read(start); //Calling read method from function class
    Scanner scan=new Scanner(System.in); //Creating object for Scanner

    System.out.print("Enter the word to search : ");
    String tString;
    tString=scan.next();

    //Searching word
    start=funObj.search(start,tString);
    String nString="";
    while(start!=null){
      nString+=start.Data;
      nString+=" ";
      start=start.next;
    }
  //  funObj.writeToFile(start);
    funObj.writeToFile(nString);
  }//End of main method

}//End of main class
