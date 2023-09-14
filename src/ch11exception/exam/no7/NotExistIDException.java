package ch11exception.exam.no7;

public class NotExistIDException extends Exception {
    public NotExistIDException(){}

    public NotExistIDException(String message) {
        super(message);
    }
}
