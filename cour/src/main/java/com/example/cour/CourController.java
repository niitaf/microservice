package com.example.cour;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class CourController {

    private final CourService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody Cour cour
    ) {
        service.saveStudent(cour);
    }

    @GetMapping
    public ResponseEntity<List<Cour>> findAllStudents() {
        return ResponseEntity.ok(service.findAllStudents());
    }

    @GetMapping("/cour/{cour-id}")
    public ResponseEntity<List<Cour>> findAllStudents(
            @PathVariable("cour-id") Integer schoolId
    ) {
        return ResponseEntity.ok(service.findAllStudentsBySchool(schoolId));
    }
}
