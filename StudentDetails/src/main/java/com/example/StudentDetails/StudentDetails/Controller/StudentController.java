package com.example.StudentDetails.StudentDetails.Controller;

import com.example.StudentDetails.StudentDetails.Demo.StudentDetails;
import com.example.StudentDetails.StudentDetails.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    // Constructor injection (preferred over field injection)
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public List<StudentDetails> getAllStudents() {
        return studentService.getAllStudents(); // Fixed method call
    }
    @GetMapping("/{id}")
    public StudentDetails getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/add")
    public StudentDetails addStudent(@RequestBody StudentDetails student) {
        return studentService.createStudent(student);
    }
    @DeleteMapping("/{id}")
    public String deleteStudentById(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return "Student with ID " + id + " deleted successfully.";
    }

}