package apitesting;

	import static io.restassured.RestAssured.given;

	import java.util.ArrayList;
	import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
	import io.restassured.response.Response;

	public class SendPostRequestUsingJsonAPI {
		public static void main(String[] args) {
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("email", "keerthi@gmail.com");
			jsonObject.put("FirstName", "Keerthi1");
			jsonObject.put("lastName", "Poduru1");
			
			JSONArray ListOfMobileNos = new JSONArray();
			ListOfMobileNos.put(2323244);
			ListOfMobileNos.put(232344);
			jsonObject.put("mobile", ListOfMobileNos);
			
			JSONObject address = new JSONObject();
			address.put("flatNo", "A-140");
			address.put("City", "New Delhi1");
			address.put("State", "Delhi1");
			jsonObject.put("address", address);
			Response response = given().contentType(ContentType.JSON).body(jsonObject.toString()).log().all().post("http://localhost:8080/api/users");
			response.prettyPrint();
			System.out.println(response.getStatusCode());
			
			
		}

	}
