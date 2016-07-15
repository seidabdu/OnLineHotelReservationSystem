/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.waa.onlinehotelreservationsystemwaa.repository.Impl;

/**
 *
 * @author seidabdu
 */
import edu.mum.waa.onlinehotelreservationsystemwaa.domain.User;
import edu.mum.waa.onlinehotelreservationsystemwaa.repository.UserRepository;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryUserRepository
implements UserRepository {
    Map<String, User> users = new HashMap<String, User>();

    public InMemoryUserRepository() {
        User seid = new User("seid", "seid");
        this.users.put(seid.getUserId(), seid);
    }

    public User getByUserId(String userId) {
        return this.users.get(userId);
    }
}