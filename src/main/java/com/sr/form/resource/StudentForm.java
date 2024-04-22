package com.sr.form.resource;

import java.util.List;
import java.util.Optional;

import com.sr.form.model.StudentModel;
import com.sr.form.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentForm {
	
	@Autowired
	private StudentRepository repository;

	@PostMapping(value = "/addstudent")
	public String saveStudent(@RequestBody StudentModel student) {
		repository.save(student);
		return "Added student with id"+student.getSid();
	}
	
	@GetMapping(value = "/sinfo")
	public List<StudentModel> getSinfo(){
		return repository.findAll();
		
	}
	
	@GetMapping(value = "/sibyid")
	public Optional<StudentModel> getStudent(@PathVariable int id){
		return repository.findById(id);
	}
	
	@GetMapping(value = "/s")
	public String test(){
		return "hello";
	}
	
	@DeleteMapping(value = "/deletesid")
	public String deleteSrecord(@PathVariable int id) {
		repository.deleteById(id);
		return "Delete record by sid :"+id;
		
	}
	
}
