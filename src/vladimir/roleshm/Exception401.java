package vladimir.roleshm;

public class Exception401 extends RuntimeException{
    public Exception401() {
        super("Not authenticated");
    }
}
