package com.bridgelabz.main;

import java.util.ArrayList;

public class BinarySearch{

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
}
