package org.sanity.instagraph.data.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreDaoImpl extends BaseDao {
    @Override
    protected Object mapObject(ResultSet resultSet) throws SQLException {
        return null;
    }

    public void executeBlankQuery(String sqlQuery) {
        this.executeBlank(sqlQuery);
    }
}
