package api.endpoints;

import static io.restassured.RestAssured.*;
import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndPoints {
	
	public static Response createUser(User payload) {
		Response response = given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(payload)
		.when()
			.post(Routes.CREATE_USER);
		
		return response;
	}
	
	public static Response readUser(String userName) {
		Response response = given()
				.pathParam("username", userName)
		.when()
			.get(Routes.GET_USER_BY_USERNAME);
		
		return response;
	}
	
	public static Response updateUser(String userName, User payload) {
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("username", userName)
				.body(payload)
			.when()
				.put(Routes.UPDATE_USER);
			
			return response;
		}
	
	public static Response deleteUser(String userName) {
		Response response = given()
				.pathParam("username",userName)
			.when()
				.delete(Routes.DELETE_USER);
		
		return response;		
	}
	
	public static Response loginUser(String userName, String password) {
		Response response = given()
				.queryParam("username", userName)
				.queryParam("password", password)
			.when()
				.get(Routes.LOGIN_USER);
		
		return response;
	}

    public static Response logoutUser() {
        Response response = when()
                .get(Routes.LOGOUT_USER);
        
        return response;
    }
}
