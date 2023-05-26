package org.example.factory_pattern.abstract_factory_pattern;

import org.junit.jupiter.api.Test;

class AbstractFactoryTest {

    @Test
    void test() {
        // mysql
        IDataBaseUtils idataBaseUtils = new MySqlDataBaseUtils();
        IConnection connection = idataBaseUtils.getConnection();
        connection.connect();
        ICommand command = idataBaseUtils.getCommand();
        command.command();

        // oracle
        idataBaseUtils = new OracleDataBaseUtils();
        connection = idataBaseUtils.getConnection();
        connection.connect();
        command = idataBaseUtils.getCommand();
        command.command();

    }

}