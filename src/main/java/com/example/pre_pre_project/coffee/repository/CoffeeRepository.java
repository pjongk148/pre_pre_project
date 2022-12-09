package com.example.pre_pre_project.coffee.repository;

import com.example.pre_pre_project.coffee.entity.Coffee;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CoffeeRepository extends CrudRepository<Coffee, Long> {
    Optional<Coffee> findByCoffeeCode(String coffeeCode);

    @Query("SELECT * FROM COFFEE WHERE COFFEE_ID = :coffeeId")
    Optional<Coffee> findByCoffee(Long coffeeId);
}
