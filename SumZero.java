import java.util.Scanner;
public class SumZero{

  public static void main(String []args){
    Scanner scan=new Scanner(System.in);
    int size;
    System.out.print("Number of Interger : ");
    size=scan.nextInt();
    int[] a=new int[size];
    for(int i=0;i<size;i++){
      a[i]=scan.nextInt();
    }
    SumZero sumobj=new SumZero();
    sumobj.triplefun(a,size);
  }

  void triplefun(int[] a,int size){
    int sum,count=0;
    for(int i=2;i<size;i++){
      sum=a[i-2]+a[i-1]+a[i];
      if(sum==0){
        System.out.println(a[i-2]+" "+a[i-1]+" "+a[i]);
        count++;
      }
    }
    System.out.println("Total number of triplets : "+count);
  }
}
