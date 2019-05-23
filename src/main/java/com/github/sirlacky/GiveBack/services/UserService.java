package com.github.sirlacky.GiveBack.services;

import com.github.sirlacky.GiveBack.domain.model.User;
import com.github.sirlacky.GiveBack.domain.repositories.UserRepository;
import com.github.sirlacky.GiveBack.dtos.EditUserFormDTO;
import com.github.sirlacky.GiveBack.dtos.RegistrationFormDTO;
import com.github.sirlacky.GiveBack.dtos.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

import static com.github.sirlacky.GiveBack.services.Converters.*;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }


    @Transactional
    public void registerUser(RegistrationFormDTO form) {
        User user = convertToUser(form);
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        logger.info("Rejestracja uzytkownika: " + user);
        userRepository.save(user);

        logger.info("Zarejestrowano uzytkownika: " + user);
    }

    @Transactional
    public void editUser(EditUserFormDTO form) {
        User user = convertToEditedUser(form);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        logger.info("Edycja użytkownika zakończona powodzeniem: "+user.getUsername());
    }

    public UserDTO findUser(String username) {
        if (username == null) {
            throw new IllegalArgumentException("Nazwa użytkownika musi być podana");
        }
        Optional<User> optionalUser = userRepository.findByUsername(username);
        User user = optionalUser.orElse(null);
        logger.debug("Znaleziono uzytkownika dla nazwy " + username + " " + user);
        if (user == null) {
            return null;
        }
        logger.debug("Nie znaleziono uzytkownika dla nazwy " + username + " " + user);
        return convertToUserDTO(user);
    }


}