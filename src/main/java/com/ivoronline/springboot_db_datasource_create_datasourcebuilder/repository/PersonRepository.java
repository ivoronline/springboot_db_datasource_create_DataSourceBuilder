package com.ivoronline.springboot_db_datasource_create_datasourcebuilder.repository;

import com.ivoronline.springboot_db_datasource_create_datasourcebuilder.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> { }
