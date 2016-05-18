/**
  *Class for node
**/

package com.bridgelabz;
public class Node{
  public String Data;
  public Node next;
  //constructor
  public Node(){
    this.next=null;
  }
  public void insertNode(String str){
    System.out.println(str);
    Data=str;
    next=null;
  }

}
