package com.hexagonal.tasks.infrastructure.entities;

import com.hexagonal.tasks.domain.models.Task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private LocalDateTime creationDate;
    private LocalDateTime modificationDate;
    private boolean completed;

    public TaskEntity() {
    }

    public TaskEntity(Long id, String title, String description, LocalDateTime creationDate, LocalDateTime modificationDate, boolean completed) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
        this.completed = completed;
    }

    public static TaskEntity fromDomainModel(Task task) {
        return new TaskEntity(task.getId(),
                                task.getTitle(),
                                task.getDescription(),
                                task.getCreationDate(),
                                task.getModificationDate(),
                                task.getCompleted());
    }

    public Task toDomainModel() {
        return new Task(id, title, description, creationDate, modificationDate, completed);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getModificationDate() {
        return modificationDate=LocalDateTime.now();
    }

    public void setModificationDate(LocalDateTime modificationDate) {
        this.modificationDate = modificationDate;
    }
}
