package com.bridgelabz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileWriter;

public class Function{

public Node readFile(Node tNode){
    try{
      //BufferedReader bf=new BufferedReader("available");
      FileInputStream fis=new FileInputStream("NewTextFile.txt");
      char tChar;
      String tString="";
      //Reading from file and storing it in string
      while(fis.available()>0){
        tChar=(char)fis.read();
        tString+=tChar;
      }//End of while
      //Spliting the string
      String[] temp=tString.split(" ");
      int[] arr=new int[temp.length-1];

      for(int i=0;i<temp.length-1;i++){
        arr[i]=Integer.parseInt(temp[i]); //converting string to integer
      }
      arr=sort(arr);

      for(int i=0;i<temp.length-1;i++){
        tNode=insert(tNode,arr[i]); //calling insert method
      }
    }
    catch(IOException e){
    }
    return tNode;
  }//End of read method
  //**********************************************************************
  //Inserting in linked list
  public Node insert(Node tNode,int num){

    Node tNode1=tNode;
    Node newNode=new Node();
    newNode.Data=num;
    if(tNode==null){
      newNode.next=null;
      return newNode;
    }
    else{
      while(tNode.next!=null){
        tNode=tNode.next;
      }
      tNode.next=newNode;
    }
    return tNode1;
  }//End of inserting list
  //*********************************************************************
  //Sorting linked list in accending order
  public int[] sort(int[] arr ){
    int size=arr.length;
    for(int i=size;i>0;i--){
      for(int j=1;j<size;j++){
        if(arr[j-1]>arr[j]){
          int temp=arr[j-1];
          arr[j-1]=arr[j];
          arr[j]=temp;
        }
      }
      size--;
    }
    return arr;
  }//End of sorting method
  //**********************************************************************
/*  //Searching number
  public int search(Node tNode, int num){
    Node temp=tNode;
    //Search Node is first node
    if(tNode.Data==num)
    {
      return 2;
    }
    while(tNode!=null){
      if((tNode.next).Data==num){
        //Search number is last number in list
        if(tNode.next.next==null){
          return 3;
        }
        tNode.next=(tNode.next).next;
        return 1;
      }

      tNode=tNode.next;
    }//End of while
    System.out.println("Number Not found");
    return 0;
  }//End of searching method                         */
  //*********************************************************************
  ////Searching number
  public Node search(Node tNode1, int num){
    Node tNode=tNode1;
    //No elements in an list(List empty)
    if(tNode==null){
      Node newNode=new Node();
      newNode.Data=num;
      tNode=newNode;
      return tNode; //
    }
    //Search number is first in list
    if(tNode.Data==num){
      tNode=null;
      return tNode1; //
    }
    //Search num
    while(tNode!=null){
      if(tNode.next==null){
        return tNode1;
      }
      //
      if(tNode.next.Data==num){
        tNode.next=tNode.next.next;
        return tNode1;
      }
      tNode=tNode.next;
    }
    return tNode1;
  }
  //*********************************************************************
/*  //Display method
  public void display(Node tNode){
    Node tNode1=tNode;
    while(tNode1!=null){
      System.out.println(tNode1.Data);
      tNode1=tNode1.next;
    }
  }//End od display method
  */
  //*******************************************************************
  //method to write in file
  public void writeFile(Node tNode){
    try{
      String tString="";
      File file=new File("NewTextFile.txt");
      file.createNewFile();
      FileWriter fw=new FileWriter(file);
      while(tNode!=null){
        tString+=String.valueOf(tNode.Data);
        tString+=" ";
        tNode=tNode.next;
      }
      System.out.println("string "+tString );
      fw.write(tString);
      fw.close();
    }
    catch(IOException e){
    }
  }
}
