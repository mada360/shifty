package com.adam.Shifty;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@Path("/HelloWorld")
public class HelloWorldService {

    private String something = "Something";

    private List<String> list = new ArrayList<String>();

    private void populate(){
        list.add("String");
        list.add("Adam");
        list.add("Java");
    }

    @GET
    @Path("/sayHello")
    public String sayHello() {
        return "<h1>Hello World</h1>";
    }

    @GET
    @Path("/list")
    public String seeSomething(){
        populate();
        StringBuilder sb = new StringBuilder();
        sb.append("<h1>List</h1>");
        sb.append("<ul>");
        for (String item : list) {
            sb.append("<li>");
            sb.append(item);
            sb.append("</li>");
        }
        sb.append("</ul>");
        return sb.toString();
    }


}
