package com.github.gabrielmagal.talkflow.resource;

import com.github.gabrielmagal.talkflow.dto.MessageDto;
import io.smallrye.common.annotation.Blocking;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

@ApplicationScoped
public class MessageProcessor {
    @Incoming("processor")
    @Outgoing("quotes")
    @Blocking
    public MessageDto process(MessageDto messageDto) throws InterruptedException {
        Thread.sleep(200);
        System.out.println(messageDto.toString());
        return messageDto;
    }
}