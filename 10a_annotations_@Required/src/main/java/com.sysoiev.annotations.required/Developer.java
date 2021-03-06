package com.sysoiev.annotations.required;

import org.springframework.beans.factory.annotation.Required;

public class Developer {
    private String name;
    private int experience;
    private String specialty;

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    @Required
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Required
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
