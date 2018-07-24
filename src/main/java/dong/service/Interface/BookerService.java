package dong.service.Interface;

import dong.model.Bookers;
import dong.model.User;

import java.awt.print.Book;

public interface BookerService {
    //通过博客ID查找博客
    Bookers findBookerById(int bookerId);
    //创造博客
    boolean createBooker(Bookers bookers);
    //删除博客
    boolean deleteBooker(Bookers bookers);
    //修改博客
    boolean updateBooker(Bookers bookers);
    //查找作者
    User findAuthorId(Bookers bookers);
}
