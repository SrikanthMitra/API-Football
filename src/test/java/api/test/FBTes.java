package api.test;

import java.util.*;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import api.endpoints.FTEndpoints;
import api.endpoints.Routes;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class FBTes 
{
	/*
	@Test
	public void getStatus()
	{
		Response response = FTEndpoints.Status();
				response.then().log().all();
	}

	@Test(priority = 2)
	public void getTimezone()
	{
		Response response = FTEndpoints.Timezone();
			response.then().log().all();
	}
	
	@Test(priority = 3)
	public void getLeagues() 
	{
		Response response = FTEndpoints.GetLeague();
		JsonPath test = response.jsonPath();
		test.get()();
		//response.then().log().all();
	}
	*/
	@Test
	public void getTeams() 
	{
		Response response = FTEndpoints.GetTeams();
		JsonPath test = response.jsonPath();
		String test2  = (String) test.param(key, value)
		System.out.println(test2);
		//response.then().log().all();
	}
	
}
