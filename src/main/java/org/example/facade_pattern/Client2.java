package org.example.facade_pattern;

public class Client2 {

    Facade facade = new Facade();

    public void doSomething2() {
        facade.doSomethingFacade();
    }

}
