package me.gabreuw.springbootmicroservices.endpoint.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import me.gabreuw.core.model.Course;
import me.gabreuw.core.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {

    private final CourseRepository courseRepository;

    public Iterable<Course> findAll(Pageable pageable) {
        log.info("Listing all courses");

        return courseRepository.findAll(pageable);
    }

}
