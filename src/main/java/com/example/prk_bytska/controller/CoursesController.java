package com.example.prk_bytska.controller;

import com.example.prk_bytska.entity.Courses;
import com.example.prk_bytska.service.CoursesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class CoursesController {
    private final CoursesService coursesService;

    @GetMapping("/courses")
    public Flux<Courses> getAllCourses() {
        return coursesService.findAll();
    }
}
