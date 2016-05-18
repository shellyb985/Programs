package com.bridgelabz.model;
public class Deque<E>{

  public E Data;
  public Deque<E> next;
  public Deque<E> pre;
  //Constrctor
  public Deque(){
    this.next=null;
    this.pre=null;
  }
  public Deque(E val){
    this.Data=val;
    this.next=null;
    this.pre=null;
  }

}
