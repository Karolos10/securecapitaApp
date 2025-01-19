package com.karlos.securecapita.repository.implementation;

import com.karlos.securecapita.domain.Role;
import com.karlos.securecapita.exception.ApiException;
import com.karlos.securecapita.repository.RoleRepository;
import com.karlos.securecapita.rownmapper.RoleRowMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static com.karlos.securecapita.enumeration.RoleType.ROLE_USER;
import static java.util.Map.of;
import static java.util.Objects.*;

@Repository
@RequiredArgsConstructor
@Slf4j
public class RoleRepositoryImpl implements RoleRepository<Role> {

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryImpl.class);
    private static final String SELECT_ROLE_BY_NAME_QUERY = "";
    private static final String INSERT_USER_TO_USER_QUERY = "";
    private final NamedParameterJdbcTemplate jdbc;

    public RoleRepositoryImpl(NamedParameterJdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public Role create(Role data) {
        return null;
    }

    @Override
    public Collection<Role> List(int page, int pageSize) {
        return List.of();
    }

    @Override
    public Role get(Long id) {
        return null;
    }

    @Override
    public Role update(Role data) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    @Override
    public void addRoleToUser(Long userId, String roleName) {
        log.info("Adding role {} to user id: {}", roleName, userId);

        try {

            Role role = jdbc.queryForObject(SELECT_ROLE_BY_NAME_QUERY, of("roleName", roleName), new RoleRowMapper());
            jdbc.update(INSERT_USER_TO_USER_QUERY, of("userId", userId, "roleId", requireNonNull(role).getId()));

        } catch (EmptyResultDataAccessException exception){
            throw new ApiException("No role found by name" + ROLE_USER.name());

        } catch (Exception exception){
            throw new ApiException("An error occurred. Please try again later");

        }

    }

    @Override
    public Role getRoleByUserId(Long userId) {
        return null;
    }

    @Override
    public Role getRoleByUserEmail(String email) {
        return null;
    }

    @Override
    public void updateUserRole(Long userId, String roleName) {

    }
}
