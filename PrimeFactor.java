/**
  *created bt BridgeLabz on 04/05/2016
  *
  *Purpose:
  *Displaying prime factor for given number
**/

import java.util.Scanner;
public class PrimeFactor{

  public static void main(String []args){
    int num;
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the number : ");
    //Getting number to find prime factor
    num=scan.nextInt();
    //Creating object for class PrimeFactor
    PrimeFactor Primeobj=new PrimeFactor();
    //Calling Primefun method
    Primeobj.PrimeFun(num);

  }
  //Method to find prime factor
  void PrimeFun(int num){
    int n=2;
    while(n<num/2){
      //calling method to check for prime or not
      int i=prime(n);
      if(i==1){
        //Displaying Prime Factor number
        if(num%n==0){
          System.out.print(n+"  ");
        }
      }
      n++;
    }
  }
  //method to check number is prime or not
  int prime(int num){
    int n=num/2,flag=0;
    for(int i=2;i<=n;i++){
      //If number is not prime then return 0
      if(num%i==0){
        flag=1;
        return 0;
      }
    }
    //If the number is prime then return 1
    return 1;
  }
}
