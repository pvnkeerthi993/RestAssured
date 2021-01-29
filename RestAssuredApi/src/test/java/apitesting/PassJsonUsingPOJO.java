package apitesting;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PassJsonUsingPOJO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User("trainer1002way2automation.com","Pavan","Tammiraju","A-131","New Delhi","Delhi","India");
		user.setMobile(123456,152436,123654);
		Response response = given().contentType(ContentType.JSON).body(user).log().all().post("http://localhost:8080/api/users");
		response.prettyPrint();
		System.out.println(response.getStatusCode());
	}

}
