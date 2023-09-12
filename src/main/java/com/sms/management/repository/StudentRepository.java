package com.sms.management.repository;
import com.sms.management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long> {

    Optional<Student> findStudentByEmail(String email);
    Optional<List<Student>> findStudentsByAssignedCourses_courseId(Long courseId);

}
