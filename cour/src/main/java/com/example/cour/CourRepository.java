package com.example.cour;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourRepository extends JpaRepository<Cour, Integer> {
    List<Cour> findAllByStudentId(Integer studentId);
}
