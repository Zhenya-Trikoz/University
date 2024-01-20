package org.example.model;

import java.util.Calendar;
import java.util.List;

public class Student extends People {
    private String group;
    private int course;
    private int semester;
    private List<EducationSubject> listEducationSubjectList;
    private String formOfEducation; // true = Денна форма навчання; false = Заочна форма навчання;
    private String educationDegree; // Освітній ступінь
    private String specialization; // Спеціалізація
    private boolean budget;

    public Student(String firstName, String secondName, Calendar dateBirth, int age, String email, int phone, University university, String group, int course, int semester, List<EducationSubject> listEducationSubjectList, String formOfEducation, String educationDegree, String specialization, boolean budget) {
        super(firstName, secondName, dateBirth, age, email, phone, university);
        this.group = group;
        this.course = course;
        this.semester = semester;
        this.listEducationSubjectList = listEducationSubjectList;
        this.formOfEducation = formOfEducation;
        this.educationDegree = educationDegree;
        this.specialization = specialization;
        this.budget = budget;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public List<EducationSubject> getListEducationSubjectList() {
        return listEducationSubjectList;
    }

    public void setListEducationSubjectList(List<EducationSubject> listEducationSubjectList) {
        this.listEducationSubjectList = listEducationSubjectList;
    }

    public String getFormOfEducation() {
        return formOfEducation;
    }

    public void setFormOfEducation(String formOfEducation) {
        this.formOfEducation = formOfEducation;
    }

    public String getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(String educationDegree) {
        this.educationDegree = educationDegree;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public boolean isBudget() {
        return budget;
    }

    public void setBudget(boolean budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Студент {" +
                "ID=" + getID() +
                ", Ім'я = " + getFirstName() +
                ", Прізвище = " + getSecondName() +
                ", Дата народження = " + getDateBirth().getTime() +
                ", Вік = " + getAge() +
                ", Email = " + getEmail() +
                ", телефон = " + getPhone() +
                ", Університет = " + getUniversity() +
                ", Група = " + getGroup() +
                ", Курс = " + getCourse() +
                ", Семестр = " + getSemester() +
                ", Списко предметів = " + getListEducationSubjectList() +
                ", Форма навчання = " + getFormOfEducation() +
                ", Освітній ступінь = " + getEducationDegree() +
                ", Спеціалізація = " + getSpecialization() +
                ", Бюджет = " + isBudget() +
                '}';
    }
}
