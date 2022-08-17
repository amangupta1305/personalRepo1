package org.testing.teststeps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HTTPSmethod {
	
	Properties pr;
	
	public HTTPSmethod(Properties pr) {
	
		this.pr=pr;
	}
	
	public void Postrequest(String Bodydata, String uriKey)
	{
		String uri=pr.getProperty(uriKey);
		
		Response res=
				given()
		        .contentType(ContentType.JSON)
		        .body(Bodydata)
		        .when()
		        .post(uri);
				
				System.out.println("the status code is " + res.statusCode());
				System.out.println("the data is " + res.asString());
	}

}
