package com.isil.proyectoisil.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.isil.proyectoisil.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    public interface UserRepository extends CrudRepository<User, Long>{
        public optional<User>findByUsername(String username);
    }

}
