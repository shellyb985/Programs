import com.bridgelabz.model.Doctor;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Appointment{

  Date mDate=new Date();
  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
  //Appointment by name
  public void byName(ArrayList<Doctor> tempArrayList){
      //If no Doctor found
      if(tempArrayList.size()==0){
        System.out.println("No Match Found...!!!");
      }
      //If one doctor found
      else if(tempArrayList.size()==1){
        System.out.println("Enter the Appointment Date(dd/mm/yyyy) : ")
        String tDate=new scan.next();
        //if appointment available on specific date
        tempDoctorList.get(0).giveAppointment(tDate);
      }
      //If many doctor found
      else{
        System.out.println("More Doctore Names Found \n\tUnder Construction");
      }
      apponintmentObject.byName(tempArrayList,tName);
  }/*
  public void bySpecialization(String tSpecial){

  }
  public void byAvailable(Sting tDate){

  }
  */

}
