public class Manager extends Employee{

    public Manager(String name, String address, double salary, String job_title) {
        super(name, address, salary, job_title);

        //TODO Auto-generated constructor stub
        
    }

    @Override
    public double calculateBonus(){
        return getSalary()*0.15;
    }

    @Override
    public String generatePerformanceReport(){
        return "Performance report for Manager " +getName() +":Excellent";
    }

    @Override
    public String manageProjects(){
        return getName()+ "  is managing multiple projects.";
  }
     
}


/// Create two managers objects and compare the salaries
 // Use for loops to print the 
 //Create a 5 manager objects use in a list 
