package com.example.university.repo;

import com.example.university.domain.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;


public interface DepartmentRepository extends MongoRepository<Department, String> {

    Optional<Department> findByName(String name);

    @Query("{ 'name' : { $regex: ?0 } }")
    List<Department> findNameByPattern(String pattern);

    //This method fails because cannot perform Joins across DBRef's
    List<Department> findByChairMemberLastName(String lastName);

}
