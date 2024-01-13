package com.github.gabrielmagal.talkflow.resource;

import com.github.gabrielmagal.talkflow.dto.MessageDto;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import java.util.UUID;

@Path("/")
public class MessageResource {
    @Channel("canal_emitter")
    Emitter<MessageDto> messageDtoEmitter;

    @POST
    @Path("/request")
    @Produces(MediaType.TEXT_PLAIN)
    public UUID createRequest(@QueryParam("msg") String msg) {
        MessageDto messageDto = new MessageDto(msg);
        messageDtoEmitter.send(messageDto);
        System.out.println(messageDto.getUuid());
        return messageDto.getUuid();
    }
}