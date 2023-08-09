/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codsoftgrp.codsoftproject3;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private List<StudentInfo> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(StudentInfo student) {
        students.add(student);
    }

    public void removeStudent(StudentInfo student) {
        students.remove(student);
    }

    public StudentInfo searchStudent(int rollNumber) {
        for (StudentInfo student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public List<StudentInfo> getAllStudents() {
        return students;
    }
}
