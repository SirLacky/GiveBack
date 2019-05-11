package com.github.sirlacky.GiveBack.domain.repositories;

import com.github.sirlacky.GiveBack.domain.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {

    Role findByName(String name);


}
