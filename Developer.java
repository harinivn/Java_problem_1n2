public class Developer extends Employee{

    public Developer(String name, String address, double salary, String job_title) {
        super(name, address, salary, job_title);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calculateBonus(){
        return getSalary()*0.12;
    }

    @Override
    public String generatePerformanceReport(){
        return "Performance report for Developer " +getName() +":Excellent";
    }

    @Override
    public String manageProjects(){
        return getName()+ "  is managing multiple projects";
    }

}
