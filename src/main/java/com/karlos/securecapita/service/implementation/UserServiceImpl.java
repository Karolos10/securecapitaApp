package com.karlos.securecapita.service.implementation;

import com.karlos.securecapita.domain.User;
import com.karlos.securecapita.dto.UserDTO;
import com.karlos.securecapita.dtomapper.UserDTOMapper;
import com.karlos.securecapita.repository.UserRepository;
import com.karlos.securecapita.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository<User> userRepository;

    public UserServiceImpl(UserRepository<User> userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO createUser(User user) {
        return UserDTOMapper.fromUser(userRepository.create(user));
    }
}
