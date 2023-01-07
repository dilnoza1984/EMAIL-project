Project: Duotech EMA (Email Management Application)

Design an application for generating emails for students and staff at Duotech!

Use Encapsulation, Inheritance and Polymorphism principles of OOP to design and implement the application.


Steps:

A. Implement the class Email.

It contains the following:
  
   Data fields with private visibility: 
   - firstName - represents first name of the email owner
   - lastName - represents last name of the email owner
   - emailAddress - represents the email address of the email owner
   - password  - represents the password for the email 
   - capacity - represents the capacity of the email in GBs.
   - maxAttachmentSize - represents the maximum size of the attachments in MBs.
   - DOMAIN_NAME - represents a constant, domain name, which must be initialized to "duotech.io".
  
   

   Constructors: 
   - constructor that accepts and initializes firstName , lastName.
  
   Methods:
     - getters and setters for all the fields.
     - generateEmail() - provide some generic implementation (return an empty string). 
     - generatePassword() - provide some generic implementation (return an empty string). 
     - toString() - return the following field values in following format:
                NAME: firstName + lastName
                GENERATED EMAIL ADDRESS: emailAddress 
                GENERATED PASSWORD: password 
                CAPACITY: capacity 
                MAX ATTACHMENT SIZE: maxAttachmentSize 

B. Implement the class StudentEmail which is a subclass of Email

It contains the following:
  
   Data field with private visibility: 
   - batchNo - represents batchNo of the student.
  
   Constructor: 
   - constructor that accepts and initializes firstName , lastName and batchNo.
        Besides that it needs to do the following:
      - initializes emailAddress using generateEmail() method.
      - initializes password using generatePassword() method.
      - initializes capacity to 25.
      - initializes maxAttachmentSize to 50.

  
   Methods:
     - generateEmail() - override it so it returns the following:
       firstName + . + lastName + _b + batchNo + @ + student. + DOMAIN_NAME
       Example: Bahar Mahmud, batch 5 -> bahar.mahmud_b5@student.duotech.io

     - generatePassword() - override it so it returns the following:
        random password with length 8 that consists of lowercase, uppercase chars and numbers
        Example: gad6FshR
     - toString() - override it so it returns the info in following format (use super class's toString() for super class field values):
                TYPE: Student
                BATCH NO: batchNo
                NAME: firstName + lastName
                GENERATED EMAIL ADDRESS: emailAddress 
                GENERATED PASSWORD: password 
                CAPACITY: capacity 
                MAX ATTACHMENT SIZE: maxAttachmentSize 


C. Implement the class StaffEmail which is a subclass of Email

It contains the following:
  
   Data fields with private visibility: 
   - departmentId - represents the department id of the staff member as int.
                    1 represents Accounting
                    2 represents Sales
                    3 represents Marketing
                    4 represents Instructors
   - DEPARTMENTS - represents a constant, a String array that holds all departments values. 
                   It should be initialized to hold "Accounting", "Sales", "Marketing", "Instructors" departments.
  
   Constructor: 
   - constructor that accepts and initializes firstName , lastName and departmentId.
        Besides that it needs to do the following:
      - initializes emailAddress using generateEmail() method.
      - initializes password using generatePassword() method.
      - initializes capacity to 50.
      - initializes maxAttachmentSize to 100.

  
   Methods:
     - generateEmail() - override it so it returns the following:
       firstName + . + lastName + _d + departmentId + @ + department + . + DOMAIN_NAME
       Example: Akmal Bek, departmentId 4 (Instructors) -> akmal.bek_d4@instructors.duotech.io

     - generatePassword() - override it so it returns the following:
        random password with length 8 that consists of lowercase, uppercase chars and numbers and special chars such as !@#$%^&*()
        Example: $Qcr48hJ
     - toString() - override it so it returns the info in following format (use super class's toString() for super class field values):
                TYPE: Staff
                DEPARTMENT: department
                NAME: firstName + lastName
                GENERATED EMAIL ADDRESS: emailAddress 
                GENERATED PASSWORD: password 
                CAPACITY: capacity 
                MAX ATTACHMENT SIZE: maxAttachmentSize 



C. Implement application logic in Main class:
     
     Your application should do the following:

    - Asks the user about the number of emails to be generated (hint: create and store them in an array of super type)
    - Creates the corresponding number of emails, where it asks the following info for each email:
        - The type of the email
        - First name
        - Last name
        - Batch Number, if it is for a student email
        - Department ID, if it is for a staff email

    - After all emails have been created, displays all the information about the created emails and ends the application.
    - Refer to the attached document for examples of the console output.