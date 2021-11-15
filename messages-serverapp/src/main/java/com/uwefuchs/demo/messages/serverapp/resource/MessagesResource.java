package com.uwefuchs.demo.messages.serverapp.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

@Service
@Path("/messages")
public class MessagesResource {
    @GET
    @Produces("text/plain")
    public String someWhat() {
        return "This is a message from the MessagesServerApp";
    }
}
