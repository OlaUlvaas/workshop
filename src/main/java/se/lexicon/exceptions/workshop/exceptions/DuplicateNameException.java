package se.lexicon.exceptions.workshop.exceptions;

public class DuplicateNameException extends RuntimeException{

    private String message;

    public DuplicateNameException(String message){
        super(message);
        this.message = message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
