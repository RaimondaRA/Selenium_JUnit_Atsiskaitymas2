import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SeleniumTest {
    @Before
    public void setup(){
        Selenium.setup();
    }

    @Test
    //@Order(1)
    public void createRecordTest(){
        Selenium.createRecord("MyMovie", "Action", "Actors", "James Jameson", "120");
        Assert.assertEquals("Duomenys įrašyti sėkmingai", Selenium.getMessage());
        System.out.println(Selenium.getMessage());

    }

    @Test
    //@Order(2)
    public void createRecordFalseTest(){
        Selenium.createRecord(" ", " ", "Actors", "James Jameson", "120");
        Assert.assertEquals("Duomenys įrašyti sėkmingai", Selenium.getMessage());
    }

    @Test
    //@Order(3)
    public void deleteRecordTest(){
        Selenium.deleteRecord("823");
        Assert.assertEquals("Įrašas ištrintas sėkmingai", Selenium.getMessage());
        System.out.println(Selenium.getMessage());
    }

    @Test
    //@Order(4)
    public void editRecordTest(){
        Selenium.editRecord("833", "YourMovie", "Thriller", "ActorsAndMore", "Peter Petereson", "150");
        Assert.assertEquals("Įrašas paredaguotas sėkmingai", Selenium.getMessage());
        System.out.println(Selenium.getMessage());
    }

    @Test
    //@Order(5)
    public void editRecordFalseTest(){
        Selenium.editRecord("1001", "YourMovie", " ", " ", "Peter Petereson", "150");
        Assert.assertEquals("Įrašas paredaguotas sėkmingai", Selenium.getMessage());
    }

   @After
    public void close(){
        Selenium.close();
    }
}
