package org.tn.subscriptiontool.core.auth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.tn.subscriptiontool.core.auth.repository.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;

}
