package com.cybertek.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface SecurityService extends UserDetailsService {

    //Ctrl+O to override the Method
    @Override
    UserDetails loadUserByUsername(String s) throws UsernameNotFoundException;
}
