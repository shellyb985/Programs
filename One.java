import java.util.Scanner;

public class One{
  public static void main(String []args){
    String name;
    System.out.println("Enter your name : ");

    Scanner scan=new Scanner(System.in);

    name=scan.next();
    if(name.length() >= 3 ){
      System.out.print("Hello "+name+", How are you?");
    }
    else{
      System.out.println("invalid name");
    }
  }
}
