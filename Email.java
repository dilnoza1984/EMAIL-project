class Email{
  private String firstName;
  private String lastName;
  private String emailAdress;
  private String password;
  private int capacity;
  private int maxAttachments;
  final private String DOMAIN_NAME = "duotech.com";
  
  public Email(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
  
  }
  public String getFirstName(){
    return firstName;
    
}
  public String setFirstName(String firstName){
    this.firstName = firstName;
    return firstName;
  }
  public String getLastName(){
    return lastName;
    
}
  public String setLastName(String lastName){
    this.lastName = lastName;
    return lastName;
  }
  public String getEmailAdress(){
    return emailAdress;
    
}
  public String setEmailAdress(String emailAdress){
    this.emailAdress = emailAdress;
    return emailAdress;
  }
  public String getPassword(){
    return password;
    
}
  public String setPassword(String password){
    this.password = password;
    return password;
  }
  public int getCapacity(){
    return capacity;
    
}
  public int setCapacity(int capacity){
    this.capacity = capacity;
    return capacity;
  }
  public int getMaxAttachments(){
    return maxAttachments;
    
}
  public int setMaxAttachments(int maxAttachments){
    this.maxAttachments = maxAttachments;
    return maxAttachments;
  }
  public String getDomainName(){
    return DOMAIN_NAME;
    
}
  public String getDomainName(String domainName){
    return domainName;
    
}
  public String generateEmail(){
    return "";
 }
  public String generatePassword(){
    return "";
 }
  public String toString(){
    return " NAME: " + firstName + " " + lastName + "\nEMAIL: " + emailAdress + "\nPASSWORD: " + password + "\nCAPACITY: " + getCapacity() + "\nMAX ATTACHMENTS SIZE: " + getMaxAttachments();
  }
}