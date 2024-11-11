package com.example.dev_porfolio.models;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Objects;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Field is required")
    @Size(min = 3, max = 100, message = "Must be between 3 and 100 characters")
    private String name;

    public int getId() {
        return id;
    }

    public @NotBlank(message = "Field is required") @Size(min = 3, max = 100, message = "Must be between 3 and 100 characters") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Field is required") @Size(min = 3, max = 100, message = "Must be between 3 and 100 characters") String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity that = (AbstractEntity) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return name;
    }
}
