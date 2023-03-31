package api.endpoints;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import jdk.internal.net.http.common.Log;


public class FTEndpoints 
{
	static String apikey = "dbf68caf871fb5d337affcadeee98c06";
	static String host = "api-football-v1.p.rapidapi.com/v3";
	
	public static Response Status()
	{
		Response response = given()
				.header("X-Rapidapi-Key", apikey)
				.header("x-rapidapi-host", host)
				.when()
					.get(Routes.status);
		return response;
	}
	
	public static Response Timezone()
	{
		Response response = given()
				.header("X-Rapidapi-Key", apikey)
				.header("x-rapidapi-host", host)
				.when()
					.get(Routes.timezone);
		return response;
	}
	
	public static Response GetLeague()
	{
		Response response = given()
				.header("X-Rapidapi-Key", apikey)
				.header("x-rapidapi-host", host)
				//.queryParam("name", "England")
				.when()
					.get(Routes.GetLeague);
		return response;
	}
	
	public static Response GetTeams()
	{
		Response response = given()
				.header("X-Rapidapi-Key", apikey)
				.header("x-rapidapi-host", host)
				.queryParam("id", "33")
				.when()
					.get(Routes.GetTeam);
		return response;
	}
}
