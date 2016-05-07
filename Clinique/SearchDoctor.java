public class SearchDoctor{

  //Search by Doctor Name
  public Array<Doctor> searchByName(ArrayList<Doctor> doctorList,string name){
    ArrayList<Doctor> tempDoctorList=new Doctor;
    for(int i=0;i<doctorList.size();i++){
      if(name.equals(doctorList.get(i).name)){
        tempDoctorList.add(doctorList.get(i))
      }
    }//End of for loop
    return tempDoctorList;
  }//End of method Search by name\
//*****************************************************************************
  //Search by Doctor Id
  public Array<Doctor> searchById(ArrayList<Doctor> doctorList,int id){
    ArrayList<Doctor> tempDoctorList=new Doctor;
    for(int i=0;i<doctorList.size();i++){
      if(id.equals(doctorList.get(i).id)){
        tempDoctorList.add(doctorList.get(i))
      }
    }//End of for loop
    return tempDoctorList;
  }//End of Search by Doctor ID
//*************************************************************************************
  //Search by Doctor special
  public Array<Doctor> searchBySpecial(ArrayList<Doctor> doctorList,String Specialization){
    ArrayList<Doctor> tempDoctorList=new Doctor;
    for(int i=0;i<doctorList.size();i++){
      if(Specialization.equals(doctorList.get(i).Specialization)){
        tempDoctorList.add(doctorList.get(i))
      }
    }//End of for loop
    return tempDoctorList;
  }//End of Search by Doctor ID
  //*******************************************************************************

}//End of Doctor class
