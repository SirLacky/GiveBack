package com.github.sirlacky.GiveBack.domain.repositories;

import com.github.sirlacky.GiveBack.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User>findByUsername(String username);

    User getByUsername(String username);

    @Query(value = "SELECT * FROM users JOIN user_role ON users.id=user_role.user_id WHERE role_id = 2;", nativeQuery = true)
    List<User> findAllAdmins();

    @Query(value = "SELECT * FROM users JOIN user_role ON users.id=user_role.user_id WHERE role_id = 1;", nativeQuery = true)
    List<User> findAllUsers();

    @Query(value ="INSERT INTO `give_back`.`user_role` (`user_id`) VALUES (?);" ,nativeQuery = true)
    User giveUserRole(Long id);
}
