package com.works.services;

import com.works.entities.User;
import com.works.repositories.UserRepository;
import com.works.utils.ERest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class UserService {
final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
     public ResponseEntity save(User user) {
         Map<ERest,Object> hm=new LinkedHashMap<>();
         hm.put(ERest.result,userRepository.save(user));
         hm.put(ERest.status,true);
         return new ResponseEntity(hm, HttpStatus.OK);
    }

     public ResponseEntity login(User user) {
         Map<ERest,Object> hm=new LinkedHashMap<>();
         return new ResponseEntity(hm, HttpStatus.OK);
    }

     public ResponseEntity register(User user) {
         Map<ERest,Object> hm=new LinkedHashMap<>();
         return new ResponseEntity(hm, HttpStatus.OK);
    }

      public ResponseEntity search(String q) {
          Map<ERest,Object> hm=new LinkedHashMap<>();
          return new ResponseEntity(hm, HttpStatus.OK);
    }
}
