package com.pie.trainingtask.customerapp.repository;

import com.pie.trainingtask.customerapp.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
    UserEntity findByUserName(String userName);
}
