package com.example.hackathonjavafx2023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Course {
    private String courseName;
    private double extraCredit;
    private boolean didExtra= false;
    /*
    User's goal grade
     */
    private double goalGrade;
    /*
    User's grade right now. Should be 0 but can ask GradeCalc.getCurrentGrades to calculate the currentGrade.
     */
    private double currentGrade;
    private HashSet<Task> exams;
    private HashSet<Task> quizzes;
    private HashSet<Task> assignments;
    private HashSet<Task> projects;
   /*
    hardcoded for HASHMAP. EXAM/QUIZ/ASSIGNMENT/PROJECTS = VALUE

    EX) Key: "Exam1", Value: 20 ------> means Exam1 contributes 20% of the course grade.
        Key: "Quiz",  Value: 10 ------> All the quizzes for the entire course should contribute 10% of the course grade.
    */
   private HashMap<String, Double> weight;

    /**
     *
     * @param name: courseName
     * @param extraCredit: case when extraCredit exists
     * @param goalGrade: your goal Grade
     */
    Course(String name, double extraCredit, double goalGrade) {
        courseName = name;
        exams = new HashSet<>();
        quizzes = new HashSet<>();
        assignments = new HashSet<>();
        projects = new HashSet<>();
        weight = new HashMap<>();
        this.extraCredit = extraCredit;
        this.goalGrade = goalGrade;
    }
    /**
     *
     * @param name: courseName
     * @param goalGrade: your goal Grade
     */
    Course(String name, double goalGrade) {
        courseName = name;
        exams = new HashSet<>();
        quizzes = new HashSet<>();
        assignments = new HashSet<>();
        projects = new HashSet<>();
        weight = new HashMap<>();
        this.extraCredit = 0;
        this.goalGrade = goalGrade;
    }

    public void setCurrentGrade() {
/*
HashSet<Task> exams, HashSet<Task> quizzes,HashSet<Task> assignments,
                                  HashSet<Task> projects, HashMap<String, Double> weight, double extraCredit
 */
        currentGrade = GradeCalc.getCurrentGrades(exams, quizzes,assignments, projects, weight, extraCredit);
       if(didExtra) {
           currentGrade += extraCredit;
       }
    }

    public boolean isDidExtra() {
        return didExtra;
    }

    public void setDidExtra(boolean didExtra) {
        this.didExtra = didExtra;
    }

    public double getCurrentGrade() {
        return currentGrade;
    }

    public double getExtraCredit() {
        return extraCredit;
    }
    public void setExtraCredit(double extraCredit) {
        this.extraCredit = extraCredit;
    }

    public void addExam(Task task) {
        exams.add(task);
    }
    public void addQuiz(Task task) {
        quizzes.add(task);
    }
    public void addAssignment(Task task) {
        assignments.add(task);
    }
    public void addProjects(Task task) {
        projects.add(task);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getGoalGrade() {
        return goalGrade;
    }

    public void setGoalGrade(double goalGrade) {
        this.goalGrade = goalGrade;
    }

    public void setCurrentGrade(double currentGrade) {
        this.currentGrade = currentGrade;
    }

    public HashSet<Task> getExams() {
        return exams;
    }

    public HashSet<Task> getQuizzes() {
        return quizzes;
    }

    public HashSet<Task> getAssignments() {
        return assignments;
    }

    public HashSet<Task> getProjects() {
        return projects;
    }

    public String stringExams() {
        Iterator<Task> iter = exams.iterator();

        String output = "";
        while(iter.hasNext()) {
            Task t = iter.next();
            //String name, double minScore, double maxScore, double currScore, Date deadline
            output = output + ("Name: " + t.getProjName() + ", " + "MinScore: " + t.getMinScore() + ", " +
                    "MaxScore: " + t.getMaxScore() + ", " + "CurrScore: " + t.getCurrScore() + ", " +
                    "DeadLine: "+ t.getDeadline())+ "\n" ;
        }
        return output ;
    }

    public void setExams(HashSet<Task> exams) {
        this.exams = exams;
    }

    public String stringQuizzes() {

        Iterator<Task> iter = quizzes.iterator();

        String output = "";
        while(iter.hasNext()) {
            Task t = iter.next();
            //String name, double minScore, double maxScore, double currScore, Date deadline
            output = output + ("Name: " + t.getProjName() + ", " + "MinScore: " + t.getMinScore() + ", " +
                    "MaxScore: " + t.getMaxScore() + ", " + "CurrScore: " + t.getCurrScore() + ", " +
                    "DeadLine: "+ t.getDeadline())+ "\n";
        }
        return output;
    }

    public void setQuizzes(HashSet<Task> quizzes) {
        this.quizzes = quizzes;
    }

    public String stringAssignments() {

        Iterator<Task> iter = assignments.iterator();

        String output = "";
        while(iter.hasNext()) {
            Task t = iter.next();
            //String name, double minScore, double maxScore, double currScore, Date deadline
            output = output + ("Name: " + t.getProjName() + ", " + "MinScore: " + t.getMinScore() + ", " +
                    "MaxScore: " + t.getMaxScore() + ", " + "CurrScore: " + t.getCurrScore() + ", " +
                "DeadLine: "+ t.getDeadline())+ "\n" ;
        }
        return output ;
    }

    public String stringProjects() {
        Iterator<Task> iter = projects.iterator();

        String output = "";
        while(iter.hasNext()) {
            Task t = iter.next();
            //String name, double minScore, double maxScore, double currScore, Date deadline
            output = output + ("Name: " + t.getProjName() + ", " + "MinScore: " + t.getMinScore() + ", " +
                    "MaxScore: " + t.getMaxScore() + ", " + "CurrScore: " + t.getCurrScore() + ", " +
                    "DeadLine: "+ t.getDeadline()) + "\n";
        }
        return output;
    }

    public void setProjects(HashSet<Task> projects) {
        this.projects = projects;
    }

    public void setAssignments(HashSet<Task> assignments) {
        this.assignments = assignments;
    }

    public HashMap<String, Double> getWeight() {
        return weight;
    }

    public void addWeight(String topic, double weigh) {
        // add your topic and how much it weigh
        // EX) topic: "Quiz" weigh: 5       -----> All the quizzes added up will contribute 5% of your total grade
        weight.put(topic,weigh);
    }
    public void setWeight(HashMap<String, Double> weight) {
        this.weight = weight;
    }


}
