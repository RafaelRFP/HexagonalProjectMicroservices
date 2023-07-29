package com.hexagonal.tasks.domain.ports.output;

import com.hexagonal.tasks.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepositoryPort {
    //Registramos el CRUD
    Task save(Task task);
    Optional<Task> findbyId(Long id);
    List<Task> findAll();
    Optional<Task> update(Task task);
    boolean deleteById(Long id);
}
