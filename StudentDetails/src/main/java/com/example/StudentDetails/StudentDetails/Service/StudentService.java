package com.example.StudentDetails.StudentDetails.Service;

import com.example.StudentDetails.StudentDetails.Demo.StudentDetails;
import com.example.StudentDetails.StudentDetails.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;


    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }
    public List<StudentDetails> getAllStudents() {
        return repo.findAll();
    }

    public StudentDetails getStudentById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public StudentDetails createStudent(StudentDetails studentDetails) {
        return repo.save(studentDetails);
    }

    public void deleteStudentById(Long id) {
        repo.deleteById(id);
    }

}
