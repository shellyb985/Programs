package com.bridgelabz.main;

import com.bridgelabz.utility.utility;
import java.util.Scanner;
//main Bank Cash Counter class
public class BankCashCounter{
  //Main function
  public static void main(String []args){
    //Creating object for class
    utility ut=new utility();
    Scanner scan=new Scanner(System.in);

    while(true){
      System.out.println("............Bank Cash Counter...........");
      System.out.println("\t1.Deposit Cash");
      System.out.println("\t2.WithDraw Cash");
      System.out.println("\t3.Get Service");
      System.out.println("\t4.Size of Queue");
      System.out.println("\t5.Exit");
      System.out.println("\t6.Display");
      System.out.print("Enter your choice : ");
      int ch=scan.nextInt();
      int amount=0;
      //if option to deposite or withdraw
      if(ch==1 || ch==2){
        System.out.print("Enter the Amount : ");
        amount=scan.nextInt();
      }
      switch(ch){
        case 1 :  ut.enQueue(1, amount);  //deposit
                  break;
        case 2 :  ut.enQueue(2,amount); //withdraw
                  break;
        case 3 :  ut.getService();
                  break;
        case 4 :  System.out.println("No of person : "+ut.size()); //check size of queue
                  break;
        case 5 :  System.out.println(".........Thank you........."); //exiting from program
                  return ;
        case 6 :  ut.display();
                  break;
        default : System.out.println("Invalid Key Pressed..!!!");
      }//end of switch case

    }//End of while loop
  }//End of main function
}//End of class
