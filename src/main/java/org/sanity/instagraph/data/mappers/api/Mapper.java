package org.sanity.instagraph.data.mappers.api;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface Mapper {
    Object mapRow(ResultSet resultSet) throws SQLException;
}
