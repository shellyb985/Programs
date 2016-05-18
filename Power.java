/**
  *This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
  * if 0 <= N < 31 since 2^31 overflows an int
**/
public class Power{
  public static void main(String []args){
    int N=Integer.parseInt(args[0]);
    if(N<0 || N>=31){
      System.out.println("Int Overflow");
      return;
    }

    for(int i=0;i<=N;i++){
      System.out.println("2^ "+i+" = "+(int)Math.pow(2,i));
    }
  }
}
