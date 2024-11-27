package com.cersocode.demo_docker_render.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cersocode.demo_docker_render.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
