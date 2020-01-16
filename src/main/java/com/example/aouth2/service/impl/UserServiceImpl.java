package com.example.aouth2.service.impl;

import com.example.aouth2.entity.UserEntity;
import com.example.aouth2.repo.UserRepo;
import com.example.aouth2.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service("userService")
public class UserServiceImpl implements UserService, UserDetailsService {

   // @Autowired
    private UserRepo userRepo;

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User findOne(long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        System.out.println(s);

//        UserEntity userEntity=userRepo.findOneByUsername(s);
//
//        System.out.println(userEntity);
        return null;
    }
}
