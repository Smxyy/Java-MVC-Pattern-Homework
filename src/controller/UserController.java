package controller;

import model.User;
import model.dto.UserDto;
import model.service.UserService;
import model.service.UserServiceImpl;

import java.util.List;

public class UserController {
    private final UserService userService = new UserServiceImpl();
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }
    public void addNewUser(UserDto userDto){
        User user = new User((getAllUsers().size() + 1), userDto.userName(), userDto.email());
        userService.addNewUser(user);
    }
    public int deleteUser(Integer id){
        return userService.deleteUser(id);
    }
}
