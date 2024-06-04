package model.service;

import model.User;
import model.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();
    void addNewUser(User user);
    int deleteUser(Integer id);
}
