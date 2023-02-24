package com.example.universityEventManagement.service;

import com.example.universityEventManagement.model.Student;
import com.example.universityEventManagement.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    IStudentRepo iStudentRepo;
    public List<Student> findAll() {
        return iStudentRepo.findAll();
    }

    public Student findById(int studentId) {
        return iStudentRepo.findById(studentId).get();
    }

    public void addStudent(Student student) {
        iStudentRepo.save(student);
    }

    public void deleteStudent(int studentId) {
        iStudentRepo.deleteById(studentId);
    }

    public void updateStudent(int studentId, Student student) {
        Student st=iStudentRepo.findById(studentId).get();
        st.setFirstName(student.getFirstName());
        st.setLastName(student.getLastName());
        st.setAge(student.getAge());
        st.setDepartment(student.getDepartment());

        iStudentRepo.save(st);
    }
}
