package com.example.hackathonjavafx2023;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class GradeCalc {
    private double goalGrade;
    private double currentGrade;
    private double projectedGrade;

    // starts with 100 but deduct -1 tasks from the total.
    private static double idealGrade;
    // starts with 0 and add up the user's actual grades.
    private static double gradeAdded;

    private HashMap<String, Double> weight;

    public static double getCurrentGrades(HashSet<Task> exams, HashSet<Task> quizzes, HashSet<Task> assignments,
                                          HashSet<Task> projects, HashMap<String, Double> weight, double extraCredit) {

        idealGrade = 100;
        gradeAdded = 0;

        gradeIterCalculation("exam", exams, weight);
        gradeIterCalculation("quiz",quizzes, weight);
        gradeIterCalculation("assignment",assignments, weight);
        gradeIterCalculation("project",projects, weight);

        System.out.println(idealGrade+ " IDEAL");

        System.out.println(gradeAdded+ " REAL");

        return 100*(gradeAdded/idealGrade);
    }

    public static void gradeIterCalculation(String topic, HashSet<Task> tasks, HashMap<String, Double> weight) {

        Iterator<Task> iter = tasks.iterator();

        while(iter.hasNext()) {
            Task t = iter.next();
            // how many exams you have during the semester
            int howMany = tasks.size();
            // particular weigh will be 1/howMany. Ex): tParticular = (exam1/ 3 exams total) * weight
            double particularWeigh = (1.0 / howMany) * weight.get(topic);

            // if -1, deduct from idealGrade and move on
            if(t.getCurrScore() == -1) {
//                System.out.println();
                idealGrade -= particularWeigh;
            }
            // else if you have done this task,
            else {
                double gradeConversion = (t.getCurrScore()/t.getMaxScore())* 100;
                gradeAdded += particularWeigh * gradeConversion / 100;
                System.out.println(particularWeigh * gradeConversion / 100 + " ADDED " + t.getProjName());
            }
        }
    }
}
