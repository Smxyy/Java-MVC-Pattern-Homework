package model.dao;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{
    private List<User> userList = new ArrayList<>(
            List.of(new User(1,"KoKo","koko123@gmail.com"),
                    new User(2,"KaKa","kaka123@gmail.com"))
    );
    @Override
    public void addNewUser(User user) {
        userList.add(user);
    }

    @Override
    public int deleteUser(Integer id) {
        if( userList.removeIf(e->e.getId().equals(id)))
            return 1;
        else return 0;
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }

    @Override
    public void updateUser(User user) {

    }
}
