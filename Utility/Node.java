package com.bridgelabz.utility.model;

public class Node<E>{
  public E mData;
  public Node<E> mNextNode;
  public Node<E> mPreNode;

  //default constructor
  public Node(){  }

  //constructor with parameter
  public Node(E value){
    mData=value;
    this.mNextNode=null;
    this.mPreNode=null;
  }
  
}
