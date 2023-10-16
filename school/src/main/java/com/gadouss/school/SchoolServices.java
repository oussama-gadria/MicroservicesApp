package com.gadouss.school;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolServices {
    private final SchoolRepository repository;

    public void saveSchool(School school){
        repository.save(school);
    }

    public List<School> findAllSchool(){
        return repository.findAll();
    }
}
