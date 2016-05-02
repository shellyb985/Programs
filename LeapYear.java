import java.util.Scanner;

public class LeapYear{
  public static void main(String []args){
    int year;
    System.out.println("Enter four digit year : ");
    Scanner scan=new Scanner(System.in);
    year=scan.nextInt();

    if(year<1000){
      System.out.println("Invalid Input");
      return;
    }

    if(year%4 == 0){
      if(year%100 == 0){
        if(year%400 == 0){
          System.out.println("This is leap year");
        }
        else{
          System.out.println("This is not leap year");
        }
      }
      else{
        System.out.println("This is not leap year");
      }
    }
    else{
      System.out.println("This is not leap year");
    }

  }
}
