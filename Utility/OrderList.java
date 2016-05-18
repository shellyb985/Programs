package com.bridgelabz.utility;

import java.io.IOException;
import com.bridgelabz.utility.model.Node;

public class OrderList<E>{
  Node<E> startNode;
  Node<E> endNode;
  int size=0;
  //************************************
  //Add elements in to the list
  public void add(E item){
    if(startNode==null){
      Node<E> newNode=new Node(item);
      startNode=newNode;
      endNode=newNode;
    }
    else{
      Node<E> newNode=new Node(item);
      Node<E> tNode=startNode;
      if((Integer)item<(Integer)startNode.mData){
        startNode.mPreNode=newNode;
        newNode.mNextNode=startNode;
        startNode=newNode;
        size++;
        return;
      }
      while(tNode.mNextNode!=null){
        if((Integer)item<(Integer)(tNode.mData)){
          System.out.println("true");
          newNode.mNextNode=tNode.mNextNode;
          tNode.mNextNode.mPreNode=newNode;
          tNode.mNextNode=newNode;
          size++;
          return ;
        }
        tNode=tNode.mNextNode; //for loop
      }
      tNode.mNextNode=newNode;
      newNode.mPreNode=tNode;
      endNode=newNode;
    }
    size++;
  }//End of add function
  //****************************************
  //remove for list by item
  public boolean remove(E item){
    if(startNode.mData==item){    //for first node
      startNode=startNode.mNextNode;
      startNode.mPreNode=null;
      size--;
      return true;
    }
    if(endNode.mData==item){    //for last node
      endNode=endNode.mPreNode;
      endNode.mNextNode=null;
      size--;
      return true;
    }
    Node<E> tNode=startNode.mNextNode;
    while(tNode!=null){
      if(item==tNode.mData){
        tNode.mPreNode.mNextNode=tNode.mNextNode;
        tNode.mNextNode.mPreNode=tNode.mPreNode;
        size--;
        return true;
      }
      tNode=tNode.mNextNode;
    }
    return false;
  }//end of remove function
  //**************************************
  //Seaech item in list
  public boolean search(E item){
    Node<E> tNode=startNode;
    while(tNode!=null){
      if(tNode.mData==item){
        return true;
      }
      tNode=tNode.mNextNode;
    }
    return false;
  }//End if search function
  //**************************************
  //function return size of list
  public int size(){
    return size;
  }//end of return size function
  //**************************************
  //Return at item at specific position
  public E index(int position) throws Exception{
    if(position>=size){
      throw new Exception();
    }
    Node<E> tNode=startNode;
    while(position>1){
      tNode=tNode.mNextNode;
      position--;
    }
    return tNode.mData;

  }//end of function
  //*************************************
  //pop last elements
  public E removeAtLast() throws Exception{
    if(startNode==null){
      throw new Exception();
    }
    E temp=endNode.mData;
    endNode=endNode.mPreNode;
    endNode.mNextNode=null;
    return temp;
  }//End of remove at last element
//************************************
//Remove elements at specific position
public E removeAtPosition(int position)throws Exception{
  if(position>=size){
    throw new Exception();
  }
  Node<E> tNode=startNode;
  while(position>1){
    tNode=tNode.mNextNode;
    position--;
  }
  E temp;
  if(tNode==startNode){
    temp=startNode.mData;
    startNode=null;
    return temp;
  }
  if(tNode==endNode){
    temp=endNode.mData;
    endNode=endNode.mPreNode;
    endNode.mNextNode=null;
    return temp;
  }
    temp=endNode.mData;
    tNode.mNextNode.mPreNode=tNode.mPreNode;
    tNode.mPreNode.mNextNode=tNode.mNextNode;
    return temp;
}
//**************************************
//display
public String display(){
  Node tNode=startNode;
  String tString="";
  while(tNode!=null){
    tString+=tNode.mData;
    tString+=" ";
    System.out.println(tNode.mData);
    tNode=tNode.mNextNode;
  }
  return tString;
}
//****************************************
}
