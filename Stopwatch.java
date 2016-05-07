/** created by Bridgelabz on 03/05/2016
  *<p>
  *Purpose:
  *Stimulate Stopwatch
*/

import java.util.Scanner;
public class Stopwatch{

  //Converting millisecond to hr,min,sec and Displaying
  public static void caltime(int msec){
    int sec,min,hr;
    hr=msec/(60*60*1000);
    msec=msec-(hr*60*60*1000);
    min=msec/(1000*60);
    msec=msec-(min*1000*60);
    sec=msec/1000;
    //Displaying the Elapsed time
    System.out.println("Elapsed Time");
    System.out.println("hr\tmin\tsec");
    System.out.println(hr+"\t"+min+"\t"+sec);
  }

//method to calculate Elapsed time
  public static void timer(){
    //Getting current(start) time in millisecond
    long start = System.currentTimeMillis();
    int i=1;
    Scanner scan=new Scanner(System.in);
    //After Starting it enter into loop
    while(i!=2){
      i=scan.nextInt();
    }
    //Getting current(end) time in millisecond
    long end=System.currentTimeMillis();
    int num=(int)(end-start);
    caltime(num);
  }

  public static void main(String []args){

    int i=2;
    Scanner scan=new Scanner(System.in);
    //Displaying start and stop
    System.out.println("1.Start");
    System.out.println("2.Stop");
    i=scan.nextInt();
    if(i==1){
      timer();
    }
    else{
      System.out.println("Invalid Entry");
    }
  }
}
