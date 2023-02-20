package nl.techiteasy.controller.Exceptions;

public class ObjectNameTooLongException extends RuntimeException{

    public ObjectNameTooLongException() {
        super();
    }

    public ObjectNameTooLongException(String message) {
        super(message);
    }
}
