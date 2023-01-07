import java.util.Random;
class StaffEmail extends Email{
  private int departmentId;
  final String [] DEPARTMENTS = {"Administration", "Sales", "Marketing", "IT", "HR", "Customer Service", "Support"};

  public StaffEmail(String firstName, String lastName, int departmentId){
    super(firstName, lastName);
    this.departmentId = departmentId;
  setEmailAdress(generateEmail());
  setPassword(generatePassword());
  setCapacity(50);
  setMaxAttachments(100);
}
public String generateEmail(){
  return getFirstName() + "." + getLastName() + "d" + departmentId + "@instructors." + getDomainName();
}
public String generatePassword(){
  int length = 8;
  final String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
  Random random = new Random();
  StringBuilder sb = new StringBuilder();
  for (int i = 0; i < length; i++) {
    int randomIndex = random.nextInt(chars.length());
    sb.append(chars.charAt(randomIndex));
  }
  return sb.toString();
}
public String toString(){
  return "TYPE: Staff " + "\nDEPARTMENT: \n" + DEPARTMENTS[departmentId] + super.toString();
  
}
}
  
  