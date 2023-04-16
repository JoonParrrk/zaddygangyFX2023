package com.example.hackathonjavafx2023;

import java.util.Date;

public class Task {
    private String projName;
    private double minScore;
    private double maxScore;
    private double currScore;
    private Date deadline;

    /**
     *
     * @param name: name of the assignment: Ex) Quiz3 or Homework2.
     * @param minScore: Mininum score you can get.
     * @param maxScore: Maximum score you can get.
     * @param currScore: CurrentScore right now. If your score hasn't been set up, set to -1.
     * @param deadline: DeadLine date
     */
    Task(String name, double minScore, double maxScore, double currScore, Date deadline) {
        this.projName = name;
        this.minScore = minScore;
        this.maxScore = maxScore;
        this.currScore = currScore;
        this.deadline = deadline;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public double getMinScore() {
        return minScore;
    }

    public void setMinScore(double minScore) {
        this.minScore = minScore;
    }

    public double getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(double maxScore) {
        this.maxScore = maxScore;
    }

    public double getCurrScore() {
        return currScore;
    }

    public void setCurrScore(double currScore) {
        this.currScore = currScore;
    }
}
