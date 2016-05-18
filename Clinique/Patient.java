package com.bridgelabz.model;
import java.util.Scanner;
public class Patient{
  public String name;
  public int id;
  public String MobileNo;
  public int age;

  public Patient(){
    Scanner scan=new Scanner(System.in);
    System.out.print("Patient Name : ");
    name=scan.next();
    System.out.print("Patient ID : ");
    id=scan.nextInt();
    System.out.print("Mobile No : ");
    MobileNo=scan.next();
    System.out.print("Age : ");
    age=scan.nextInt();
  }
}
