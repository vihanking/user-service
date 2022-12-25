package com.adp.userservice.repository;

import com.adp.userservice.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,String> {

    @Query(value = "SELECT * FROM USERS WHERE FIRSTNAME=?1",nativeQuery = true)
    List<UserEntity> getUsersByFirstName(String firstName);
}
