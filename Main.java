public class Main{
    public static void main(String Args[]){
        Manager manager1= new Manager("Harini","bangalore", 100000,"Developer");
        Manager manager2 =new Manager("Sahana","Hassan",400000,"Research");
        Developer developer = new Developer("Nayana","Sarajapur", 200000, "tester");
        Programmer programmer = new Programmer("Chethana", "Banasahankari", 3000000, "Manager");


        String salary1 = String.valueOf(manager1.getSalary());
        String salary2 = String.valueOf(manager2.getSalary());

        
        System.out.println("manager Bonus :$" +manager1.calculateBonus());
        System.out.println("Developer Bonus :$" +developer.calculateBonus());
        System.out.println("Programmer Bonus :$" +programmer.calculateBonus());

        System.out.println(manager1.generatePerformanceReport());
        System.out.println(developer.generatePerformanceReport());
        System.out.println(programmer.generatePerformanceReport());

        System.out.println(manager1.manageProjects());
        System.out.println(developer.manageProjects());
        System.out.println(programmer.manageProjects());

        if(salary1.equals(salary2)){
            System.out.println("Managers salaries are equal.");
        }else {
            System.out.println("Manager salaries are not equal");
        }




        }
        

        

    
}

