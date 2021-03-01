package com.karson.twitterclone.repository;

import com.karson.twitterclone.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  User findByUsername(String username);
}