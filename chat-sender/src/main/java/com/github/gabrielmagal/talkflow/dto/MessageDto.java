package com.github.gabrielmagal.talkflow.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class MessageDto {
    private final UUID uuid = UUID.randomUUID();
    private final LocalDateTime localDateTime = LocalDateTime.now();
    private String texto;

    public MessageDto(String msg) {
        this.texto = msg;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public String getTexto() {
        return texto;
    }

    public UUID getUuid() {
        return uuid;
    }
}
