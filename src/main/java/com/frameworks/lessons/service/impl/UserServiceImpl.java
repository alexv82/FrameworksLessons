package com.frameworks.lessons.service.impl;

import com.frameworks.lessons.dao.UserDao;
import com.frameworks.lessons.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.frameworks.lessons.service.UserService;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao dao;

    @Override
    public void add(User user) {
        if(user.getId()==0) dao.add(user);
    }

    @Override
    public List<User> listUsers() {
        return dao.listUsers();
    }
}
