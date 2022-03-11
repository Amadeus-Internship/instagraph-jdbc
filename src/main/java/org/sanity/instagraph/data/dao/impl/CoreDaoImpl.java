package org.sanity.instagraph.data.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CoreDaoImpl extends BaseDao {
    public void executeBlankQuery(String sqlQuery) {
        this.executeBlank(sqlQuery);
    }
}
