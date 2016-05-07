package com.bridgelabz;

/**
  *Created by bridgelabz on 05/05/2016
  *Purpose:
  *Read strind in standard input and print them in sorted order using Insertion sort
**/

import java.util.Scanner;
import java.util.ArrayList;

public class InsertionSort{

  public static void main(String []args){
    ArrayList<String> strList=new ArrayList(); //to store word in list
    String inString;//to store input string
    Scanner scan=new Scanner(System.in);

    System.out.print("String : ");
    inString=scan.nextLine(); //input from user
    //loop to split string into words
    for(String tString : inString.split(" ")){
      strList.add(tString);
    }
    //calling sorting method
    Insertion(strList);
  }

  //method to do insertion sorting
  public static void Insertion(ArrayList<String> strList){
    int len=strList.size(); //to store length of the list

    for(int i=1;i<len;i++){
      int j=i;
      int check=strList.get(j-1).compareTo(strList.get(j));
      while(j>0 && check>0){
        String tString=strList.get(j);
        strList.set(j,strList.get(j-1));
        strList.set((j-1),tString);
        j--;
        if(j>0){
          check=strList.get(j-1).compareTo(strList.get(j));
        }
      }//End of while loop
    }//End of loop
    //Displaying sorted list
    System.out.println(strList);

  }
}
