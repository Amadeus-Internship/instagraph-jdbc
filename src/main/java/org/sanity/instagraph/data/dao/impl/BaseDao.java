package org.sanity.instagraph.data.dao.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseDao {
    private static Connection connection;

    protected BaseDao() {

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

    protected void executeQuery(String query) {
        try {
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery(query);

            List<Object> resultSet = new ArrayList<>();

            while(results.next()) {
                results.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
