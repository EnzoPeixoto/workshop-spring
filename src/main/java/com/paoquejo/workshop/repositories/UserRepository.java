package com.paoquejo.workshop.repositories;

import com.paoquejo.workshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
