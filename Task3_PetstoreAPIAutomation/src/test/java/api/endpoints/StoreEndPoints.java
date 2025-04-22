package api.endpoints;

import static io.restassured.RestAssured.*;
import api.payload.Store;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class StoreEndPoints {
	
	public static Response getInventory() {
		Response response = given()
		        .header("api_key", "special-key")
		     .when()
				.get(Routes.GET_INVENTORY);
		
		return response;
	}
	
	public static Response createOrder(Store payload) {
		Response response = given()
	            .contentType(ContentType.JSON)
	            .accept(ContentType.JSON)
	            .body(payload)
	        .when()
	            .post(Routes.CREATE_ORDER);
		
		return response;
	}
	
	public static Response getOrder(long orderId) {
		Response response = given()
				.pathParam("orderId", orderId)
			.when()
				.get(Routes.GET_ORDER_BY_ID);
		
		return response;
	}
	
	public static Response deleteOrder(long orderId) {
        Response response = given()
                .pathParam("orderId", orderId)
            .when()
                .delete(Routes.DELETE_ORDER);
    
		return response;
	}

}
