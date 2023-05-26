package org.example.factory_pattern.abstract_factory_pattern;

public class OracleConnection implements IConnection{
    @Override
    public void connect() {
        System.out.println("Oracle连接建立！！！");
    }
}
