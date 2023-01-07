import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class StudentEmail extends Email{
  private int batchNo;
  public StudentEmail(String firstName, String lastName, int batchNo){
    super(firstName, lastName);
    this.batchNo = batchNo;
    setEmailAdress(generateEmail());
    setPassword(generatePassword());
    setCapacity(25);
    setMaxAttachments(50);
  }
  public String generateEmail(){
    return getFirstName() + "." + getLastName() + "b" + batchNo + "@instructors." + getDomainName();
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
    return "TYPE: Student " + "\nBATCH NO: " + batchNo + super.toString();
 }
  }

