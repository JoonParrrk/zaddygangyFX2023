package com.example.hackathonjavafx2023;/*
 * Class is being implemented in Calendar. Here you want to have:
 * 1. Weekly Pattern
 *   - What classes you want to study for what day.
 *   - This will include the date to study for each classes
 *   - This data will be given to us by the User Class
 */

 /* Study Session
    Contains study sessions time with dates for each specific course
    Should contain a boolean value if isCompleted
  */

  public class StudySession {

    int time;
    int date;
    String course;
    boolean completed;
  
    public StudySession(int time, int date, String course, boolean completed) {
      this.time = time;
      this.date = date;
      this.course = course;
      this.completed = completed;
    }
  
    // Getter methods
    public int getTime() {
      return time;
    }
  
    public int getDate() {
      return date;
    }
  
    public String getCourse() {
      return course;
    }
  
    public boolean isCompleted() {
      return completed;
    }
  
    // Setter methods
    public void setTime(int time) {
      this.time = time;
    }
  
    public void setDate(int date) {
      this.date = date;
    }
  
    public void setCourse(String course) {
      this.course = course;
    }
  
    public void setCompleted(boolean completed) {
      this.completed = completed;
    }
  }
  
