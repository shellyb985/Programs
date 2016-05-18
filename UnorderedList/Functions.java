package com.bridgelabz;

import com.bridgelabz.Node;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.StringBuilder;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.File;

public class Functions{

  //Reading string from file
  public Node read(Node start){
    try{
      BufferedReader bf=new BufferedReader(new FileReader("NewTextFile.txt"));
      FileInputStream fis = new FileInputStream("NewTextFile.txt");
      char tChar;
      String tString="";
      while (fis.available() > 0) {
        tChar = (char) fis.read();
        tString+=tChar;
      }
       String[] temp = tString.split(" ");
       for(int i =0; i < temp.length ; i++){
         start= insert(start,temp[i]);
        }
    }
    catch(IOException e){
    }
    return start;
  }//End of read method
  //***********************************************************
  //Insert words
  public Node insert(Node tNode,String str){
    Node tNode1=tNode;
    Node newNode=new Node();
    newNode.Data=str;
    newNode.next=null;

    if(tNode==null){
      return newNode;
    }
    else{
      while(tNode.next!=null){
        tNode=tNode.next;
      }
      tNode.next=newNode;
    }
    return tNode1;
  }//End of insert method
  //*******************************************************************
  //Search words
  public Node search(Node tNode,String tString){

    Node temp=tNode;
    while(tNode.next!=null){
      if(tString.compareTo((tNode.next).Data)==0){
        tNode.next=(tNode.next).next;
        System.out.println("Word Found");
        return temp;
      }
      tNode=tNode.next;
    }
    System.out.println("Word NOT Found");
    temp=insert(temp,tString);
    return temp;
  }//End of Search word
  //writeToFile




  public void writeToFile(String nString){
    try{
      File file=new File("NewTextFile.txt");
      file.createNewFile();
      FileWriter fw=new FileWriter(file);

          fw.write(nString);



    fw.close();
    }
    catch(IOException e){

    }
  }
}
