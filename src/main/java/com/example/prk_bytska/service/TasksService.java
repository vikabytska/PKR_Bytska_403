package com.example.prk_bytska.service;


import com.example.prk_bytska.entity.Tasks;
import com.example.prk_bytska.repository.TasksRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class TasksService {
    private final TasksRepository tasksRepository;

    public Flux<Tasks> findAll() {
        return tasksRepository.findAll();
    }

    public Mono<Tasks> save(Tasks task) {
        return tasksRepository.save(task);
    }

    public Mono<Void> deleteTaskById(long id) {
        return tasksRepository.deleteById(id);
    }

    public Mono<Tasks> update(Tasks task) {
        return tasksRepository.save(task);
    }

    public Mono<Tasks> findById(long id) {
        return tasksRepository.findById(id);
    }


}
