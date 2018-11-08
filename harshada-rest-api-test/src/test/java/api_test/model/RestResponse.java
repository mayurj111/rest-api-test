package api_test.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestResponse {
    private Result[] results;

    private String[] messages;

    public Result[] getResults()
    {
        return results;
    }

    public void setResults(Result[] results)
    {
        this.results = results;
    }

    public String[] getMessages ()
    {
        return messages;
    }

    public void setMessages (String[] messages)
    {
        this.messages = messages;
    }

}
