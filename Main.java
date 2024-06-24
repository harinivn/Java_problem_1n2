public class Main{
    public static void main(String Args[]){
        Manager obj1 = new Manager("Harini","bangalore", 100000,"Developer");
        Developer obj2 = new Developer("Nayana","Sarajapur", 200000, "tester");
        Programmer obj3 = new Programmer("Chethana", "Banasahankari", 3000000, "Manager");

        System.out.println("manager Bonus :$" +obj1.calculateBonus());
        System.out.println("Developer Bonus :$" +obj2.calculateBonus());
        System.out.println("Programmer Bonus :$" +obj3.calculateBonus());

        System.out.println(obj1.generatePerformanceReport());
        System.out.println(obj2.generatePerformanceReport());
        System.out.println(obj3.generatePerformanceReport());

        System.out.println(obj1.manageProjects());
        System.out.println(obj2.manageProjects());
        System.out.println(obj3.manageProjects());




    
}

}