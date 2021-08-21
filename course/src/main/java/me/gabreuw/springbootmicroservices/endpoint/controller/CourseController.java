package me.gabreuw.springbootmicroservices.endpoint.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import me.gabreuw.core.model.Course;
import me.gabreuw.springbootmicroservices.endpoint.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/v1/admin/courses")
@Log4j2
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseController {

    private final CourseService courseService;

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Course>> findAll(Pageable pageable) {
        Iterable<Course> courses = courseService.findAll(pageable);

        return ResponseEntity
                .ok()
                .body(courses);
    }

}
