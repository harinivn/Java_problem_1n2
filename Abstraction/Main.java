package Abstraction;

public class Main {
    
        public static void main(String[] args){
            Employee manager = new Manager();
            manager.displayInfo();

            Employee programmer = new Programmer();
            programmer.displayInfo();

        }


    
}
