package com.beingbachelor.springbatchexample.repository;

import com.beingbachelor.springbatchexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
