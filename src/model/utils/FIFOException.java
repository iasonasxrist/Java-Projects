package model.utils;

public class FIFOException extends Exception{
    String error_msg;

    public FIFOException(String error_msg) {
        this.error_msg = error_msg;
    }

    @Override
    public String toString() {
        return (error_msg);
    }
}
