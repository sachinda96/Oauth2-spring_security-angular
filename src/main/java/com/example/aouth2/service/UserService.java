package com.example.aouth2.service;

import org.apache.catalina.User;

import java.awt.*;

public interface UserService {

    List findAll();

    User save(User user);

    User findOne(long id);

    void delete(Long id);
}
