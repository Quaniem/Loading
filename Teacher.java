package com.company;

public class Teacher {
    private String name;
    private String position;
    private String surname;
    private String academicDegree;
    private int experience;


    public Teacher (String name, String surname, String position, String academicDegree, int experience) {
        this.name = name;
        this.surname = surname;
        this.academicDegree = academicDegree;
        this.experience = experience;
        this.position = position;
    }
    public static Teacher teacher1 = new Teacher("Александр", "Сергеевич", "Преподаватель", "Не имеется", 6);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public void printAboutObject() {
        System.out.println("Данные о преподавателе: ");
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Должность: " + position);
        System.out.println("Стаж: " + experience);
        System.out.println("Ученая степень: " + academicDegree);

        System.out.println();
    }
}
