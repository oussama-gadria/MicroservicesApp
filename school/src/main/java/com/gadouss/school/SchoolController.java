package com.gadouss.school;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/school")
@RequiredArgsConstructor
public class SchoolController {
    private SchoolServices service;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody School student){
        service.saveSchool((student));
    }
    @GetMapping
    public ResponseEntity<List<School>> findAllSchool(){
        return ResponseEntity.ok(service.findAllSchool());
    }
}
