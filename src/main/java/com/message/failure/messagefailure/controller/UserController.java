package com.message.failure.messagefailure.controller;

import com.message.failure.messagefailure.model.dto.user.UserCreateDTO;
import com.message.failure.messagefailure.model.dto.user.UserFullDTO;
import com.message.failure.messagefailure.model.dto.user.UserLargeDTO;
import com.message.failure.messagefailure.model.dto.user.UserUpdateDTO;
import com.message.failure.messagefailure.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping("users")
    public ResponseEntity<List<UserFullDTO>> getUsers(){
        return ResponseEntity.ok(service.getFullInfoUsers());
    }
    @GetMapping("user/operators")
    public ResponseEntity<List<UserFullDTO>> getOperators() {
        return ResponseEntity.ok(service.getFullInfoOperators());
    }

    public ResponseEntity<List<UserFullDTO>> getTeamLeaders(){
        return ResponseEntity.ok(service.getFullInfoTeamLeaders());
    }

    @PostMapping("user")
    public ResponseEntity<UserFullDTO> setUser(@RequestBody UserCreateDTO dto) {
        return ResponseEntity.ok(service.createUser(dto));
    }

    @PutMapping("user")
    public ResponseEntity<UserFullDTO> updateUser(@RequestBody UserUpdateDTO dto) {
        return ResponseEntity.ok(service.updateUser(dto));
    }
}