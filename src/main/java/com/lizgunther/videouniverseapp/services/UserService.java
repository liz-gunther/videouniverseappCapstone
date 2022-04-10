package com.lizgunther.videouniverseapp.services;

import com.lizgunther.videouniverseapp.models.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    User getUserById(long id);

    void deleteUserById(long id);

}
