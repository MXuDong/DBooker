package dong.service.Impl;

import dong.model.Bookers;
import dong.model.User;
import dong.service.Interface.BookerService;
import org.springframework.stereotype.Service;

@Service("bookerService")
public class BookerServiceImpl implements BookerService {
    @Override
    public Bookers findBookerById(int bookerId) {
        return null;
    }

    @Override
    public boolean createBooker(Bookers bookers) {
        return false;
    }

    @Override
    public boolean deleteBooker(Bookers bookers) {
        return false;
    }

    @Override
    public boolean updateBooker(Bookers bookers) {
        return false;
    }

    @Override
    public User findAuthorId(Bookers bookers) {
        return null;
    }
}
