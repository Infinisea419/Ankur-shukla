package com.baeldung.crud.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.baeldung.crud.entities.Student;


@Repository
public interface StudentRepositiory extends CrudRepository<Student, Long>{
	
	

}
