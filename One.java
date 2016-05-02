import java.util.Scanner;

public class One{
  public static void main(String []args){
    String name;
    System.out.println("Enter your name : ");

    Scanner scan=new Scanner(System.in);

    name=scan.nextLine();
    if(name.length() >= 3 ){
      System.out.println("Hello "+name+", How are you?");
    }
    else{
      System.out.println("invalid name");
    }
  }
}
