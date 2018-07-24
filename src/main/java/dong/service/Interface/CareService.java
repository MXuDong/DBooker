package dong.service.Interface;

import dong.model.Bookers;
import dong.model.Care;
import dong.model.User;

public interface CareService {
//    添加收藏
    boolean createCare(Care care);
//    取消收藏
    boolean deleteCare(Care care);
//    查看关注人
    User getCareUser(Care care);
//    查看被关注博客
    Bookers getBeCaredBooker(Care care);
}
