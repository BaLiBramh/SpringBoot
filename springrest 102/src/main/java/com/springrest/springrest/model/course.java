package com.springrest.springrest.model;


import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class course {

    private @Id Long  id;
    private String title;
    private String description;

    @Override
    public String toString() {
        return "course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }



    public course(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public course() {
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



}
