package com.example.prk_bytska.repository;

import com.example.prk_bytska.entity.Students;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface StudentsRepository extends ReactiveCrudRepository<Students, Long> {
}
