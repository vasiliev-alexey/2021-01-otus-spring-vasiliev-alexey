package com.av.services.impl;

import com.av.dao.UserRepository;
import com.av.dao.UserService;
import com.av.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

@Service("userService")
public class UserServiceImpl implements UserService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public List<User> findAll() {
        return newArrayList(userRepository.findAll());
    }

    @Override
    public User findByName(String userName) {
        logger.info(String.format("find user by name%s", userName));
        return userRepository.findByName(userName);
    }
}
