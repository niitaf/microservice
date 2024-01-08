package com.example.cour;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourService {

    private final CourRepository repository;

    public void saveStudent(Cour student) {
        repository.save(student);
    }

    public List<Cour> findAllStudents() {
        return repository.findAll();
    }

    public List<Cour> findAllStudentsBySchool(Integer studentId) {
        return repository.findAllByStudentId(studentId);
    }
}
