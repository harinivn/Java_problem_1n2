// Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, Developer,
//  and Programmer. Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating bonuses, 
// generating performance reports, and managing projects.
 
// Bonuses:
// Manager = 15% of salary
// Developer = 12% of salary
// Programmer = 10% of salary



//Base class : Employee
public class Employee {

   private String name;
   private String address;
   private double salary;
   private String job_title;
    
//Constructor
    public Employee( String name, String address, double salary, String job_title){
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.job_title = job_title;
    }

//Getter and Setter methods
        public String getName(){
            return name;
        }

        public void setName(String Name){
            this.name = name;
        }

        public String getAddress(){
            return address;
        }

        public void setAddress(String address){
            this.address = address;
        }

        public double getSalary(){
            return salary;
        }

        public void setSalary(double salary){
            this.salary = salary;
        }

        public String getJobTitle(){
            return job_title;
        }

        public void setJobTitle(String jobTitle){
            this.job_title=job_title;
        }

       
//Method to calculate bonus (default implementation)
        public double calculateBonus(){
            return salary*010;
        }

//Method to generate performance report
        public String generatePerformanceReport(){
            return "Performance Report for:" +name +"JobTitle:"  +job_title +":Outstanding performance.";     
        }

        public String manageProjects(){
            return "Managing general tasks";
        }

       


    }

    