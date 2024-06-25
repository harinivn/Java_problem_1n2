import org.junit.*;



public class EmployeeTest {
    @SuppressWarnings("deprecation")
    @Test
   public void testManagerBonus(){
        Manager obj1 = new Manager("Harini","Bangalore",100000,"Developer");
        Assert.assertEquals(15000, obj1.calculateBonus());
    }

    

    @Test
     public void testManagerProjects(){
        Manager obj1 = new Manager("Harini","Bangalore",100000,"Developer");
        obj1.manageProjects();
    }

   

   
}