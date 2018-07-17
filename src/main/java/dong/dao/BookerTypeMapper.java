package dong.dao;

import dong.model.BookerType;

import java.util.List;

public interface BookerTypeMapper {

    List<BookerType> findAll();

    int insert(BookerType record);

    int insertSelective(BookerType record);
}