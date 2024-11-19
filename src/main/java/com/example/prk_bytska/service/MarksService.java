package com.example.prk_bytska.service;


import com.example.prk_bytska.entity.Marks;
import com.example.prk_bytska.repository.MarksRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class MarksService {
    private final MarksRepository marksRepository;

    public Flux<Marks> findAll() {
        return marksRepository.findAll();
    }

    public Mono<Marks> findById(Long id) {
        return marksRepository.findById(id);
    }

    public Mono<Marks> save(Marks mark) {
        return marksRepository.save(mark);
    }

    public Mono<Void> deleteById(Long id) {
        return marksRepository.deleteById(id);
    }

    public Mono<Marks> update(Marks mark) {
        return marksRepository.save(mark);
    }

}
