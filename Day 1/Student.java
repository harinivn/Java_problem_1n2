


public class Student{

    String firstName;
    String rollNumber;
    String lastName;

    public Student(String firstName, String rollNumber, String lastName){
    
         this.firstName=firstName;
         this.rollNumber=rollNumber;
         this.lastName=lastName;
    }

    public static void main(String args[]){

        Student obj = new Student("ABC","123456","XYZ");

        System.out.println("Firstname:" +obj.firstName);
        System.out.println("rollNumber:" +obj.rollNumber);
        System.out.println("lastname:" +obj.lastName);


    }
}