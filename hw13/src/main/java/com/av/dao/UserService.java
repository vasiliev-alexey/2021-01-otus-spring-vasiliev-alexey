package com.av.dao;

import com.av.domain.User;

public interface UserService extends GenericDomainCrud<Long, User> {
    User findByName(String userName);
}
