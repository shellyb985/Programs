/**
  *purpose:
  *Read in N integers and counts the   number of triples that sum to exactly 0.
**/
import java.util.Scanner;
public class SumZero{

  public static void main(String []args){
    Scanner scan=new Scanner(System.in);
    int size;
    System.out.print("Number of Interger : ");
    size=scan.nextInt();
    System.out.print("Enter the numbers : ");
    int[] a=new int[size];
    for(int i=0;i<size;i++){
      a[i]=scan.nextInt();
    }
    //Creating object
    SumZero sumobj=new SumZero();
    //calling method
    sumobj.triplefun(a,size);
  }

  void triplefun(int[] a,int size){
    int sum,count=0;
    System.out.println("");
    for(int i=2;i<size;i++){
      sum=a[i-2]+a[i-1]+a[i];
      if(sum==0){
        count++;
        System.out.println(count+". "+a[i-2]+" "+a[i-1]+" "+a[i]);
      }
    }
    System.out.println("Total number of triplets : "+count);
  }
}
