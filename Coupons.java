/**created by Bridgelabz on 03/05/2016
  *<p>
  *Purpose:
  *Generating Distinct coupon numbers
*/
import java.util.Scanner;
import java.util.ArrayList;

public class Coupons{
  //method to generate random numbers
  public static int randomNumber(){
    return (int)(Math.random()*10000);//return random number

  }

  public static void main(String []args){
    int num,temp,temp1;
    //Creating arraylist
    ArrayList<Integer> mylist= new ArrayList<Integer>();
    Scanner scan=new Scanner(System.in);
    //Input no of distinct coupons
    System.out.print("Enter the total Distinct coupon : ");
    num=scan.nextInt();
    //Cenerating and checking coupons
    while(num>0){
      int flag=0;
      //generating random numbers
      temp=randomNumber();
      int siz=mylist.size();
      //checking that generated number is not in list or not
      for(int i=0;i<mylist.size();i++){
        temp1=mylist.get(i);
        if(temp1==temp){
          flag=1;
          break;
        }
      }
      //if generated number is not in list then it will be added
      if(flag==0){
        mylist.add(temp);
      }
      else{
        num++;
      }
      num--;
    }
    //Displaying all Coupons
    System.out.println("Coupon Numbers :");
    for(int i=0;i<mylist.size();i++){
      if(mylist.get(i)<1000){
        System.out.print("0");
      }
      if(mylist.get(i)<100){
        System.out.print("0");
      }
      if(mylist.get(i)<10){
        System.out.print("0");
      }
      System.out.println(mylist.get(i));
    }

  }

}
