public class Doctor{
  public String name;
  public int id;
  public int mobno;
  public String spec;
  public int available;

  Doctor(){
    Scanner scan=new Scanner();
    System.out.print("Doctor Name : ");
    name=scan.next();
    System.out.print("Doctor ID : ");
    id=scan.nextInt();
    System.out.print("Mobile No : ");
    mobno=scan.nextInt();
    System.out.print("Specialization :");
    spec=scan.next();
  }

}
