package com.bridgelabz.utility;

import com.bridgelabz.model.Queue;

public class utility{
  Queue start;
  Queue end;
  int size=0;
  public int totAmount=20000;  //initial cash balance

  //***************************************************
  //Enqueue
  public void enQueue(int i,int rs){
    Queue tNode=new Queue(i,rs);
    if(start==null){ //if Queue is empty
      start=tNode;
      end=start;
    }
    else{ //if queue is not empty
      end.next=tNode;
      tNode.pre=end;
      end=tNode;
    }
    size++;
  }//End of enQueue
  //*****************************************************
  //Dequeue
  public int deQueue(){
    int temp=0;
    if(start==null){//if Queue is empty
      System.out.println("Queue is Empty....!");
    }
    else{ //if queue is not empty
      temp=start.amount;
      start=start.next;
      start.pre=null;
      //start.pre=null;
    }
    size--;
    return temp;
  }//End of deQueue
  //******************************************************
  //check queue is empty or not
  public boolean isEmpty(){
    if(start==null)
      return true;
    else
      return false;
  }
  //return size
  //*******************************************************
  public int size(){
    return size;
  }//End of isEmpty
  //*******************************************************
  //To give service
  public void getService(){
    Queue tNode=start;
    //if queue is empty
    if(size<=0){
      System.out.println("Queue is empty....... ");
      return ;
    }
    //1.------------to withdraw-----------
    if(tNode.getCheck()==2){
      //cond.1-----withdraw amount greater than cash balance
      if(tNode.getAmount()>totAmount){
        System.out.println("Insufficient Fund....Wait in Queue");
        while(tNode.next!=null){
          if(tNode.getCheck()==1 )
            break;
          tNode=tNode.next;
        }//End of while loop
          if(tNode.getCheck()==1){
            Queue tNode1=start;
            tNode.pre.next=tNode.next;
            start.pre=tNode;
            tNode.next=start;
            tNode.pre=null;
            start=tNode;
            }
      }//End of if condition
      //cond.2----withdraw amount greater than or equal to cash balance
      else{
        totAmount-=deQueue();
        System.out.println("Withdrawal Completed.....");
      }//
    }//End of if condition
    //2.------------to deposit-------------
    else{
      totAmount+=deQueue();
      System.out.println("Money Deposited.....");
    }
  }//End of getService function
  //******************************************************
  //
  public void display(){
    Queue temp=start;
    if(isEmpty()){
      System.out.println("Queue is empty....... ");
      System.out.println("Total Balance : "+totAmount);
      return;
    }
    while(temp!=null){
      System.out.println(temp.getCheck()+"  "+temp.getAmount());
      temp=temp.next;
    }
    System.out.println("Total Balance : "+totAmount);
  }
}//End of utility class
