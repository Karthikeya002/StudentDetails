package com.example.StudentDetails.StudentDetails.Repository;

import com.example.StudentDetails.StudentDetails.Demo.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentDetails,Long> {
}
