/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.waa.onlinehotelreservationsystemwaa.service.Impl;

/**
 *
 * @author seidabdu
 */
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.User;
import edu.mum.waa.onlinehotelreservationsystemwaa.repository.UserRepository;
import edu.mum.waa.onlinehotelreservationsystemwaa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl
implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public boolean authenticate(User user) {
        User userWithMatchingId = this.userRepository.getByUserId(user.getUserId());
        if (userWithMatchingId != null) {
            return userWithMatchingId.getPassword().equals(user.getPassword());
        }
        return false;
    }
}