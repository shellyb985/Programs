package com.bridgelabz.model;
public class Queue{
  public int check; // if i==1 then deposit and if i==2 then withdraw
  public int amount;// amount either deposit or withdraw
  public Queue next;
  public Queue pre;
  /**constructor with parameters
  *if i=1 then deposit and if i=2 then withdraw
  **/
  public Queue(int i,int rs){
    this.check=i;
    this.amount=rs;
    this.next=null;
    this.pre=null;
  }
  //constructor without parameters
  public Queue(){
    this.next=null;
    this.pre=null;
  }
  //return how much amount to deposit or withdraw
  public int getAmount(){
    return amount;
  }
  //if deposit then return 1 and if withdraw return 2
  public int getCheck(){
    return check;
  }
}
