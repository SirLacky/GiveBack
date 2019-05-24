package com.github.sirlacky.GiveBack.domain.repositories;

import com.github.sirlacky.GiveBack.domain.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String name);
    Role findById(Long id);

}
