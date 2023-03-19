package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "Location is required")
    @Size(min = 3, max=50, message = "location can be 3 to 50 characters long")
    private String location;

    public Employer(String location) {
        this.location = location;
    }

    public Employer(){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return this.getName() + location;
    }
}
