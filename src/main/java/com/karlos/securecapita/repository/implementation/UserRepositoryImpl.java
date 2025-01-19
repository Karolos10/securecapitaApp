package com.karlos.securecapita.repository.implementation;

import com.karlos.securecapita.domain.User;
import com.karlos.securecapita.repository.UserRepository;

import java.util.Collection;
import java.util.List;

public class UserRepositoryImpl implements UserRepository<User> {
    @Override
    public User create(User data) {
        return null;
    }

    @Override
    public Collection<User> List(int page, int pageSize) {
        return List.of();
    }

    @Override
    public User get(Long id) {
        return null;
    }

    @Override
    public User update(User data) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
}
