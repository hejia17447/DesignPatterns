package org.example.factory_pattern.abstract_factory_pattern;

public interface IDataBaseUtils {

    IConnection getConnection();

    ICommand getCommand();

}
