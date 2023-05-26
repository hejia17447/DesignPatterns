package org.example.factory_pattern.abstract_factory_pattern;

public class MySqlCommand implements ICommand{
    @Override
    public void command() {
        System.out.println("MySQl命令提交！！！");
    }
}
