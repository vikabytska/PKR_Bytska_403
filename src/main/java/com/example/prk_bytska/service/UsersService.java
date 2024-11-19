package com.example.prk_bytska.service;

import com.example.prk_bytska.entity.Users;
import com.example.prk_bytska.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UsersService {
     private final UsersRepository usersRepository;

     public Flux<Users> findAll() {
         return usersRepository.findAll();
     }

     public Mono<Users> findById(Long id) {
         return usersRepository.findById(id);
     }

     public Mono<Users> save(Users users) {
         return usersRepository.save(users);
     }

     public Mono<Void> deleteById(Long id) {
         return usersRepository.deleteById(id);
     }

    public Mono<Users> update(Users users) {
         return usersRepository.save(users);
    }

}
