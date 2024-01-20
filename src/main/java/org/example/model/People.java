package org.example.model;

import java.util.Calendar;
import java.util.UUID;

public class People {
    private UUID ID;
    private String firstName;
    private String secondName;
    private Calendar dateBirth;
    private int age;
    private String email;
    private int phone;
    private University university;

    public People(String firstName, String secondName, Calendar dateBirth, int age, String email, int phone, University university) {
        this.ID = UUID.randomUUID();
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateBirth = dateBirth;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.university = university;
    }

    public UUID getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Calendar getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Calendar dateBirth) {
        this.dateBirth = dateBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Людина {" +
                "ID=" + getID() +
                ", Ім'я = " + getFirstName() +
                ", Прізвище = " + getSecondName() +
                ", Дата народження = " + getDateBirth().getTime() +
                ", Вік = " + getAge() +
                ", Email = " + getEmail() +
                ", телефон = " + getPhone() +
                ", Університет = " + getUniversity() +
                '}';
    }
}
