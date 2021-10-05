package com.example.storeprofileservice.service;

import com.example.storeprofileservice.model.Profile;
import com.example.storeprofileservice.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;


    public Optional<Profile> getProfile(Long id) {



        return  profileRepository.findById(id);
    }
}
