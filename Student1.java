public class Student1{

    //Variables
    private String firstName;
    private String lastName;
    private String rollNumber;

    //Constructor
    public Student1(String firstName, String lastName, String rollNumber){
           this.firstName = firstName;
           this.lastName = lastName;
           this.rollNumber = rollNumber;
    }

    //Getters and Setters
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getRollNumber(){
        return rollNumber;
    }

    public void setRollNumber(String rollNumber){
        this.rollNumber = rollNumber;
    }

    public static void main(String[] args) {
        //Creating an object of Student class with specific values
        Student1 student = new Student1("Harini", "VN", "1nhwe");

        //Printing out the details of Student
        System.out.println("Student Details:");
        System.out.println("FirstName:" +student.getFirstName());
        System.out.println("FirstName:" +student.getLastName());
        System.out.println("FirstName:" +student.getRollNumber());

    }

}