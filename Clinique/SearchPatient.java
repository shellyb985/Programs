public class SearchDoctor{

  //Search by Doctor Name
  public Array<Patient> searchByName(ArrayList<Patient> patientList,string name){
    ArrayList<Patient> tempPatientList=new Patient;
    for(int i=0;i<patientList.size();i++){
      if(name.equals(patientList.get(i).name)){
        tempDoctorList.add(patientList.get(i))
      }
    }//End of for loop
    return patientList;
  }//End of method Search by name\
//*****************************************************************************
  //Search by Doctor Id
  public Array<Patient> searchById(ArrayList<Patient> patientList,int id){
    ArrayList<Patient> tempPatientList=new Patient;
    for(int i=0;i<patientList.size();i++){
      if(id.equals(patientList.get(i).id)){
        tempPatientList.add(patientList.get(i))
      }
    }//End of for loop
    return tempPatientList;
  }//End of Search by Doctor ID
//*************************************************************************************
  //Search by Doctor mobile no
  public Array<Patient> searchByName(ArrayList<Patient> patientList,String Specialization){
    ArrayList<Patient> tempPatientList=new Doctor;
    for(int i=0;i<patientList.size();i++){
      if(Specialization.equals(patientList.get(i).mobno)){
        tempPatientList.add(patientList.get(i))
      }
    }//End of for loop
    return tempPatientList;
  }//End of Search by Doctor ID
  //*******************************************************************************
}//End of Doctor class
