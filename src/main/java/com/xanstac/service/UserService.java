package com.xanstac.service;

import com.xanstac.domain.User;

public interface UserService {
    User save(User user);
    User findByEmail(String email);
}
