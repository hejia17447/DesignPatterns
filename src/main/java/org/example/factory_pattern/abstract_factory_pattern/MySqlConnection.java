package org.example.factory_pattern.abstract_factory_pattern;

public class MySqlConnection implements IConnection{
    @Override
    public void connect() {
        System.out.println("MySql连接建立！！！");
    }
}
