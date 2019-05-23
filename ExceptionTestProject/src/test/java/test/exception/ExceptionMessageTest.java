package test.exception;

import org.testng.annotations.Test;

import java.io.IOException;

public class ExceptionMessageTest {
    @Test(expectedExceptions={IOException.class}, expectedExceptionsMessageRegExp="Pass Message test")
    public void exceptionMsgTestOne() throws Exception{
        throw new IOException("Pass Message test");
    }

    @Test(expectedExceptions={IOException.class},  expectedExceptionsMessageRegExp=".* Message .*")
    public void exceptionMsgTestTwo() throws Exception{
        throw new IOException("Pass Message test");
    }

    @Test(expectedExceptions={IOException.class}, expectedExceptionsMessageRegExp="Pass Message test")
    public void exceptionMsgTestThree() throws Exception{
        throw new IOException("Fail Message test");
    }
}
