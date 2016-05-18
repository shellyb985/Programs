package com.bridgelaz.utillity;
import java.util.ArrayList;

public class SortingClass{

  //method to binary search integer
  public int binarySearchInteger(ArrayList<Integer> arrayIntList,int sNum){
    int tNum=0;
    int low=0,up=arrayIntList.size()-1;
    long startTime=System.nanoTime();  //to find current time in milli second before loop
    while(low<=up){
      int mid=(low+up)/2;
      if(sNum == arrayIntList.get(mid)){
        tNum=1;
        break;
      }
      if(sNum<arrayIntList.get(mid)){
        up=mid-1;
      }
      else{
        low=mid+1;
      }
    }
    long endTime=System.nanoTime();  //to find current time in milli second before loop
    if(tNum==1){
      System.out.println("NUMBER FOUND!!!");
    }
    else{
      System.out.println("NUMBER NOT FOUND!!!");
    }
    return (int)(endTime-startTime); //return time elapsed
  }//End of Binary search integer method
//************************************************************************************************
//Binary search string in a list
public int binarySearchString(ArrayList<String> arrayStringList,String sString){
  int tNum=0;
  int low=0,up=arrayStringList.size()-1;
  long startTime=System.nanoTime();  //to find current time in milli second
  while(low<=up){
    int mid=(up+low)/2;
    int check=sString.compareTo(arrayStringList.get(mid));
    //Search string found
    if(check==0){
      tNum=1;
      break;
    }
    //Search String is in 1st half
    else if(check<0){
      up=mid-1;
    }
    //Search string is in 2nd half
    else{
      low=mid+1;
    }
  }
  long endTime=System.nanoTime();  //to find current time in milli second before loop
  if(tNum==1){
    System.out.println("STRING FOUND!!!");
  }
  else{
    System.out.println("STRING NOT FOUND!!!");
  }
  return (int)(endTime-startTime); //return time elapsed
}//End of Binary Search method
//*************************************************************************************************
//Bubble sort method for integer
public int bubbleSortInt(ArrayList<Integer> arrayIntList){
  int size=arrayIntList.size(); //to find size of list
  long startTime=System.nanoTime();  //to find current time in milli second
  for(int i=size;i>0;i--){
    for(int j=0;j<size-1;j++){
      //Swap
      if(arrayIntList.get(j) > arrayIntList.get(j+1)){
        int temp=arrayIntList.get(j);
        arrayIntList.set(j,arrayIntList.get(j+1));
        arrayIntList.set(j+1,temp);
      }//End of if condition
    }//End of for loop
    size--;
  }//End of for loop
  long endTime=System.nanoTime();  //to find current time in milli second before loop
    System.out.println("Bubble sort method for integer");
  System.out.println(arrayIntList);
  return (int)(endTime-startTime); //return time elapsed
}//End of Bubble sort method for Integer
//*********************************************************************************************
//String Bubble sort
public int bubbleSortString(ArrayList<String> arrayStringList){
  int size=arrayStringList.size(); //to find size of array list
  long startTime=System.nanoTime();  //to find current time in milli second
  for(int i=size;i>0;i--){
    for(int j=0;j<size-1;j++){
      //swap
      if((arrayStringList.get(j).compareTo(arrayStringList.get(j+1))) > 0){
          String tString=arrayStringList.get(j);
          arrayStringList.set(j,arrayStringList.get(j+1));
          arrayStringList.set(j+1,tString);
      }//End of if conditon
    }//End od for loop
    size--;
  }//End od for loop
  long endTime=System.nanoTime();  //to find current time in milli second before loop
  System.out.println("String Bubble sort");
  System.out.println(arrayStringList);
  return (int)(endTime-startTime); //return time elapsed
}//End of method Bubble sort String
//***********************************************************************************************
//Integer Insertion sort
public int insertSortInt(ArrayList<Integer> arrayIntList){
  System.out.println("insert int");
  int size; //to find size of array List
  long startTime=System.nanoTime();  //to find current time in milli second
  for(int i=1;i<arrayIntList.size();i++){
    int j=i;
    //Swap
    while(j>0 && arrayIntList.get(j)<arrayIntList.get(j-1)){
      int temp=arrayIntList.get(j);
      arrayIntList.set(j,arrayIntList.get(j-1));
      arrayIntList.set(j-1,temp);
      j--;
    }//End of while loop
  }//End of for loop
  long endTime=System.nanoTime();  //to find current time in milli second before loop
  System.out.println("Integer Insertion sort");
  System.out.println(arrayIntList);
  return (int)(endTime-startTime); //return time elapsed
}//End of Integer Insert Sort
//***********************************************************************************************
//String Insertion sort
public int insertSortString(ArrayList<String> arrayStringList){
  int size=arrayStringList.size();
  long startTime=System.nanoTime();  //to find current time in milli second
  for(int i=1;i<size;i++){
    int j=i;
    //Swap
    while(j>0 && arrayStringList.get(j-1).compareTo(arrayStringList.get(j))>0  ){
      String tString=arrayStringList.get(j);
      arrayStringList.set(j,arrayStringList.get(j-1));
      arrayStringList.set(j-1,tString);
      j--;
    }//End of while loop
  }//End of for loop
  long endTime=System.nanoTime();  //to find current time in milli second before loop
  System.out.println("String Insertion sort");
  System.out.println(arrayStringList);
  return (int)(endTime-startTime); //return time elapsed
}//End of String Insertin Sort method

}
//*************************************************************************************************
