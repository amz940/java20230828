package ch11exception.book.sec6;

public class InsufficientException extends Exception{
    public InsufficientException(){

    }

    public InsufficientException(String message){
        super(message);
    }
}
