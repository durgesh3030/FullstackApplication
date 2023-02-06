package com.durgesh.fullstackapplication.Services;

import com.durgesh.fullstackapplication.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
