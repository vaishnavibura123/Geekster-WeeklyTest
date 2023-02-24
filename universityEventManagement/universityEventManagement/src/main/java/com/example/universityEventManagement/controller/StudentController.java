package com.example.universityEventManagement.controller;

import com.example.universityEventManagement.model.Student;
import com.example.universityEventManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/findAll")
    public List<Student> findAll(){
        return studentService.findAll();
    }
    @GetMapping("/findStudent/studentId/{studentId}")
    public Student findById(@PathVariable int studentId){
        return studentService.findById(studentId);
    }
    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    @DeleteMapping("/deleteStudent/studentId/{studentId}")
    public void deleteStudent(@PathVariable int studentId){
        studentService.deleteStudent(studentId);
    }
    @PutMapping("/updateStudent/Id/{studentId}")
    public void updateStudent(@PathVariable int studentId, @RequestBody Student student){
        studentService.updateStudent(studentId,student);
    }


}
