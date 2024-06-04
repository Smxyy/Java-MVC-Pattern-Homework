package model.dao;

import model.User;

import java.util.List;

public interface UserDao {
    void addNewUser(User user);
    int deleteUser(Integer id);
    List<User> getAllUsers();
    void updateUser(User user);
}
