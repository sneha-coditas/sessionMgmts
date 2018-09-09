package com.sessions.sample.sessionSample.services;

import com.sessions.sample.sessionSample.model.AppUser;
import com.sessions.sample.sessionSample.repository.AppUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
public class UserServiceImpl implements UserDetailsService {
    public Logger logger= LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private AppUserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username){
        AppUser user=userRepository.findAppUserByUserName(username);
        logger.info("username is:{}",username);
        logger.info("user is:{}",user);

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
            grantedAuthorities.add(new SimpleGrantedAuthority("admin"));


        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getEncrytedPassword(), grantedAuthorities);

    }
}
