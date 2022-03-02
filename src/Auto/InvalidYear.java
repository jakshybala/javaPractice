package Auto;

public class InvalidYear extends RuntimeException{
    public InvalidYear() {

    }
    public InvalidYear (String message) {
        super(message);
    }


}
