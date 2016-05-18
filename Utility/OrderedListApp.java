package com.bridgelabz.main;

import java.util.Scanner;
import com.bridgelabz.utility.OrderList;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;

public class OrderedListApp{
  public static void main(String []args){
    OrderList<Integer> OrderListObj=new OrderList();
    Scanner scan=new Scanner(System.in);

    String []temp=readFile();
    System.out.println(temp);
      int[] arr=new int[10];
    //Converting string into numbers
    for(int i=0;i<temp.length-1;i++){
      arr[i]=Integer.parseInt(temp[i]);
    }
    //Inserting numbers in the list
    for(int i=0;i<temp.length-1;i++){
      OrderListObj.add(arr[i]);
    }
    System.out.print("Enter the number to seach : ");
    int sNum=scan.nextInt();
    //Calling search function
    if(OrderListObj.search(sNum)){
      OrderListObj.remove(sNum);
      System.out.println("Number Found and removed from the list");
    }
    else{
      OrderListObj.add(sNum);
      System.out.println("Number found and Inserted into the list");
    }

    String tString=OrderListObj.display();

    writeFile(tString);
        /*
    for(int i=0;i<temp.length;i++){
      System.out.println(temp[i]);
    }*/

  }
  //Reading from file
  public static String[] readFile(){
    String []temp=null;
    try{
    FileInputStream fis=new FileInputStream("NewTextFileOrderedList.txt");
    String tString="";
    while(fis.available()>0){
      char tChar=(char)fis.read();
      tString+=tChar;
    }
    temp=tString.split(" ");
    }
    catch(IOException e){

    }
    return temp;
  }//End of reading from file function

  public static void writeFile(String tString){
    try{
      File file=new File("NewTextFileOrderedList.txt");
      file.createNewFile();
      FileWriter fw=new FileWriter(file);
      fw.write(tString);
      fw.close();
    }
    catch(IOException e){

    }
  }
}
