package com.hexagonal.tasks.domain.models;

import java.time.LocalDateTime;

public class Task {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime creationDate;
    private LocalDateTime modificationDate;
    private Boolean completed;

    public Task(Long id, String title, String description, LocalDateTime creationDate, LocalDateTime modificationDate, Boolean completed) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
        this.completed = completed;
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
        this.creationDate=creationDate;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(LocalDateTime modificationDate) {
        this.modificationDate = modificationDate;
    }
}
