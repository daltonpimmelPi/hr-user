package com.system.hruser.repository;

import com.system.hruser.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposotory extends JpaRepository<User, Long> {

    //assinatura do metodo entrepertado como uma consulta sql
    User findByEmail(String email);

}
