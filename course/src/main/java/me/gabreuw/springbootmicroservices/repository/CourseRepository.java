package me.gabreuw.springbootmicroservices.repository;

import me.gabreuw.springbootmicroservices.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {}