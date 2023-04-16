package com.example.hackathonjavafx2023;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class LobbyController implements Initializable {

    @FXML
    Label nameLabel;
    @FXML
    Label currentDate;
    @FXML
    private TreeView treeView ;
    @FXML
    TextField gradeField;

    private Stage stage;
    private Scene scene;
    private Parent root;


    public void login(ActionEvent event) throws IOException {

        String username = gradeField.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("GradePane.fxml"));
        root = loader.load();
        LobbyController lobbyController = loader.getController();
        lobbyController.display("" + username);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void display(String username) {
        nameLabel.setText(username);
        currentDate.setText(new Date().toString());
    }
    public void NewMethod() {
        System.out.println("You selected the New Menu Item");
    }
    public void selectItem() {
        TreeItem<String> item = (TreeItem<String>) treeView.getSelectionModel().getSelectedItem();
        String subject = item.getValue();

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
        String submit = item.getValue();
        System.out.println(course.getCurrentGrade());
        System.out.println(item.getValue());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TreeItem<String> rootItem = new TreeItem<>("Courses");

        TreeItem<String> branchItem1 = new TreeItem<>("Math");
        TreeItem<String> branchItem2 = new TreeItem<>("English");
        TreeItem<String> branchItem3 = new TreeItem<>("Science");
        TreeItem<String> branchItem4 = new TreeItem<>("Music");
        rootItem.getChildren().addAll(branchItem1,branchItem2,branchItem3,branchItem4);

        treeView.setRoot(rootItem);

    }
}
