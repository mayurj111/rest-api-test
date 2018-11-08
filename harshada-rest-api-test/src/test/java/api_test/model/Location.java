package api_test.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
    private RestResponse RestResponse;

    public RestResponse getRestResponse ()
    {
        return RestResponse;
    }

    public void setRestResponse (RestResponse RestResponse)
    {
        this.RestResponse = RestResponse;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [RestResponse = "+RestResponse+"]";
    }
}
