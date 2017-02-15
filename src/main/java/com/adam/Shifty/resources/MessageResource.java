package com.adam.Shifty.resources;

import com.adam.Shifty.model.Message;
import service.MessageService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by adam on 10/02/2017.
 */
@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

    MessageService messageService = new MessageService();

    @GET
    public List<Message> getMessages(){
        return messageService.getAllMessages();
    }


    @POST
    public Message addMessage(Message message){
        messageService.addMessage(message);
        return message;
    }

    @PUT
    @Path("/{messageId}")
    public Message updateMessage(@PathParam("messageId") long messageId, Message message){
        message.setId(messageId);
        messageService.updateMessage(message);
        return message;
    }

    @DELETE
    @Path("/{messageId}")
    public void deleteMessage(@PathParam("messageId") long messageId){
        messageService.removeMessage(messageId);
    }

    @GET
    @Path("/{messageId}")
    public Message getMessage(@PathParam("messageId") long messageId){

        return messageService.getMessage(messageId);
    }
}
