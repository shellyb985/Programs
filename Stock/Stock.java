package com.bridgelabz;
/**
  *Created by Bridgelabz on 04/05/2016
  *Purpose:
  *TO Print stock report
  *
**/
import com.bridgelabz.StockPortfolio;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Stock{
  //main method
  public static void main(String []args){
    ArrayList<StockPortfolio> stockList=new ArrayList(); //creating array list
    //Creating object for each stock
    stockList=readStockDetails();
    display(stockList);
    }//End of main function
    //************************************************************************
    //Reading stock Details
    public static ArrayList<StockPortfolio> readStockDetails(){
      ArrayList<StockPortfolio> tempStockList=new ArrayList();
      try {
         BufferedReader in = new BufferedReader(new FileReader("NewTextFile.txt"));
         String str;
          while ((str = in.readLine()) != null) {
            StockPortfolio obj=new StockPortfolio();
            obj.name=str;
            str = in.readLine();
            obj.share=Integer.parseInt(str);
            str = in.readLine();
            obj.price=Double.parseDouble(str);
            obj=calTotalValue(obj); //calling method to calculate total value
            tempStockList.add(obj); //Adding object to array list
          }
         }
         catch (IOException e) {
         }
         return tempStockList;
    }//End of read stock detail method
    //**************************************************************************
    //calculating total value
    public static StockPortfolio calTotalValue(StockPortfolio tempStockPortfolioObj){
        tempStockPortfolioObj.totval=(double)(tempStockPortfolioObj.price*tempStockPortfolioObj.share);
      return tempStockPortfolioObj;
    }
    //**************************************************************************
    //Displaying all stock Details
    public static void display(ArrayList<StockPortfolio> tempStockList){

      System.out.println("\nName\t\tShares\tSharePrice\tTotalPrice");
      for(int i=0;i<tempStockList.size();i++){
        System.out.println(tempStockList.get(i).name+"\t\t"+tempStockList.get(i).share+"\t"+tempStockList.get(i).price+"\t\t"+tempStockList.get(i).totval);
      }//End of display method

    }
  }
