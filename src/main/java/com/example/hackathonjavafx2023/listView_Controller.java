package com.example.hackathonjavafx2023;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class listView_Controller implements Initializable{


    @FXML
    private ListView<String> myListView;
    @FXML
    private Label myLabel;


    String food[] = {"sushi","ramen","sweet potato fries"};

    String currentfood;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        myListView.getItems().addAll(food);

        myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

                currentfood = myListView.getSelectionModel().getSelectedItem();
                myLabel.setText(currentfood);
            }
        });
    }

}