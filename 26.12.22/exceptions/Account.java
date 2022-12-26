package exceptions;

import java.io.IOException;

public class Account {
    private float balance;

    public void deposit(float value) throws IOException {
//        defensive programming
        if (value <= 0)
            throw new IllegalArgumentException();
//            throw new IOException();
    }

//    public void withdraw(float value) throws InsufficientFundsException {
//        if(value > balance) {
//            throw new InsufficientFundsException();
//        }
//    }

//    1st way of chaining exceptions

//    public void withdraw(float value) throws AccountException {
//        if(value > balance) {
//            var fundsException = new InsufficientFundsException();
//            var accountException = new AccountException();
//            accountException.initCause(fundsException);
//            throw accountException;
//        }
//    }

//    2nd way of chaining exceptions

    public void withdraw(float value) throws AccountException {
        if(value > balance)
            throw new AccountException(new InsufficientFundsException());
    }
}
