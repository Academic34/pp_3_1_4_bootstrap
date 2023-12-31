package ru.kata.spring.boot_security.demo.repositories;

import ru.kata.spring.boot_security.demo.entity.Role;

import java.util.Set;

public interface RoleRepository {

    Set<Role> getAllRole();

    Role getRoleById(long id);

    Role getRoleByName(String name);
}
