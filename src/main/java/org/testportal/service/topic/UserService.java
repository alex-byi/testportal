package org.testportal.service.topic;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.testportal.entity.User;

import java.util.Optional;

public interface UserService extends UserDetailsService {

    Optional<User> findById(Long id);

    User save(User user);

    Iterable<User> findAll();
}
