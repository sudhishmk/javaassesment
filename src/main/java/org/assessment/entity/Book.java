package org.assessment.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

// TODO: Task 1 - Add appropriate Jakarta Persistence annotations
public class Book extends PanacheEntity {
    public String title;
    public String author;
    public Double price;
}
