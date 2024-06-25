package Abstraction;

//Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and 
//displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and 
//implement the respective methods to calculate salary and display information for each role.

abstract class Employee {
    
     String name;
     int experience;
     double baseSalary;

//Default Constructor
public Employee(){
    this.name = "Unknown";
    this.experience = 0;
    this.baseSalary = 9000;
   }

//Abstract methods
    abstract double calculateSalary();
    abstract void displayInfo();


}

 class Manager extends Employee{

    private double bonus;

    public Manager() {
        super();
        this.bonus = 2000;
        
    }
    @Override
    double calculateSalary() {
        // TODO Auto-generated method stub
        return baseSalary+bonus;
    }

    @Override
    void displayInfo(){
        System.out.println( "Manager name: "+name);
        System.out.println("Experience: "+experience);
        System.out.println("baseSalary: "+baseSalary);
        System.out.println("Salary: "+calculateSalary());
    }

    
}

class Programmer extends Employee{
    private int hoursWorked;
    private int hourlyRate;

    public Programmer(){
        super();
        this.hourlyRate = 20;
        this.hoursWorked = 300;
    }

    @Override
    double calculateSalary(){
        return hourlyRate*hoursWorked;
    }

    @Override
    void displayInfo(){
        System.out.println("Programmer name: "+name);
        System.out.println("Experience: "+experience);
        System.out.println("HourlyRate: "+hourlyRate);
        System.out.println("HoursWorked: "+hoursWorked);
        System.out.println("Total Salary: $" +calculateSalary());
    }
}

