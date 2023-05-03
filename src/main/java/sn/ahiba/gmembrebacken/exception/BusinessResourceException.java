package sn.ahiba.gmembrebacken.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class BusinessResourceException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    private String message;
    private HttpStatus status;

    public BusinessResourceException(String message, HttpStatus status) {
        super(message);
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStatus() {
        return this.status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
