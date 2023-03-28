package api.test;

import org.testng.annotations.Test;
import api.endpoints.FTEndpoints;
import api.endpoints.Routes;
import io.restassured.response.Response;
public class FBTes 
{
	@Test
	public void getStatus()
	{
		Response response = FTEndpoints.Status();
				response.then().log().all();
	}

	@Test
	public void getTimezone()
	{
		Response response = FTEndpoints.Timezone();
			response.then().log().all();
	}
	
}
