package polymorphism;

public enum Status {


    SUCCESS("Transaction is successfull"),
    FAILURE("Transaction is failed"),
    PENDING("Tranaction is pending");

    private final String message;

    Status(String message) {
        this.message = message;
    }

    public String setMessage(){
        return message;
    }

    public String getMessage() {
        return message;
    }
}
