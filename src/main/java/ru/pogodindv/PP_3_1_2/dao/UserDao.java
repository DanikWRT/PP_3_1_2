package ru.pogodindv.PP_3_1_2.dao;

import ru.pogodindv.PP_3_1_2.model.User;

import java.util.List;

public abstract class UserDao {
    public abstract List<User> getAllUsers();

    public abstract void addUser(User user);

    public abstract void deleteUser(User user);

    public abstract void editUser(User user);

    public abstract User getUserById(Long id);
}
