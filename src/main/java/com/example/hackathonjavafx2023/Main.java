package com.example.hackathonjavafx2023;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main extends Application { //package com.example.hackathonjavafx2023;

    @Override
    public void start(Stage stage) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Course course = new Course("Math", 80);
        course.addAssignment(new Task("assignment",  0,  100,  65, new Date()));

        course.addExam(new Task("exam",  0,  100,  95, new Date()));

        course.addQuiz(new Task("quiz",  0,  5,  5, new Date()));
        course.addQuiz(new Task("quiz",  0,  5,  5, new Date()));
        course.addQuiz(new Task("quiz",  0,  5,  -1, new Date()));
        course.addQuiz(new Task("quiz",  0,  5,  -1, new Date()));

        course.addProjects(new Task("project",  0,  200,  185, new Date()));

        course.addWeight("assignment", 30);
        course.addWeight("exam", 35);
        course.addWeight("quiz", 10);
        course.addWeight("project", 25);

        //exams, quizzes, assignments, projects, weight, extraCredit
        course.setCurrentGrade();
        System.out.println(course.getCurrentGrade());

        launch();

    }
}

//        System.out.println(course.getWeight());
//        System.out.println();
//        System.out.println(course.stringExams());
//        System.out.println();
//        System.out.println(course.stringAssignments());
//        System.out.println();
//        System.out.println(course.stringQuizzes());
//        System.out.println();
//        System.out.println(course.stringProjects());