package com.durgesh.fullstackapplication.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Role {



    @Id
    @GeneratedValue
    private  long id;

        private String name;

        @ManyToMany(mappedBy = "roles")
        private Set<User> users;

        public Long getId() {
            return id;
        }

    @PostLoad
    public void postLoad() {

    }

    public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }
}
