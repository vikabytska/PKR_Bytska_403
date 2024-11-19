package com.example.prk_bytska.service;


import com.example.prk_bytska.entity.Students;
import com.example.prk_bytska.repository.StudentsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StudentsService {

    private final StudentsRepository studentsRepository;

    public Flux<Students> findAll() {
        return studentsRepository.findAll();
    }

    public Mono<Students> save(Students students) {
        return studentsRepository.save(students);
    }

    public Mono<Void> deleteStudentById(long id) {
        return studentsRepository.deleteById(id);
    }

    public Mono<Students> update(Students students) {
        return studentsRepository.save(students);
    }

}
