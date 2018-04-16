package gopartner.controller;

import gopartner.dao.UserDao;
import gopartner.entity.PreferredUser;
import gopartner.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping(method = RequestMethod.PUT, path = "/match")
    public List<User> match(@RequestBody(required = true) PreferredUser preferredUser) {
        return userDao.matchUser(preferredUser);
    }

}
