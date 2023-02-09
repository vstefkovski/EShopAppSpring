package mk.ukim.finki.eshopappspring.exceptions;

public class InvalidUserCredentialException extends RuntimeException{
    public InvalidUserCredentialException() {
        super("Invalid User Credential exception");
    }
}
