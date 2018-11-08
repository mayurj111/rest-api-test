package api_test;

import static org.junit.Assert.*;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import api_test.model.Location;
import api_test.model.RestResponse;
import org.junit.Before;
import org.junit.Test;

public class restTest {

    private static String API_ENDPOINT = "http://services.groupkt.com/state/get/USA/all";

    private WebTarget target;
    private Response response;

    @Before
    public void setup(){
        Client client = ClientBuilder.newClient();
        target = client.target(API_ENDPOINT);
        response = target.request(MediaType.APPLICATION_JSON).get();
        Location restResponse = response.readEntity(Location.class);
    }

//    public String getLargestCity(){
//        Response response = target.request(MediaType.APPLICATION_JSON).get();
//    }

    //A)program that returns both largest city and capital based on user input for state name or state abbreviation.

    @Test
    public void GetAllValidResponse(){
        // act
        Response response = target.request(MediaType.APPLICATION_JSON).get();

        // assert
        assertEquals(200, response.getStatus());

    }

}
