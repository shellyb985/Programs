package com.bridgelabz.utility;

import com.bridgelabz.model.Deque;

public class utility<E>{

  public utility(E item){
  }

  public utility(){}

  Deque<E> front;
  Deque<E> rear;
  int size=0;

  //Add front
  public void addFront(E c){
    if(front==null) {  //If no element in list
      Deque<E> tNode=new Deque(c);
      front=tNode;
      rear=front;
    }
    else{ //if elements in list
      Deque<E> tNode=new Deque(c);
      tNode.next=front;
      front.pre=tNode;
      front=tNode;
    }
    size++;
  }
  //Add rear
  public void addRear(E c){
    if(front==null) {  //If no element in list
      Deque<E> tNode=new Deque(c);
      front=tNode;
      rear=front;
    }
    else{ //if elements in list
      Deque<E> tNode=new Deque(c);
      rear.next=tNode;
      tNode.pre=rear;
      rear=tNode;
    }
    size++;
  }
  //remove front
  public E removeFront(){
    E val=null;
    if(front==null){
      System.out.println("No Element to delete");
    }
    else{
      val=front.Data;
      front=front.next;
    }
    size--;
    return val;
  }
  //remove rear
  public E removeRear(){
    E val=null;
    if(front==null){
      System.out.println("No Element to delete");
    }
    else{
      val=rear.Data;
      rear=rear.pre;
      rear.next=null;
    }
    size--;
    return val;
  }
  //
  public boolean isEmpty(){
    if(front==null)
      return true;
    else
      return false;
  }
  //return size of deque
  public int size(){
    return size;
  }
}
