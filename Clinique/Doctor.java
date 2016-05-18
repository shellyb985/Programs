package com.bridgelabz.model;

import java.util.Hashmap;
import java.util.Calendar;
import java.util.Scanner;

public class Doctor{
  public String name;
  public int id;
  public String spec;
  public Hashmap appointmentMap=new Hashtable();


  public Doctor(){
    Scanner scan=new Scanner(System.in);
    System.out.print("Doctor Name : ");
    name=scan.next();
    System.out.print("Doctor ID : ");
    id=scan.nextInt();
    System.out.print("Specialization :");
    spec=scan.next();
    System.out.println("Availability : ");

  }
  public void giveAppointment(String tDate){

    if(appointmentTable.containsKey(tDate)){
      if(Integer.parseInt(appointmentTable.get(tDate))<5){
        appointmentTable.put(tDate,(appointmentTable.get(tDate)+1));
        System.out.println("Appointment fixed on"+tDate);
      }
      else{
        System.out.println("Appointment Full..");
      }
    }
    else{
      int a=1;
        appointmentTable.put(tDate,a);
        System.out.println("Appointment fixed on"+tDate);
    }
  }
}
