package com.example.storeprofileservice.controller;

import com.example.storeprofileservice.model.Profile;
import com.example.storeprofileservice.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;


    @GetMapping("/{userId}")
    public Optional<Profile> getProfile(@PathVariable("userId") Long id) {
        return profileService.getProfile(id);
    }


}
