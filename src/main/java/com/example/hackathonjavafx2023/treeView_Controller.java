package com.example.hackathonjavafx2023;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class treeView_Controller implements Initializable{

	
	//FAILED
	
	
	@FXML
	private TreeView<String> myTreeView;
		
	public void selectItem()  {
		
		TreeItem<String> rootItem = new TreeItem<>("Files");
		
		TreeItem<String> branchItem1 = new TreeItem<>("Pictures");
		TreeItem<String> branchItem2 = new TreeItem<>("Videos");
		TreeItem<String> branchItem3 = new TreeItem<>("Music");

		
		TreeItem<String> leafItem1 = new TreeItem<>("Picture1");
		TreeItem<String> leafItem2 = new TreeItem<>("Picture2");
		TreeItem<String> leafItem3 = new TreeItem<>("Picture3");
		
//		branchItem1.getChildren().addAll(leafItem1, leafItem2, leafItem3);
		
		rootItem.getChildren().addAll(branchItem1, branchItem2, branchItem3);
		
		myTreeView.setRoot(rootItem);
		
	
	
	
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		TreeItem<String> item = myTreeView.getSelectionModel().getSelectedItem();
		
		if(item!= null) {
			System.out.println(item.getValue());
		}
	}
}


























