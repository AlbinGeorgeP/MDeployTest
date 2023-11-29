package com.ManualDeployTest.ManualDeployTest.Error;

public class UserNotFoundException extends RuntimeException{
    public  UserNotFoundException(String message)
    {
        super(message);
    }
}
