import java.util.Scanner;

public class Second{
  public static void main(String []args){
    Integer num,head=0,tail=0;
    double ran;

    Scanner scan=new Scanner(System.in);
    //Input from user
    System.out.println("Number of time to flip coin : ");
    num=scan.nextInt();
    if(num<1){
      System.out.println("Invalid input");
      return;
    }
    for(int i=0;i<num;i++){
      ran=(Math.random());
      if(ran<0.5){
        tail++;
      }
      else{
        head++;
      }
       System.out.println("ran="+ran+" tail="+tail+" head="+head);
    }
    //calculating percentage
    head=(100*head)/num;
    System.out.println("Head Percentage : "+head+"%");
    tail=(100*tail)/num;
    System.out.println("Tail Percentage : "+tail+"%");
  }
}
