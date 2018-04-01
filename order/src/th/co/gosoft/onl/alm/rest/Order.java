package th.co.gosoft.onl.alm.rest;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


@Path("/GetRewardQty")
public class Order {
	public static final String CONTENT_TYPE_JSON_UTF_8 = "application/json; charset=UTF-8";
	@POST
	@Consumes(CONTENT_TYPE_JSON_UTF_8)
	@Produces(CONTENT_TYPE_JSON_UTF_8)
	public Response getRewardQty(String request) throws Throwable{
		return Response.status(Status.OK).entity("{\"test\":\"ok12345\"}").build();
	}
}

