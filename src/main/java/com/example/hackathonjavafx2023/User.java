package com.example.hackathonjavafx2023;

import java.util.ArrayList;
import java.util.List;

public class User {
    private ArrayList<Course> courses;
    private List<StudySession> StudyTimes;
    private int streak;
    private String firstName;
    private String lastName;

    public User(int streak, String firstName, String lastName) {
        StudyTimes = new ArrayList<StudySession>();
        courses = new ArrayList<Course>();
        this.streak = streak;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void addStudySession(StudySession session) {
        StudyTimes.add(session);
    }

    public List<StudySession> getStudyTime() {
        return StudyTimes;
    }

    public void addCourses(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

