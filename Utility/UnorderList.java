package com.bridgelabz.utility;
/**
  *Maintain unorder list
  *add elements at begining,end and specific position
  *remove element by position,item
**/
import com.bridgelabz.utility.model.Node;
public class UnorderList<E>{

    int size=0;
    Node<E> startNode;
    Node<E> endNode;

    //***************************************
  //Add item into list at begining
  public void mAdd(E item){
    if(startNode==null){  //No elements in the list
      Node<E> tempNode=new Node(item);
      startNode=tempNode;
      endNode=startNode;
    }
    else{ //Already some elements in the list
      Node<E> tempNode=new Node(item);
      startNode.mPreNode=tempNode;
      tempNode.mNextNode=startNode;
      startNode=tempNode;
    }
    size++;
  }//End of add function
  //*********************************************
  //Insert item at specific position
  public void insertAtPosition(int position,E item){
    if(position>size+1){
      System.out.println("No enough existing items in the list");
      return ;
    }
    else{
      Node<E> tempNode=startNode;
      while(position>1){
        tempNode=tempNode.mNextNode;
        position--;
      }
      Node<E> tempNode1=new Node(item);
      tempNode.mNextNode.mPreNode=tempNode1;
      tempNode1.mNextNode=tempNode.mNextNode;
      tempNode1.mPreNode=tempNode;
      tempNode.mNextNode=tempNode1;
    }
    size++;
  }//End of insert at specific position at list
  //**************************************************
  //Insert item at the end
  public void append(E item){
    if(startNode==null){  //No elements in the list
      Node<E> tempNode=new Node(item);
      startNode=tempNode;
      endNode=startNode;
    }
    else{ //Already some elements in the list
      Node<E> tempNode=new Node(item);
      endNode.mNextNode=tempNode;
      tempNode.mPreNode=endNode;
      endNode=tempNode;
    }
    size++;
  }
  //**************************************************
  //Remove at End
  public E removeAtEnd(){
    E tempData=null;
    if(size<1){
      System.out.println("No items in the list");
    }
    else{
      tempData=endNode.mData;
      endNode=endNode.mPreNode;
      endNode.mNextNode=null;
    }
    return tempData;

  }//End of remove at end funvtion
  //*************************************************
  //Remove at specific position
  public E removeAtPosition(int position){
    E tempData=null;
    if(position>size){
      System.out.println("No item exist at the position");
    }
    else{
      Node<E> tempNode=startNode;
      while(position>1){
        tempNode=tempNode.mNextNode;
        position--;
      }
      tempData=tempNode.mData;
      tempNode.mPreNode.mNextNode=tempNode.mNextNode;
    }
    return tempData;

  }//End of remove at position function
  //**************************************************
  //Remove item from the list
  public int removeAtItem(E item){

    if(startNode.mData.equals(item)){
      startNode=startNode.mNextNode;
      startNode.mPreNode=null;
      return 1;
    }
    if(endNode.mData.equals(item)){
      removeAtEnd();
      return 1;
    }
    Node<E> tempNode=startNode.mNextNode;
    while(tempNode!=null){

      if(item.equals(tempNode.mData)){
        tempNode.mPreNode.mNextNode=tempNode.mNextNode;
        return 1;
      }
      tempNode=tempNode.mNextNode;
    }
    return 0;
  }//End of remove function
  //**********************************************
  //if list is empty return true else teturn false
  public boolean isEmpty(){
    if(startNode==null){
      return true;
    }
    else{
      return false;
    }
  }//End od isEmpty function
  //*********************************************
  //function return size of list
  public int size(){
    return size;
  }//End of size function
  //*********************************************
  //function return item index if not found return -1
  public int mIndex(E item){
    int index=0;
    Node<E> tempNode=startNode;
    while(tempNode!=null){
      if(item.equals(tempNode.mData)){
        return index;
      }
      index++;
      tempNode=tempNode.mNextNode;
    }
    return -1;
  }//End of index function
  //********************************************
  public  String display(){
    Node tNode=startNode;
    String tString="";
    while(tNode!=null){
      System.out.println(tNode.mData);
      tString+=tNode.mData;
      tString+=" ";
      tNode=tNode.mNextNode;
    }
    return tString;
  }
  //********************************************
}//End of UnorderedList class
