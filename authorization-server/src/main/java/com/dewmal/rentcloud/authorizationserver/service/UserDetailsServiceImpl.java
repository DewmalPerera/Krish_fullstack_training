package com.dewmal.rentcloud.authorizationserver.service;

import com.dewmal.rentcloud.authorizationserver.model.AuthUserDetails;
import com.dewmal.rentcloud.authorizationserver.model.User;
import com.dewmal.rentcloud.authorizationserver.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserDetailsRepository userDetailsRepository;
    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Optional<User> optionalUser = userDetailsRepository.findByUserName(name);
        optionalUser.orElseThrow(()->new UsernameNotFoundException("UserName passsword wronf"));
        UserDetails userDetails =  new AuthUserDetails(optionalUser.get());
        new AccountStatusUserDetailsChecker().check(userDetails);
        return userDetails;
    }
}
