package com.bridgelabz;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.SearchDoctor;
import com.bridgelabz.SearchPatient;
import java.util.ArrayList;
import java.util.Scanner;
public class CliniqueManagement{

  public static void main(String []args){
    SearchDoctor searchDoctorObj=new SearchDoctor();
    SearchPatient searchPatientObj=new SearchPatient();

    ArrayList<Doctor> doctorList=new ArrayList();     //Store Doctor's Details
    ArrayList<Patient> patientList=new ArrayList();   //Store Patient's Details
    Scanner scan=new Scanner(System.in);
    while(true){
      System.out.println("\t1.Add Doctor\n\t2.Add Patient\n\t3.Search Doctor\n\t4.Search Patient\n\t5.For Appointment\n\t6.Doctor Patient Report");
      System.out.print("Enter your Choice : ");
      int choice=scan.nextInt();

      switch(choice){
        //to add doctor
        case 1 :  doctorList.add(new Doctor());
                  break;
        //to add patient0
        case 2 :  patientList.add(new Patient());
                  break;
        //For Searching Doctors
        case 3 :  System.out.println("Search Doctor by \n\t1.Name\n\t2.ID\n\t3.Specialization\n\t4.Availability");
                  System.out.print("Enter your Choice : ");
                  int temp=scan.nextInt();
                  //Search by name
                  if(temp==1){
                    System.out.print("Doctor Name : ");
                    String tString=scan.next();
                    ArrayList<Doctor> tempDoctorList=new ArrayList();
                    //Calling search doctor method
                    tempDoctorList=searchDoctorObj.searchByName(doctorList,tString);
                    //calling display method
                    displayDoctor(tempDoctorList);
                  }
                  //Search by id
                  else if(temp==2){
                    System.out.print("Doctor Id : ");
                    int tNum=scan.nextInt();
                    ArrayList<Doctor> tempDoctorList=new ArrayList();
                    //Calling search doctor method
                    tempDoctorList=searchDoctorObj.searchById(doctorList,tNum);
                    //calling display method
                    displayDoctor(tempDoctorList);
                  }
                  //Search by Specialization
                  else if(temp==3){
                    System.out.print("Doctor Specialization : ");
                    String tString=scan.next();
                    ArrayList<Doctor> tempDoctorList=new ArrayList();
                    //Calling search doctor method
                    tempDoctorList=searchDoctorObj.searchBySpecial(doctorList,tString);
                    //calling display method
                    displayDoctor(tempDoctorList);
                  }
                  //Search by Availability
                  else if(temp==4){
                    System.out.println("under construction");
                  }
                  else{
                    System.out.println("Invalid option");
                  }
                  //End of Search doctor case
                  break;
        //Searching Patient
        case 4 :  System.out.println("Search Patient by \n\t1.Name\n\t2.ID\n\t3.Mobile No");
                  System.out.print("Enter your Choice : ");
                  int tempch=scan.nextInt();
                  //Search by name
                  if(tempch==1){
                    System.out.print("Patient Name : ");
                    String tString=scan.next();
                    ArrayList<Patient> tempPatientList=new ArrayList();
                    //Calling search patient method
                    tempPatientList=searchPatientObj.searchByName(patientList,tString);
                    //calling display method
                    displayPatient(tempPatientList);
                  }
                  //Search by id
                  else if(tempch==2){
                    System.out.print("Patient Id : ");
                    int tNum=scan.nextInt();
                    ArrayList<Patient> tempPatientList=new ArrayList();
                    //Calling search doctor method
                    tempPatientList=searchPatientObj.searchById(patientList,tNum);
                    //calling display method
                    displayPatient(tempPatientList);
                  }
                  //Search by mobile no
                  else if(tempch==3){
                    System.out.print("Patient Mobile No : ");
                    String tNum=scan.next();
                    ArrayList<Patient> tempPatientList=new ArrayList();
                    //Calling search doctor method
                    tempPatientList=searchPatientObj.searchByMobNo(patientList,tNum);
                    //calling display method
                    displayPatient(tempPatientList);
                  }
                  else{
                    System.out.println("Invalid option");
                  }
                  break;

        //for Appointments
        case 5 :  Appointment apponintmentObject=new Appointment();
                  ArrayList<Doctor> tempArrayList=new tempArrayList();
                  System.out.println("Appointment By \n\t1.Name\n\t2.Specialization\n\t3.Availability");
                  System.out.println("Enter your Choice : ");
                  int chApp=scan.nextInt();
                  //---------------------------------------------------------------
                  //Give appointment by doctor name
                  if(chApp==1)
                    System.out.print("Enter the Doctor Name : ");
                    String tName=scan.nextLine();
                    tempArrayList=searchDoctorObj.searchByName(doctorList,tString);
                    Appointment.byName(tempArrayList);
                  //-------------------------------------------------------------------
                  //Appointment by Specialization
                  else if(chApp==1){
                    System.out.print("Enter the Specialization\n\tUnder Construction");

                  }
                  //-------------------------------------------------------------------
                  //Appointment by Availability
                  else if(chApp==1){
                    System.out.print("Enter the Availability\n\tUnder Construction");
                  }
                  break;
        case 6 :
                  break;
        //Exit
        case 7 :  System.out.println("Thank You...");
                  return;

        default : System.out.println("Invalid Option");
                  break;


      }//End of Switch statement
    }//End of while loop

  }
  //Display method for Doctor List
  static void displayDoctor(ArrayList<Doctor> tempDoctorList){
    if(tempDoctorList.size()==0){
      System.out.println("No Doctor Found!!!");
      return ;
    }
    System.out.println("S.no Name\tID\tSpecialization\tAvailability");
    for(int i=0;i<tempDoctorList.size();i++){
      System.out.println((i+1)+".   "+tempDoctorList.get(i).name+"\t"+tempDoctorList.get(i).id+"\t"+tempDoctorList.get(i).spec);
    }//End of loop
  }
  //Disl=play method for Patient list
  static void displayPatient(ArrayList<Patient> tempPatientList){
    if(tempPatientList.size()==0){
      System.out.println("No Patient Found!!!");
      return ;
    }
    System.out.println("S.no Name\tID\tAge\tMobile No");
    for(int i=0;i<tempPatientList.size();i++){
      System.out.println(i+".   "+tempPatientList.get(i).name+"\t"+tempPatientList.get(i).id+"\t"+tempPatientList.get(i).age+"\t"+tempPatientList.get(i).MobileNo);
    }//End of loop
  }

}
