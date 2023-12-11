package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student
        extends Person
        implements Evaluation {
    private double average;

    private final List<Course> courses = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student(String id, String name, String email, Date birthDate) {
        super(id, name, email, birthDate);
    }

    public void enrollToCourse(Course course) {
        // TODO implement this method
        courses.add(course);
    }

    public void registerApprovedCourse(Course course) {
        approvedCourses.put(course.getCode(), course);
    }

    public boolean isCourseApproved(String courseCode) {
        // TODO implement this method
        // return false;
        return approvedCourses.containsKey(courseCode);
    }

    // CHALLENGE IMPLEMENTATION: Read README.md to find instructions on how to
    // solve.
    public List<Course> findPassedCourses(Course course) {
        // TODO implement this method
        return null;
    }

    public boolean isAttendingCourse(String courseCode) {
        // TODO implement this method
        for (Course course : courses) {
            if (course.getCode().equals(courseCode)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double getAverage() {
        return average;
    }

    @Override
    public List<Course> getApprovedCourses() {
        // TODO implement this method
        // return null;
        return new ArrayList<>(approvedCourses.values());

    }

    @Override
    public String toString() {
        return "Student {" + super.toString() + "}";
    }
}
