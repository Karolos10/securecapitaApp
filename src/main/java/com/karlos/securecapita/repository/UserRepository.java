package com.karlos.securecapita.repository;

import com.karlos.securecapita.domain.User;

import java.util.Collection;

public interface UserRepository <T extends User>{
    /*Basic CRUD operations*/
    T create(T data);
    Collection<T> List(int page, int pageSize);
    T get(Long id);
    T update(T data);
    Boolean delete(Long id);

    /* More Complex Operations */
}
