/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int202.SWprocess.service;

import int202.SWProcess.model.Users;
import int202.SWprocess.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kittisak
 */
@Service
public class UserService {

    @Autowired
    private UsersRepository userRepo;

    public Users save(Users users) {
        return userRepo.save(users);

    }

    public Users getById(long userId) {
        return userRepo.findByUserId(userId);
    }

    public Users getByName(String name) {
        return userRepo.findByName(name);
    }

}
