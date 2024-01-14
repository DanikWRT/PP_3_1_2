package ru.pogodindv.PP_3_1_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pogodindv.PP_3_1_2.dao.UserDao;
import ru.pogodindv.PP_3_1_2.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private UserDao userDao;


    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }

    @Override
    public void editUser(User user) {
        userDao.editUser(user);
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }
}
