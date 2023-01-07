import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
     System.out.println("******************** DUOTECH EMAIL MANAGEMENT APPLICATION ********************");
     System.out.println("------------------------------------------------------------------------------");

    // Implement the EMA application logic here
       System.out.println("How many emails would you like to create?");
    int createdEmails = scan.nextInt();
    int counter = 0;

    while(counter != createdEmails){
      System.out.println("What type of email?");
      scan.nextLine();
      String typeOfEmail = scan.nextLine();
     
      if(typeOfEmail.equalsIgnoreCase("Student")){
        System.out.println("First name: ");
        String firstName =  scan.nextLine();
        System.out.println("Last name: ");
        String lasttName =  scan.nextLine();
        System.out.println("Batch NO: ");
        int batchNo =  scan.nextInt();
       

        StudentEmail student = new StudentEmail(firstName, lasttName, batchNo);
        System.out.println(student.toString());
     }

     
      if(typeOfEmail.equalsIgnoreCase("Staff")){
        System.out.println("First name: ");
        String firstName =  scan.nextLine();
        System.out.println("Last name: ");
        String lasttName =  scan.nextLine();
        System.out.println("Department ID: ");
        int departmentId =  scan.nextInt();

        StaffEmail staff = new StaffEmail(firstName, lasttName, departmentId);
        System.out.println(staff.toString());
     }
    }

    System.out.println("THANK YOU FOR USING DUOTECH EMA! GOODBYE!");
  }
}