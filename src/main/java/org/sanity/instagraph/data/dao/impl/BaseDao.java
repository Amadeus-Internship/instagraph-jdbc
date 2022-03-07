package org.sanity.instagraph.data.dao.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseDao {
    private static Connection connection;

    protected BaseDao() {
        this.init();
    }

    private void init() {
        if(connection == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/instagraph?createDatabaseIfNotExist=true";
                connection = DriverManager.getConnection(url, "root", "1234");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    protected List<Object> executeQuery(String query) {
        List<Object> resultObjects = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery(query);

            while(results.next()) {
                resultObjects.add(this.mapObject(results));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultObjects;
    }

    protected abstract Object mapObject(ResultSet resultSet) throws SQLException;
}
