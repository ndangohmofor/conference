package com.pluralsight.conference.model;

import javax.validation.constraints.NotEmpty;

public class Registration {

    @NotEmpty(message = "Please enter a valid name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
