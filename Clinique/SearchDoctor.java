package com.bridgelabz;
import com.bridgelabz.model.Doctor;
import java.util.ArrayList;

public class SearchDoctor{

  //Search by Doctor Name
  public ArrayList<Doctor> searchByName(ArrayList<Doctor> doctorList,String name){
    ArrayList<Doctor> tempDoctorList=new ArrayList();
    for(int i=0;i<doctorList.size();i++){
      if(name.equals(doctorList.get(i).name)){
        tempDoctorList.add(doctorList.get(i));
      }
    }//End of for loop
    return tempDoctorList;
  }//End of method Search by name\
//*****************************************************************************
  //Search by Doctor Id
  public ArrayList<Doctor> searchById(ArrayList<Doctor> doctorList,int id){
    ArrayList<Doctor> tempDoctorList=new ArrayList();
    for(int i=0;i<doctorList.size();i++){
      if(id==(doctorList.get(i).id)){
        tempDoctorList.add(doctorList.get(i));
      }
    }//End of for loop
    return tempDoctorList;
  }//End of Search by Doctor ID
//*************************************************************************************
  //Search by Doctor special
  public ArrayList<Doctor> searchBySpecial(ArrayList<Doctor> doctorList,String Specialization){
    ArrayList<Doctor> tempDoctorList=new ArrayList();
    for(int i=0;i<doctorList.size();i++){
      if(Specialization.equals(doctorList.get(i).spec)){
        tempDoctorList.add(doctorList.get(i));
      }
    }//End of for loop
    return tempDoctorList;
  }//End of Search by Doctor ID
  //*******************************************************************************

}//End of Doctor class
