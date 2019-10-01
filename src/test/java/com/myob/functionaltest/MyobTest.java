package com.myob.functionaltest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class MyobTest {

	
	
	
	@Test
	public void validateHelloJSONBody_test()
	{
	    RestAssured.baseURI = "http://3.91.20.115:8090";
	    RequestSpecification httpRequest = RestAssured.given();
	    // Set HTTP Headers
	    httpRequest.header("Content-Type", "application/text");
	    //httpRequest.header("Authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN0QHRlc3QuY29tIiwiZXhwIjoxNTI5NDIwMjQzfQ.qepmpAizfH9QHNygKM-7fhhkpvJSYMUOQOTKemLeYCcy2E1yrFNxA61YCqio7rWGUmSz3KE2osqlo-7LhWzRTQ");
	    
	    Response response = httpRequest.get("/hello");
	    
	    // Get Response Body 
	    ResponseBody body = response.getBody();
	    
	    // Get Response Body as String 
	    String bodyStringValue = body.asString();
	    // Validate if Response Body Contains a specific String
	    Assert.assertTrue(bodyStringValue.contains("hello world"));
	    
	    
	}
	
	@Test
	public void validateResponseJSONBody_test()
	{
	    RestAssured.baseURI = "http://3.91.20.115:8090";
	    RequestSpecification httpRequest = RestAssured.given();
	    // Set HTTP Headers
	    httpRequest.header("Content-Type", "application/text");
	    //httpRequest.header("Authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN0QHRlc3QuY29tIiwiZXhwIjoxNTI5NDIwMjQzfQ.qepmpAizfH9QHNygKM-7fhhkpvJSYMUOQOTKemLeYCcy2E1yrFNxA61YCqio7rWGUmSz3KE2osqlo-7LhWzRTQ");
	    
	    Response response = httpRequest.get("/response");
	    
	    // Get Response Body 
	    ResponseBody body = response.getBody();
	    
	    // Get Response Body as String 
	    String bodyStringValue = body.asString();
	    // Validate if Response Body Contains a specific String
	    Assert.assertTrue(bodyStringValue.contains("Error Code\":200"));
	    
	    
	}
	
	@Test
	public void validateMetadataJSONBody_test()
	{
	    RestAssured.baseURI = "http://3.91.20.115:8090";
	    RequestSpecification httpRequest = RestAssured.given();
	    // Set HTTP Headers
	    httpRequest.header("Content-Type", "application/text");
	    //httpRequest.header("Authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN0QHRlc3QuY29tIiwiZXhwIjoxNTI5NDIwMjQzfQ.qepmpAizfH9QHNygKM-7fhhkpvJSYMUOQOTKemLeYCcy2E1yrFNxA61YCqio7rWGUmSz3KE2osqlo-7LhWzRTQ");
	    
	    Response response = httpRequest.get("/metadata");
	    
	    // Get Response Body 
	    ResponseBody body = response.getBody();
	    
	    // Get Response Body as String 
	    String bodyStringValue = body.asString();
	    // Validate if Response Body Contains a specific String
	    Assert.assertTrue(bodyStringValue.contains("Name\":\"MYOB"));
	    
	    
	}
}
