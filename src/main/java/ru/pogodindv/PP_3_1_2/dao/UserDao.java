package ru.pogodindv.PP_3_1_2.dao;

import ru.pogodindv.PP_3_1_2.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void addUser(User user);

    void deleteUser(User user);

    void editUser(User user);

    User getUserById(Long id);
}
