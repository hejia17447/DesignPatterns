package org.example.facade_pattern;

public class Client1 {

    Facade facade = new Facade();

    public void doSomething1() {
        facade.doSomethingFacade();
    }

}
