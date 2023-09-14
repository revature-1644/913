import Model.Inventory;
import Service.InventoryService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InventoryServiceTest {
    InventoryService inventoryService;
//    runs before every test, to set up the 'premise' of the test (its classes it's testing)
    @Before
    public void setUp(){
        inventoryService = new InventoryService();
    }
//    @After, @BeforeClass, @AfterClass

    @Test
    public void InventoryServiceItemCanBeFoundTest(){
        Inventory item = new Inventory("test item", 0.00);
        inventoryService.addItem(item);
        boolean expected = true;
        boolean actual = inventoryService.doesItemExist("test item");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void InventoryServiceTestNonExistedItemCanNotBeFoundTest(){
        Inventory item = new Inventory("test item", 0.00);
        inventoryService.addItem(item);
        boolean expected = false;
        boolean actual = inventoryService.doesItemExist("n/a");
        Assert.assertEquals(expected, actual);
    }
    /**
     * Mocking - mockito - allows us to simulate part of our application, so that we may test
     * the small layers independently of each other
     *
     * TDD - writing tests before implementation
     */
    /**
     * Planning / Analysis / Design / Implementation / Testing / Maintenance
     * "Agile" - working in sprints, complete the software development lifecycle in 2 weeks
     */
}
