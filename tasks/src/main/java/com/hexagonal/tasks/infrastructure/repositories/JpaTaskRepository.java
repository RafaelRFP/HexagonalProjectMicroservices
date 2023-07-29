package com.hexagonal.tasks.infrastructure.repositories;

import com.hexagonal.tasks.infrastructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long> {
}
