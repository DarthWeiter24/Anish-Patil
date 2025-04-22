package api.endpoints;

public class Routes {
	public static String base_url = "https://petstore3.swagger.io/api/v3";
	
    // -------------------- PET MODULE --------------------
    public static final String ADD_NEW_PET = base_url + "/pet";
	//User Module
    public static final String CREATE_USER = base_url + "/user";
    public static final String CREATE_USERS_WITH_LIST = base_url + "/user/createWithList";
    public static final String LOGIN_USER = base_url + "/user/login";
    public static final String LOGOUT_USER = base_url + "/user/logout";
    public static final String GET_USER_BY_USERNAME = base_url + "/user/{username}";
    public static final String UPDATE_USER = base_url + "/user/{username}";
    public static final String DELETE_USER = base_url + "/user/{username}";
    //Store Module
    public static final String GET_INVENTORY = base_url + "/store/inventory";
    public static final String CREATE_ORDER= base_url + "/store/order";
    public static final String GET_ORDER_BY_ID = base_url + "/store/order/{orderId}";
    public static final String DELETE_ORDER = base_url + "/store/order/{orderId}";

}
