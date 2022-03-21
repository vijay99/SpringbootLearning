package com.vijay.learn.SpringBootLearning.entity;

import org.springframework.http.HttpStatus;

/**
 * @author Kumar Vijay
 */
public class ErrorMessage {
    private HttpStatus sttaus;
    private String errorMessage;

    public ErrorMessage(){

    }

    public ErrorMessage(HttpStatus sttaus, String errorMessage) {
        this.sttaus = sttaus;
        this.errorMessage = errorMessage;
    }

    public HttpStatus getSttaus() {
        return sttaus;
    }

    public void setSttaus(HttpStatus sttaus) {
        this.sttaus = sttaus;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "ErrorMessage{" +
                "sttaus=" + sttaus +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
