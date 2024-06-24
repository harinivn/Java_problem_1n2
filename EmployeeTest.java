import static org.junit.Assert.*;

import org.junit.*;

public class EmployeeTest {
    @SuppressWarnings("deprecation")
    @Test
   public void testManagerBonus(){
        Manager obj1 = new Manager("Harini","Bangalore",100000,"Developer");
        Assert.assertEquals(15000.0, obj1.calculateBonus(), 0.0);
    }

    

    @Test
     public void testManagerProjects(){
        Manager obj1 = new Manager("Harini","Bangalore",100000,"Developer");
        obj1.manageProjects();
    }

   

   
}