package nl.hu.iac.rest;

import nl.hu.iac.service.ServiceProvider;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/service")
public class ZonnestandService {

	@GET
	@Path("/{year}/{month}/{dayofmonth}/{hourofday}/{minutes}/{latitude}/{longtitude}")
	@Produces("application/json")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Response getZonnestand(@PathParam("year") int year,
							 @PathParam("month") int month,
							 @PathParam("dayofmonth") int dayofmonth,
							 @PathParam("hourofday") int hourofday,
							 @PathParam("minutes") int minutes,
							 @PathParam("latitude") double latitude,
							 @PathParam("longtitude") double longtitude){

		return Response.status(200).entity(ServiceProvider.getZonnestandService().Calculate(year, month, dayofmonth, hourofday, minutes, latitude, longtitude).toString()).build();
	}
}