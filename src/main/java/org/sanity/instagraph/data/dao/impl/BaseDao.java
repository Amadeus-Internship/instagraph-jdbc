package org.sanity.instagraph.data.dao.impl;

import org.sanity.instagraph.data.mappers.api.Mapper;

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

    public boolean executeBlank(String query) {
        boolean result = false;

        try {
            Statement statement = connection.createStatement();
            result = statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    protected List<Object> executeQuery(String query, Mapper mapper) {
        List<Object> resultObjects = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery(query);

            while(results.next()) {
                resultObjects.add(mapper.mapRow(results));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultObjects;
    }

    protected boolean hasColumn(ResultSet rs, String columnName) throws SQLException {
        ResultSetMetaData rsmd = rs.getMetaData();
        int columns = rsmd.getColumnCount();
        for (int x = 1; x <= columns; x++) {
            if (columnName.equals(rsmd.getColumnName(x))) {
                return true;
            }
        }
        return false;
    }

//    protected abstract Object mapObject(ResultSet resultSet) throws SQLException;
}
