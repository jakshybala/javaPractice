package Auto;

public class InvalidData extends RuntimeException{

    public InvalidData() {
    }

    public InvalidData(String message) {
        super(message);
    }
}
