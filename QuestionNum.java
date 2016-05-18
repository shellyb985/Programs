/**
  *created by Bridgelabz on 03/05/2016
  *
  *Purpose:
  *TO find guessed number
**/

import java.util.Scanner;

public class QuestionNum{

  public static void find(int low,int up){
    Scanner scan=new Scanner(System.in);
    //Displaying the value
    if(low==up){
      System.out.println("Your number is : "+low);
      System.out.println("Intermediary numbers is "+(low-1)+" and "+(low+1));
      return;
    }
    //Finding middle value between range low and up
    int mid=(low+up)/2;
    int ch;
    System.out.println("Press 1 : "+low+" - "+mid);
    System.out.println("Press 2 : "+(mid+1)+" - "+up);
    ch=scan.nextInt();
    //Number is in first half
    if(ch==1){
      find(low,mid);
    }
    //Number is in second half
    else{
      find(mid+1,up);
    }
  }
//main mmethod
  public static void main(String []args){
    int num;
    //Converting string to Integer
    num=Integer.parseInt(args[0]);
    //calling find method
    find(0,num-1);
  }
}
