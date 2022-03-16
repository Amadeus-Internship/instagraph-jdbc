package org.sanity.instagraph.data.dao.impl;

import org.sanity.instagraph.data.mappers.api.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CoreDaoImpl extends BaseDao {
    public void executeBlankQuery(String sqlQuery) {
        this.executeBlank(sqlQuery);
    }

    public List<Object> executeCallable(String callableSql, Mapper mapper){
        return super.executeCallable(callableSql, mapper);
    }
}
