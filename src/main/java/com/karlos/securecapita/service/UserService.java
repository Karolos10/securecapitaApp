package com.karlos.securecapita.service;

import com.karlos.securecapita.domain.User;
import com.karlos.securecapita.dto.UserDTO;

public interface UserService {
    UserDTO createUser(User user);
}
