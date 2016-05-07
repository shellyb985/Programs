import java.util.Scanner;
public class CliniqueManagement{
  CliniqueManagement(){
    SearchDoctor searchDoctorObj=new SearchDoctor();
    SearchPatient searchPatientObj=new SearchPatient();
    
  }
  public static void main(String []args){
    ArrayList<Doctor> doctorList=new Doctor(1);
    ArrayList<Patient> patientList=new Patient(1);
    Scanner scan=new Scanner(System.in);
    while(true){
      System.out.println("\t1.Add Doctor\n\t2.Add Patient\n\t3.Search Doctor\n\t4.Search Patient\n\t5.For Appointment\n\t6.Doctor Patient Report\n\t7.Exit")
      int choice=scan.nextInt();

      switch(choice){
        //to add doctor
        case 1 :  doctorList.add(new Doctor());
                  break;
        //to add patient
        case 2 :  patientList.add(new Patient());
                  break;

        case 3 :  System.out.println("Search Doctor by \n\t1.Name\n\t2.ID\n\t3.Specialization\n\t4.Availability");
                  System.out.println("Enter your Choice : ");
                  int temp=scan.nextInt();
                  if(temp==1){

                  }

                  break;

        case 4 :  System.out.println("Search Patient by \n\t1.Name\n\t2.Mobile No\n\t3.Id");
                  System.out.println("Enter your Choice : ");

                  break;

        case 5 :  System.out.println("Appointment By \n\t1.Name\n\t2.Specialization\n\t3.Availability");
                  System.out.println("Enter your Choice : ");

                  break;

        case 6 :

                  break;

        case 7 :  System.out.println("Thank You...");
                  return;

        default : System.out.println("Invalid Option");
            `     break;


      }//End of Switch statement
    }//End of while loop


  }
}
