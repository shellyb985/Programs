package com.bridgelaz;

/**
  *created by bridgelabz on 03/05/2016
  *<p>
  *Purpose:
  *Gambler game stimulation
*/
import java.util.Scanner;

public class Gambler{

  public static void main(String []args){
    int stake,goal,no;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the Stake : ");
    stake=scan.nextInt();

    System.out.print("Enter the goal : ");
    goal=scan.nextInt();

    System.out.print("Enter the no of time to bet : ");
    no=scan.nextInt();
    //Calling function
    play(stake,goal,no);

  }

  //Method for playing game
  public static void play(int st,int gl,int no){
    int bet,win=0,loss=0,cash;
    //No of time game to be played
    for(int i=0;i<no;i++){
      cash=st;
      while(cash>0 && cash<gl){
        if(Math.random()>=0.5){
          cash++;
        }
        else{
          cash--;
        }
      }
      //Checking win or loss
      if(cash==gl){
        win++;
      }
      else{
        loss++;
      }
    }

    //Displaying output
    System.out.println("No of Win : "+win);
    System.out.println("No of Loss : "+loss);
    System.out.println("Win percentage : "+(win*100.0)/no+"%");
    System.out.println("Loss Percentage : "+(loss*100.0 )/no+"%");
  }
}
