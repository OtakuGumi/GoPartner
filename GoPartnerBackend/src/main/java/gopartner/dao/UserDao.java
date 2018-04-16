package gopartner.dao;

import gopartner.entity.PreferredUser;
import gopartner.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<User> matchUser(PreferredUser preferredUser);
}
