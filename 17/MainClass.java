package com.bridgelaz;
/**
*Created by bridgelaz on 05/05.2016
*Purpose:
*Main function to call utillity class
*To find elapsed time
*
**/
import java.util.Scanner;
import java.util.ArrayList;
import com.bridgelaz.utillity.SortingClass;

public class MainClass{
  public static void main(String []args){

    ArrayList<Integer> arrayIntList=new ArrayList(); //to store integer in list
    ArrayList<String> arrayStringList=new ArrayList(); //to store String in list
    int[] arr=new int[6];
    Scanner scan=new Scanner(System.in);
    //Creating object
    SortingClass sortobj=new SortingClass();

    //User option
    while(true){
      System.out.print("\t1.Add Integer\n\t2.Add String\n\t3.Call functions\n\t4.Exit");
      System.out.print("\nEnter your Choice : ");
      int ch=scan.nextInt(); //to store choice
      int tNum;
      switch(ch){
        case 1 : //Adding integer
                 System.out.print("Enter the number : ");
                 arrayIntList.add(scan.nextInt()); //Adding list
                 break;
                 //Addint String
        case 2 : System.out.print("Enter the String : ");
                 arrayStringList.add(scan.next());  //Adding list
                 break;
                 //to Call all functions
        case 3 :
                  //Integer insertion sort
                  arr[2]=sortobj.insertSortInt(arrayIntList); // calling insertion sort integer
                  //String Insertion Sort
                  arr[3]=sortobj.insertSortString(arrayStringList); // calling insertion sort integer
                  //Integer Bubble Sort
                  arr[4]=sortobj.bubbleSortInt(arrayIntList);
                  //String Bubble sort
                  arr[5]=sortobj.insertSortString(arrayStringList);
                  //Binary Search Integer
                  arrayIntList=getArrayElementInt();
                  System.out.print("Enter the number to search : ");
                  tNum=scan.nextInt();
                  arr[0]=sortobj.binarySearchInteger(arrayIntList,tNum);//calling binary search integer method
                  //String Binary Search
                  arrayStringList=getArrayElementString();
                  System.out.print("Enter the String to search : ");
                  String tString=scan.next();
                  arr[1]=sortobj.binarySearchString(arrayStringList,tString);//calling binary search integer method
                  //Displaying Output

                  for(int i=0;i<6;i++){
                    System.out.println(arr[i]);
                  }
                  //tIMEELAPED(arr);

                  break;
                  //Exit
        case 4 : System.out.println("ThanK You....");
                  return ;
                  //Default choice
        default : System.out.println("Invalid Choice !!!");
      }//End of Switch case
    }//End of while loop
  }//End of main function
//***************************************************************************************************************************
  //this Method will print descending order based on time elapsed
  public static void tIMEELAPED(int[] arr){
    System.out.println("in function");
    int tNum=arr[0];
    for(int i=6;i>0;i--){
      for(int j=0;j<6 && arr[j]>0;j++){
        if(tNum<arr[j]){
          tNum=j;
        }
        switch(tNum){
          case 0: System.out.println("Integer Binary Search and elapsed time : "+arr[tNum]);
                  arr[tNum]=-1;
                  break;
          case 1: System.out.println("String Binary Search and elapsed time : "+ arr[tNum]);
                  arr[tNum]=-1;
                  break;
          case 2: System.out.println("Integer insertion sort and elapsed time : "+arr[tNum]);
                  arr[tNum]=-1;
                  break;
          case 3: System.out.println("String insertion sort and elapsed time : "+arr[tNum]);
                  arr[tNum]=-1;
                  break;
          case 4: System.out.println("Integer Bubble Sort and elapsed time : "+arr[tNum]);
                  arr[tNum]=-1;
                  break;
          case 5: System.out.println("String Bubble Sort and elapsed time : "+arr[tNum]);
                  arr[tNum]=-1;
                  break;
        }//End of switch statement
      }//End of for loop
    }//End of for loop
    System.out.println("Out fun");
  }//End of static function TIMEELAPED
  //**********************************************************************************************************
  public static ArrayList<Integer> getArrayElementInt(){
    ArrayList<Integer> arrayIntList=new ArrayList(5);
    System.out.println("BS: Enter the number in sorted order : ");
    Scanner scan =new Scanner(System.in);
    while(true){
      System.out.println("\t1.Add Elemen\n\t2.TO Search");
      int ch;
      ch=scan.nextInt();
      if(ch==1){
        System.out.print("Enter the number to add : ");
        arrayIntList.add(scan.nextInt());;
      }
      else if(ch==2){
        return arrayIntList;
      }
    }//End of while loop
  }//End of method
//********************************************************************************************************************
public static ArrayList<String> getArrayElementString(){
  ArrayList<String> arrayStringList=new ArrayList(5);
  System.out.println("BS: Enter the word in sorted order : ");
  Scanner scan =new Scanner(System.in);
  while(true){
    System.out.println("\t1.Add Elemen\n\t2.TO Search");
    int ch;
    ch=scan.nextInt();
    if(ch==1){
      System.out.print("Enter the Word : ");
      arrayStringList.add(scan.next());;
    }
    else if(ch==2){
      return arrayStringList;
    }
  }//End of while loop
}//End of method


}//End of main class
