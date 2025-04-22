package api.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import api.endpoints.StoreEndPoints;
import api.payload.Store;
import io.restassured.response.Response;

public class StoreTests {
	Store storePayload;
	int testOrderId = 3;
	int invalidTestOrderId = 999999;
	int negativeTestOrderId = -1;
	Store emptyPayload;
	
    @BeforeClass
    public void setup() {
        storePayload = new Store();

        storePayload.setId(testOrderId);
        storePayload.setPetId(198772);
        storePayload.setQuantity(7);
        storePayload.setShipDate("2025-04-22T17:44:47.702Z");
        storePayload.setStatus("approved");
        storePayload.setComplete(true);
        
        emptyPayload = new Store();
    }
    
    @Test(priority = 1)
    public void testCreateOrder() {
        Response response = StoreEndPoints.createOrder(storePayload);
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test(priority = 2)
    public void testValidOrder() {
        Response response = StoreEndPoints.getOrder(testOrderId);
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.jsonPath().getInt("id"), testOrderId);
    }

    @Test(priority = 3)
    public void testGetInventory() {
        Response response = StoreEndPoints.getInventory();
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertTrue(response.jsonPath().getMap("$").containsKey("approved"));
    }

    @Test(priority = 4)
    public void testDeleteValidOrder() {
        Response response = StoreEndPoints.deleteOrder(testOrderId);
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);
    }
    
    @Test(priority = 5)
    public void testGetOrderWithInvalidId() {
        Response response = StoreEndPoints.getOrder(invalidTestOrderId);
        response.then().log().all();
        Assert.assertEquals(response.statusCode(), 404);
    }
    
    @Test(priority = 6)
    public void testDeleteInvalidOrder() {
        Response response = StoreEndPoints.deleteOrder(invalidTestOrderId);
        response.then().log().all();
        Assert.assertEquals(response.statusCode(), 404);
    }
    
    @Test(priority = 7)
    public void testCreateOrderWithEmptyPayload() {
        Response res = StoreEndPoints.createOrder(emptyPayload);
        res.then().log().all();
        Assert.assertTrue(res.statusCode() >= 400);
    }
    
    @Test(priority = 8)
    public void testCreateOrderWithNegativePetId() {
        Store testPayload = clonePayload(1001);
        testPayload.setPetId(negativeTestOrderId);
        Response response = StoreEndPoints.createOrder(testPayload);
        response.then().log().all();
        Assert.assertTrue(response.statusCode() >= 400);
    }
    
    
    private Store clonePayload(int id) {
        Store clone = new Store();
        clone.setId(id);
        clone.setPetId(storePayload.getPetId());
        clone.setQuantity(storePayload.getQuantity());
        clone.setShipDate(storePayload.getShipDate());
        clone.setStatus(storePayload.getStatus());
        clone.setComplete(storePayload.isComplete());
        return clone;
    }
    
    

}
