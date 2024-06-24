public class Programmer extends Employee{

    public Programmer(String name, String address, double salary, String job_title) {
        super(name, address, salary, job_title);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calculateBonus(){
        return getSalary()*0.10;

    }

    @Override
    public String generatePerformanceReport(){
        return "Performance report for Programmer " +getName() +":Excellent";
    }

    @Override
    public String manageProjects(){
    return  getName()+" is writing and mantaining code" ;
    }
}