package com.karlos.securecapita.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.util.Map;

@Data
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class HttpResponse {
    protected String timestamp;
    protected int statusCode;
    protected HttpStatus status;
    protected String message;
    protected String developerMessage;
    protected Map<?, ?> data;

    private HttpResponse(Builder builder) {
        this.timestamp = builder.timestamp;
        this.statusCode = builder.statusCode;
        this.status = builder.status;
        this.message = builder.message;
        this.developerMessage = builder.developerMessage;
        this.data = builder.data;
    }

    // Método estático para obtener una instancia del Builder
    public static Builder builder() {
        return new Builder();
    }

    // Clase estática Builder
    public static class Builder {
        private String timestamp;
        private int statusCode;
        private HttpStatus status;
        private String message;
        private String developerMessage;
        private Map<?, ?> data;

        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder statusCode(int statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public Builder status(HttpStatus status) {
            this.status = status;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder developerMessage(String developerMessage) {
            this.developerMessage = developerMessage;
            return this;
        }

        public Builder data(Map<?, ?> data) {
            this.data = data;
            return this;
        }

        public HttpResponse build() {
            return new HttpResponse(this);
        }
    }

    // Getters y Setters
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }

    public Map<?, ?> getData() {
        return data;
    }

    public void setData(Map<?, ?> data) {
        this.data = data;
    }
}
