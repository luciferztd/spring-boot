package com.example.demo.login.service;

import com.example.demo.login.dto.model.UserDto;
import com.example.demo.login.model.User;
import com.example.demo.login.repository.UserDao;
import org.dom4j.util.UserDataDocumentFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    User user=new User();

    public String authenticateUser(final UserDto userDto) {

        if (userDao.checkValidUser(userDto.getUserName())) {
            String dbpassword = userDao.getLoginCredentials(userDto.getUserName());

            if (userDto.getPassword().equals(dbpassword)) {
                user.setUserName("lucifer");
                return ("Valid User");
            } else {
                return ("Incorrect Password");
            }
        } else {
            return ("User does not exist");
        }

    }
}
