// PROBLEM 1: 
// Create three objects of Intern class with variables 'address', ‘idNumber', and 'phoneNumber'.
// Assign and print the idNumber, address, and phoneNumber of three Intern objects with arbitrary values.

public class Intern{

    String address;
    int idNumber;
    String phoneNumber;


    //Constructor to intialize the Intern object
    public Intern(String address, int idNumber, String phoneNumber){
        this.address=address;
        this.idNumber=idNumber;
        this.phoneNumber=phoneNumber;
    }

    //Method to print Intern Details
    public void printDetails(){
        System.out.println("ID Number:" +idNumber);
        System.out.println("Address:" +address);
        System.out.println("phoneNumber:" +phoneNumber);
    }

    public static void main(String args[]){
        Intern obj1 = new Intern("Bangalore", 1, "9000987878");
        Intern obj2 = new Intern("Chennai", 2, "7878787878");
        Intern obj3 = new Intern("Pune", 3, "78787877876");

        System.out.println("Intern1");
        obj1.printDetails();
        System.out.println();
        System.out.println("Intern2");
        obj2.printDetails();
        System.out.println();
        System.out.println("Intern3");
        obj3.printDetails();
        System.out.println();

    }
}