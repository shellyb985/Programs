package com.bridgelabz;

import com.bridgelabz.Function;
import com.bridgelabz.Node;
import java.util.Scanner;

public class OrderedList{
  public static Node start;

  public static void main(String []args){
    Function funObj=new Function();
    Scanner scan=new Scanner(System.in);

    //calling read method
    start=funObj.readFile(start);

    //calling display method
    //funObj.display(start);


    System.out.print("Enter the number to Search in list : ");
    int sNum=scan.nextInt();

    start=funObj.search(start,sNum);


    funObj.writeFile(start);

    while(start!=null){
      System.out.println(start.Data);
      start=start.next;
    }
  }
}
