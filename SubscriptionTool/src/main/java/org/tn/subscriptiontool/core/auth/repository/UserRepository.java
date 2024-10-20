package org.tn.subscriptiontool.core.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tn.subscriptiontool.core.auth.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByemail(String email);
}
