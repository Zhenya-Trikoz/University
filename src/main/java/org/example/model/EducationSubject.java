package org.example.model;

import java.util.UUID;

public class EducationSubject {
    private UUID ID;
    private String name;
    private int hour;
    private Teacher teacher;
    private int rating;

    public EducationSubject(String name, int hour, Teacher teacher, int rating) {
        this.ID = UUID.randomUUID();
        this.name = name;
        this.hour = hour;
        this.teacher = teacher;
        this.rating = rating;
    }

    public UUID getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Предмет {" +
                "ID=" + getID() +
                ", Назва = " + getName() +
                ", Годин на предмет = " + getHour() +
                ", Вчитель = " + getTeacher() +
                ", Оцінка = " + getRating() +
                '}';
    }
}

