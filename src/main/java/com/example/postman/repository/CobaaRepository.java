package com.example.postman.repository;

import com.example.postman.model.entity.Cobaa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CobaaRepository extends JpaRepository<Cobaa, String> {
}