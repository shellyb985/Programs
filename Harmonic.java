import java.util.Scanner;

public class Harmonic{
  public static void main(String []args){
    int num;
    double N=0;
    Scanner scan=new Scanner(System.in);
    //input from user
    System.out.println("Enter the n-th Harmonic Number : ");
    num=scan.nextInt();
    //Checking that nth harmonic number is not 0
    if(num == 0){
      System.out.println("Invalid input");
      return;
    }
    //Calculating nth Harmonic number
    for(int i=1;i<=num;i++){
      N=N+(1.0/i);
    }
    //Printing output
    System.out.println(N);
  }
}
