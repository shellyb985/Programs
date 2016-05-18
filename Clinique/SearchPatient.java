package com.bridgelabz;
import com.bridgelabz.model.Patient;
import java.util.ArrayList;
public class SearchPatient{

  //Search by patient Name
  public ArrayList<Patient> searchByName(ArrayList<Patient> patientList,String name){
    ArrayList<Patient> tempPatientList=new ArrayList();
    for(int i=0;i<patientList.size();i++){
      if(name.equals(patientList.get(i).name)){
        tempPatientList.add(patientList.get(i));
      }
    }//End of for loop
    return tempPatientList;
  }//End of method Search by name\
//*****************************************************************************
  //Search by patient Id
  public ArrayList<Patient> searchById(ArrayList<Patient> patientList,int id){
    ArrayList<Patient> tempPatientList=new ArrayList();
    for(int i=0;i<patientList.size();i++){
      if(id==(patientList.get(i).id)){
        tempPatientList.add(patientList.get(i));
      }
    }//End of for loop
    return tempPatientList;
  }//End of Search by patient ID
//*************************************************************************************
  //Search by patient mobile no
  public ArrayList<Patient> searchByMobNo(ArrayList<Patient> patientList,String tMob){
    ArrayList<Patient> tempPatientList=new ArrayList();
    for(int i=0;i<patientList.size();i++){
      if(tMob.equals(patientList.get(i).MobileNo)){
        tempPatientList.add(patientList.get(i));
      }
    }//End of for loop
    return tempPatientList;
  }//End of Search by patient ID
  //*******************************************************************************
}//End of search patient class
