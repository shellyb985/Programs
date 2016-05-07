package com.bridgelabz;
/**
  *Created by bridgelabz on 05/05/2016
  *Purpose:
  *reading in 2D arrays of integers, doubles, or booleans from standard input and printing them out to standard output
**/

import java.util.Scanner;
import java.io.PrintWriter;

public class Array{

  public static void main(String []args){
    int row,col; //to store row and col
    Scanner scan=new Scanner(System.in);
    System.out.print("Row : ");
    row=scan.nextInt();
    System.out.print("Col : ");
    col=scan.nextInt();
    //Calling methods
    int[][] arrInt=twoArrayInt(row,col);
    double[][] arrDouble=twoArrayDouble(row,col);
    boolean[][] arrbool=twoArrayBoolean(row,col);
    //Calling display method
    disp(arrInt,arrDouble,arrbool,row,col);

  }
  //method to read and print 2D array int
  public static int[][] twoArrayInt(int row,int col){
    int arrInt[][]=new int[row][col];
    Scanner scan=new Scanner(System.in);

    System.out.println("Integer Array");
    //loop for ror
    for(int i=0;i<row;i++){
      //loop for col]
      for(int j=0;j<col;j++){
        arrInt[i][j]=scan.nextInt();
      }//End of for loop
    }//End of or loop
    return arrInt;
  }//End of method

  //method read and print 2D array Double
  public static double[][] twoArrayDouble(int row,int col){
  //method to read and print 2D array double
    double arrDouble[][]=new double[row][col];
    Scanner scan=new Scanner(System.in);
    System.out.println("Double Array");
    //loop for ror
    for(int i=0;i<row;i++){
      //loop for col]
      for(int j=0;j<col;j++){
        arrDouble[i][j]=scan.nextDouble();
      }//End of for loop
    }//End of or loop
    return arrDouble;
  }//End of method

  //method read and print 2D array Boolean
  public static boolean[][] twoArrayBoolean(int row,int col){
  //method to read and print 2D array double
    boolean arrBool[][]=new boolean[row][col];
    Scanner scan=new Scanner(System.in);
    System.out.println("Boolean Array");
    //loop for row
    for(int i=0;i<row;i++){
      //loop for col]
      for(int j=0;j<col;j++){
        arrBool[i][j]=scan.nextBoolean();
      }//End of for loop
    }//End of or loop
    return arrBool;
  }//End of method

  //Displaymethod
  public static void disp(int[][] arrInt,double[][] arrDouble,boolean[][] arrBool,int row,int col){
    System.out.println("in");
    PrintWriter pw=new PrintWriter(System.out,true);

    //Display integers
    pw.println("2D ARRAY INTEGER");
    //loop for row

    for(int i=0;i<row;i++){
      //loop for col
      for(int j=0;j<col;j++){
        pw.print("\t"+arrInt[i][j]+"   ");
      }//End of for loop
      pw.println("\t");
    }//End of or loop

    //Display double
    pw.println("2D ARRAY DOUBLE");
    for(int i=0;i<row;i++){
      //loop for col
        for(int j=0;j<col;j++){
          pw.print("\t"+arrDouble[i][j]+"   ");
      }//End of for loop
      pw.println("");
    }//End of or loop

    //Display bool
    pw.println("2D ARRAY Boolean");
    for(int i=0;i<row;i++){
      //loop for col
      for(int j=0;j<col;j++){
        pw.print("\t"+arrBool[i][j]+"   ");
      }//End of for loop
      pw.println("");
    }//End of or loop
  }//End of method   */

}//End of class
