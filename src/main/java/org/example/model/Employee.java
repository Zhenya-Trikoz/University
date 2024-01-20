package org.example.model;

import java.util.Calendar;

public class Employee extends People {

    private String position;
    private int experience;
    private int salary;

    public Employee(String firstName, String secondName, Calendar dateBirth, int age, String email, int phone, University university, String position, int experience, int salary) {
        super(firstName, secondName, dateBirth, age, email, phone, university);
        this.position = position;
        this.experience = experience;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Працівник {" +
                "ID=" + getID() +
                ", Ім'я = " + getFirstName() +
                ", Прізвище = " + getSecondName() +
                ", Дата народження = " + getDateBirth().getTime() +
                ", Вік = " + getAge() +
                ", Email = " + getEmail() +
                ", телефон = " + getPhone() +
                ", Університет = " + getUniversity() +
                ", Посада = " + getPosition() +
                ", Стаж = " + getExperience() +
                ", Зарплата = " + getSalary() +
                '}';
    }
}
