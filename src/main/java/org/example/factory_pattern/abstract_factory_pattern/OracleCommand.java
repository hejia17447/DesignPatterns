package org.example.factory_pattern.abstract_factory_pattern;

public class OracleCommand implements ICommand{
    @Override
    public void command() {
        System.out.println("Oracle命令提交！！！");
    }
}
