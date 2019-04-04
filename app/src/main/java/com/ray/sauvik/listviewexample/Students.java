package com.ray.sauvik.listviewexample;

public class Students {

    private String Name;
    private int    StudentId;
    private String Major;

    public Students(String name, int studentId, String major) {
        Name = name;
        StudentId = studentId;
        Major = major;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }
}
