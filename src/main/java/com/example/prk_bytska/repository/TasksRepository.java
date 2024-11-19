package com.example.prk_bytska.repository;

import com.example.prk_bytska.entity.Tasks;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TasksRepository extends ReactiveCrudRepository<Tasks, Long> {
}
