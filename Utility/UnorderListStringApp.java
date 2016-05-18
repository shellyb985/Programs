package com.bridgelabz.main;

import java.util.Scanner;
import com.bridgelabz.utility.UnorderList;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.File;

public class UnorderListStringApp{
  public static void main(String []args){
    Scanner scan=new Scanner(System.in);
    UnorderList<String> UILObject=new UnorderList();

    //calling function to read from file
    String[] temp=readFile();

    for(int i=0;i<temp.length;i++){
      UILObject.append(temp[i]);
    }

    System.out.println(".........UnorderList word Search..........");
    System.out.print("Enter the word to Search : ");
    String tString=scan.next();

    int tNum=UILObject.removeAtItem(tString);
    if(tNum==1){
      System.out.println("Word Found and removed from the list");
    }
    else{
      UILObject.append(tString);
    }
    tString=UILObject.display();
    System.out.println("Fianal String :"+tString);
    writeFile(tString);
  }
  //Read data from the file, store it in a string and return that string
  public static <E>[] readFile(){
    <E> []temp=null;
    try{
    FileInputStream fis=new FileInputStream("NewTextFile.txt");
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
  }
  //write modified string to file
  public static void writeFile(String tString){
    try{
      File file=new File("NewTextFile.txt");
      file.createNewFile();
      FileWriter fw=new FileWriter(file);
      fw.write(tString);
      fw.close();
    }
    catch(IOException e){

    }
  }
}
