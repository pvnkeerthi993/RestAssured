package apitesting;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
/*import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;*/
import io.restassured.response.Response;
 
public class SendGetRequestUsingRestAssured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * Set Authentication:- Basic Authentication/Bearer Token
		 *  
		 *  Request- Set of Request specs
		 *  Response- Do Validations
		 *  
		 *  
		 *  */
		Response response = given().auth().basic("sk_test_4eC39HqLyjWDarjtT1zdp7dc:","").get("https://api.stripe.com/v1/customers");
		response.prettyPrint();
		given().contentType(ContentType.JSON);
		given().contentType("application/JSON");
		given().header("content-type","aplication/json").auth().basic("", "");
		
		
	}

}
