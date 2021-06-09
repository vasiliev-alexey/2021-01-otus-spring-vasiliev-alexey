package com.av.services;

import com.av.dao.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LibraryUserDetailsService implements UserDetailsService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final UserService userService;

    public LibraryUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        logger.info("call  userservise with " + username);

        var  user = userService.findByName(username);


        if (user == null) {
            throw  new UsernameNotFoundException(String.format("user %s not found", username));
        }

        var roles = user.getRoles().stream().map(r -> r.getName()).toArray(String[]::new);

       var userDetail =
                User.withUsername(username)
                        .password(user.getPassword())
                        .roles(roles)
                        .build();

        return userDetail;
    }
}
