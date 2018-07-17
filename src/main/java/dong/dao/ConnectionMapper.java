package dong.dao;

import dong.model.Connection;

import java.util.List;

public interface ConnectionMapper {

    List<Connection> findByUserId(int userId);

    int insert(Connection record);

    int insertSelective(Connection record);
}