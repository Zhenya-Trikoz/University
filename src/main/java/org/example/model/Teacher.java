package org.example.model;

import java.util.ArrayList;
import java.util.Calendar;

public class Teacher extends Employee {
    private String degree;
    private ArrayList<EducationSubject> listEducationSubjects;

    public Teacher(String firstName, String secondName, Calendar dateBirth, int age, String email, int phone, University university, String position, int experience, int salary, String degree, ArrayList<EducationSubject> listEducationSubjects) {
        super(firstName, secondName, dateBirth, age, email, phone, university, position, experience, salary);
        this.degree = degree;
        this.listEducationSubjects = listEducationSubjects;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public ArrayList<EducationSubject> getListEducationSubjects() {
        return listEducationSubjects;
    }

    public void setListEducationSubjects(ArrayList<EducationSubject> listEducationSubjects) {
        this.listEducationSubjects = listEducationSubjects;
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
                ", Науковий ступінь = " + getDegree() +
                ", Список предметів = " + getListEducationSubjects() +
                '}';
    }
}
