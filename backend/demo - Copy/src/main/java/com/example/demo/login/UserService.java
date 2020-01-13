package com.example.demo.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    UserDao userDao;


    public String authenticateUser(final String mailId,final String password) {

        if (userDao.checkValidUser(mailId)) {
            String dbpassword = userDao.getLoginCredentials(mailId);
            //System.out.println(password);
            if (password.equals(dbpassword)) {
                return ("Valid User");
            } else {
                return ("Incorrect Password");
            }
        } else {
            return ("userName does not exist");
        }

    }
}
