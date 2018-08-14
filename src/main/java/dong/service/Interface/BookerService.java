package dong.service.Interface;

import dong.model.Bookers;
import dong.model.User;

import java.awt.print.Book;
import java.util.List;

public interface BookerService {
    //通过博客ID查找博客
    Bookers findBookerById(int bookerId);
    //创造博客
    boolean createBooker(Bookers bookers);
    //删除博客
    boolean deleteBooker(int bookerId);
    //修改博客
    boolean updateBooker(Bookers bookers);
    //查找作者
    User findAuthor(int bookersId);
    //通过作者ID查找某位作者的全部Booker
    List<Bookers> findBookersByUserId(int userId);
    //获得一位作者ID的某位
    int getBookerCount(int userId);
    //获取所有的Booker
    List<Bookers> findAll();
}
