package com.example.prk_bytska.repository;


import com.example.prk_bytska.entity.Marks;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface MarksRepository extends ReactiveCrudRepository<Marks, Long> {
    Flux<Marks> findByStudentId(Long studentId);
    Flux<Marks> findByTaskId(Long taskId);
}
