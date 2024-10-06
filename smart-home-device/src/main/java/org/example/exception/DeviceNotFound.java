package org.example.exception;

public class DeviceNotFound extends RuntimeException {
    public DeviceNotFound() {
        super();
    }

    public DeviceNotFound(String message) {
        super(message);
    }
}
