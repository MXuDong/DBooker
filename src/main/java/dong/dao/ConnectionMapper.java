package dong.dao;

import dong.model.Connection;

public interface ConnectionMapper {
    int insert(Connection record);

    int insertSelective(Connection record);
}