package com.durgesh.fullstackapplication.repository;

import com.durgesh.fullstackapplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
