public class Patient{
  public String name;
  public int id;
  public int mobno;
  public int age;

  Patient(){
    Scanner scan=new Scanner();
    System.out.print("Patient Name : ");
    name=scan.next();
    System.out.print("Patient ID : ");
    id=scan.nextInt();
    System.out.print("Mobile No : ");
    mobno=scan.nextInt();
    System.out.print("Age : ");
    age=scan.nextInt();
  }
}
