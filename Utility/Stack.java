package com.bridgelabz.utility;

import com.bridgelabz.utility.model.Node;

public class Stack<E>{

  Node <E>mStartNode;
  int mSize=0;

  //push
  public void push(E item){
    Node tNode=new Node(item);
    tNode.mNextNode=mStartNode;
    mStartNode=tNode;
    mSize++;
  }
  //pop
  public E pop(){
    E val=mStartNode.mData;
    mStartNode=mStartNode.mNextNode;
    mSize--;
    return val;
  }
  //peek
  E peek(){
    return mStartNode.mData;
  }
  //isEmply
  public boolean isEmpty(){
    if(mStartNode==null)
      return true;
    else
      return false;
  }
  //find size
  public int size(){
    return mSize;
  }
}
