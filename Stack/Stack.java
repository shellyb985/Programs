package com.bridgelabz.model;
public class Stack{
  public int Data;
  public Stack next;
  public Stack pre;

  //constructor
  public Stack(int i){
    Data=i;
    this.next=null;
    this.pre=null;
  }
  public Stack(){
    this.next=null;
    this.pre=null;
  }
}
