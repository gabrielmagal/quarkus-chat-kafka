package com.github.gabrielmagal.talkflow.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public class MessageDto {
    private UUID uuid;

    private LocalDateTime localDateTime;

    private String texto;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return getUuid() + " - enviou a seguinte mensagem: " + getTexto() + ". As " + getLocalDateTime();
    }
}
