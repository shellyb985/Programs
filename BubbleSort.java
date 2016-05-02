import java.util.Scanner;

public class BubbleSort{
  public static void main(String []args){
    int[] arr=new int[10];
    int n,s;
    Scanner scan=new Scanner(System.in);
    //Input size of user
    System.out.println("Enter the size of an array : ");
    n=scan.nextInt();
    //Input array elemets
    for(int i=0;i<n;i++){
      System.out.print("arr["+i+"] = ");
      arr[i]=scan.nextInt();
    }
    s=n;
    //Sorting array elements
    while(n>0){
      for(int i=1;i<n;i++){
        if(arr[i-1]>arr[i]){
          arr[i-1]=arr[i-1]+arr[i];
          arr[i]=arr[i-1]-arr[i];
          arr[i-1]=arr[i-1]-arr[i];
        }
      }
      n--;
    }
    //Printing array elements
    for(int i=0;i<s;i++){
      System.out.print(arr[i]+", ");
    }

  }
}
