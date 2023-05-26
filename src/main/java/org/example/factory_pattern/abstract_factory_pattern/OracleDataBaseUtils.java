package org.example.factory_pattern.abstract_factory_pattern;

public class OracleDataBaseUtils implements IDataBaseUtils{
    @Override
    public IConnection getConnection() {
        return new OracleConnection();
    }

    @Override
    public ICommand getCommand() {
        return new OracleCommand();
    }
}
