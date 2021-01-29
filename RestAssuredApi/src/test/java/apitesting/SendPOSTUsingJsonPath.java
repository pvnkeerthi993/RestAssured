package apitesting;

import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;
//import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SendPOSTUsingJsonPath {
	public static void main(String[] args) {
		Response response = given().auth().basic("sk_test_51HcB4NGqtnycoaBT9EUoXobjMUWg2lD0SEWyEQvYbV3GYK4mqMaKpFeqULe63CL1WK8c2MWAz5JrUpy2hzu59RuR00RusAuwVB","").formParam("name", "Keerthi Poduru").formParam("email","keerthi@gmail.com").formParam("address[line1]","A-131 New Delhi").formParam("preferred_locales[0]","yes").post("https://api.stripe.com/v1/customers");
		response.prettyPrint();
		//JsonPath json = response.jsonPath();
		System.out.println(response.jsonPath().get("id"));
		System.out.println(response.jsonPath().get("name"));
		System.out.println(response.jsonPath().get("address.line1"));
		System.out.println(response.jsonPath().get("preferred_locales[0]"));
		System.out.println(response.jsonPath().getMap("$").size());
		System.out.println(response.jsonPath().getMap("address").size());
		System.out.println(response.jsonPath().getList("preferred_locales").size());
	}

}
