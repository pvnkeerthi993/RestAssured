package apitesting;

import static io.restassured.RestAssured.given;

import java.io.File;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SendPOSTRequestUsingParams {

	public static void main(String[] args) {
		
		Response response = given().contentType(ContentType.JSON).body(new File("./newUser.json")).log().all().post("http://localhost:8080/api/users");
		response.prettyPrint();
		System.out.println(response.getStatusCode());
		  
		  
	}

}
