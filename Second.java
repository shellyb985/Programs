import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class Second{
  public static void main(String []args){
    int num,head=0,tail=0,tNum;
    float result;

    Random ranNum=new Random();
    Scanner scan=new Scanner(System.in);
    DecimalFormat df=new DecimalFormat("##.##");
    //Input from user
    System.out.print("Number of time to flip coin : ");
    num=scan.nextInt();
    if(num<1){
      System.out.println("Invalid input");
      return;
    }
    for(int i=0;i<num;i++){
      tNum=(ranNum.nextInt(10)); //Generating random numbers
      if(tNum>=5){  //if random number is positive then increment tail count
        tail++;
      }
      else{ //if  number is negative increment head count
        head++;
      }
       System.out.println("ran="+ranNum+" tail="+tail+" head="+head);
    }
    //calculating percentage
    result=(float)(100*head)/num;
    System.out.println("Head Percentage : "+df.format(result)+"%");
    result=(float)(100*tail)/num;
    System.out.println("Tail Percentage : "+df.format(result)+"%");
  }
}
