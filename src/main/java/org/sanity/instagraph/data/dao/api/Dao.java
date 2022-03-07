package org.sanity.instagraph.data.dao.api;

import java.util.Collection;

public interface Dao<TEntity> {
    Collection<TEntity> queryEntities(String sqlQuery);
}
