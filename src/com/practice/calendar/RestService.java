package com.practice.calendar;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import com.google.gson.Gson;



@Path("/services")
public class RestService {
					
	Tempdb tempObj = new Tempdb();
	
	@GET
	@Path("/events")
	@Produces(MediaType.APPLICATION_JSON)
	public String produceJSON() {
	
		Gson gsonObject = new Gson();

		return gsonObject.toJson(tempObj.getData());
		
	}

}