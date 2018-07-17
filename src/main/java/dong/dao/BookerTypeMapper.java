package dong.dao;

import dong.model.BookerType;

public interface BookerTypeMapper {
    int insert(BookerType record);

    int insertSelective(BookerType record);
}