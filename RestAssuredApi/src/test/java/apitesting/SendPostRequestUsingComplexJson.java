package apitesting;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SendPostRequestUsingComplexJson {
	public static void main(String[] args) {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("email", "keerthi@gmail.com");
		map.put("FirstName", "Keerthi1");
		map.put("lastName", "Poduru1");
		
		ArrayList<Integer> ListOfMobileNos = new ArrayList<Integer>();
		ListOfMobileNos.add(2323232);
		ListOfMobileNos.add(232322);
		map.put("mobile", ListOfMobileNos);
		
		HashMap<String, String> address = new HashMap<String, String>();
		address.put("flatNo", "A-131");
		address.put("City", "New Delhi");
		address.put("State", "Delhi");
		map.put("address", address);
		Response response = given().contentType(ContentType.JSON).body(map).log().all().post("http://localhost:8080/api/users");
		response.prettyPrint();
		System.out.println(response.getStatusCode());
		
		
	}

}
