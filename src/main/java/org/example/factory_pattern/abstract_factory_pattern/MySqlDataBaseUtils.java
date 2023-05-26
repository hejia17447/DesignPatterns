package org.example.factory_pattern.abstract_factory_pattern;

public class MySqlDataBaseUtils implements IDataBaseUtils{
    @Override
    public IConnection getConnection() {
        return new MySqlConnection();
    }

    @Override
    public ICommand getCommand() {
        return new MySqlCommand();
    }
}
