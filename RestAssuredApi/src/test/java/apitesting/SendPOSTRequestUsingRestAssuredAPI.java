package apitesting;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SendPOSTRequestUsingRestAssuredAPI {

	public static void main(String[] args) {
		
		
		  Response response = given().auth().basic(
		  "sk_test_51HcB4NGqtnycoaBT9EUoXobjMUWg2lD0SEWyEQvYbV3GYK4mqMaKpFeqULe63CL1WK8c2MWAz5JrUpy2hzu59RuR00RusAuwVB:"
		  ,"").formParam("name","Rahul Arora").formParam("email",
		  "trainer@way2automation.com").post("https://api.stripe.com/v1/customers");
		  given().auth().basic("sk_test_51HcB4NGqtnycoaBT9EUoXobjMUWg2lD0SEWyEQvYbV3GYK4mqMaKpFeqULe63CL1WK8c2MWAz5JrUpy2hzu59RuR00RusAuwVB:","").formParam("name","Rahul Arora").post(
		  "https://api.stripe.com/v1/customers");
		  
		  response.prettyPrint();
		 
		
		//String bodyString = "{\"email\":\"eve.holt@reqres.in\",\"password\":\"pistol\"}";
		/*HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", "trainer@way2automation.com");
		map.put("password", "pistol");
		Response response = given().contentType(ContentType.JSON).body(map).post("http://localhost:8080/api/users");
		System.out.println(response.getStatusCode());*/
		
		
	}

}
