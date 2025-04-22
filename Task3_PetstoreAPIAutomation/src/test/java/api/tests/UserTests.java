package api.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import api.endpoints.UserEndPoints;
import api.payload.User;
import io.restassured.response.Response;

public class UserTests {
	
    User userPayload;
    User updatedUser;
	
	@BeforeClass
	public void setup() {
		userPayload = new User();

        userPayload.setId(1001);
        userPayload.setUsername("john_doe");
        userPayload.setFirstName("John");
        userPayload.setLastName("Doe");
        userPayload.setEmail("john.doe@example.com");
        userPayload.setPassword("password123");
        userPayload.setPhone("1234567890");
        userPayload.setUserStatus(1);
        
        updatedUser = new User();
        updatedUser.setFirstName("Jane");
        updatedUser.setEmail("jane.doe@example.com");
        updatedUser.setPhone("1234567891");
	}
	
	@Test(priority=1)
	public void testCreateUser() {
		
		Response response = UserEndPoints.createUser(userPayload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 500);
	}
	
	@Test(priority=2)
	public void readUser() {
		Response response = UserEndPoints.readUser("user1");
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority=3)
	public void updateUser() {
		Response response = UserEndPoints.updateUser("user1", updatedUser);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority=4)
	public void loginUser() {
		Response response = UserEndPoints.loginUser("exam", "exam");
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority=5)
	public void logoutUser() {
		Response response = UserEndPoints.logoutUser();
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority=6)
	public void deleteUser() {
		Response response = UserEndPoints.deleteUser("john_doe");
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
