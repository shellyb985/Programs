/**
  *Created by Bridgelabz on 04/05/2016
  *Purpose:
  *TO Print stock report
  *
**/

import java.util.Scanner;
public class Stock{

  public static void main(String []args){
    int n;
    System.out.print("Number of Stock : ");
    Scanner scan=new Scanner(System.in);
    //Getting number of stock from user
    n=scan.nextInt();
    StockPortfolio[] stockobj=new StockPortfolio[n];
    //Creating object for each stock
    for(int i=0;i<n;i++){
      System.out.println("\nStock Details: ");
      stockobj[i]=new StockPortfolio();
    }
    //Displaying all stock Details
    System.out.println("\nName\t\tShares\tSharePrice\tTotalPrice");
    for(int i=0;i<n;i++){
      stockobj[i].displaystock();
    }
  }
}
//Class for stock details
class StockPortfolio{
  String name;
  double price;
  int share;
  double totval;
  //Constructor - To get all stock details
  StockPortfolio(){
    //Getting stock names
    Scanner scan=new Scanner(System.in);
    System.out.print("Stock Name : ");
    name=scan.next();
    //Getting number of shares
    System.out.print("No of Shares : ");
    share=scan.nextInt();
    //Getting share price
    System.out.print("Share price : ");
    price=scan.nextInt();
    //Calling method to calculate total stock value
    StockValue();
  }
  //Method to calculate total share price
  void StockValue(){
    totval=share*price;

  }
  //method to display Stock details
  void displaystock(){
    System.out.println(name+"\t\t"+share+"\t "+price+"\t\t"+totval);
  }
}
