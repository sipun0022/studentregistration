package com.sr.form.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sr.form.model.StudentModel;

@Repository
public interface StudentRepository extends MongoRepository<StudentModel, Integer>{

} 
