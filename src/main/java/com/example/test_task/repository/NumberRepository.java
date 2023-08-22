package com.example.test_task.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.test_task.model.NumberEntity;

public interface NumberRepository extends CrudRepository<NumberEntity, Long> {
}
