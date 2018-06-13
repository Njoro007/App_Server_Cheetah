package com.hackathon.cheetah.appserver.controllers;

import com.hackathon.cheetah.appserver.models.entities.Credentials;
import com.hackathon.cheetah.appserver.models.entities.User;
import com.hackathon.cheetah.appserver.models.repositories.CredentialRepository;
import com.hackathon.cheetah.appserver.models.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    public UserRepository userRepository;

    @Autowired
    CredentialRepository credentialRepository;

    @RequestMapping(method = RequestMethod.GET, value = "")
    public ResponseEntity<List<User>> users(){
        return ResponseEntity.ok((List<User>) userRepository.findAll());
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<User> createUser(@RequestBody User user){

        Credentials cred = credentialRepository.save(user.getCredentials());
        user.setCredentials(cred);
         user=userRepository.save(user);
         return ResponseEntity.ok(user);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResponseEntity deleteUser(@PathVariable Long id){
        userRepository.deleteById(id);
        return  ResponseEntity.ok("deleted");
    }
}
