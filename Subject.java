package com.company;

public class Subject {

    private String subjectName;
    private int time;

    public Subject (String subjectName, int time) {
        this.subjectName = subjectName;
        this.time = time;
    }
    public static Subject subject1 = new Subject("Математика", 78);

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void printAboutObject() {
        System.out.println("Название предмета: " + subjectName);
        System.out.println("Количество часов: " + time);
        System.out.println();
    }



}
