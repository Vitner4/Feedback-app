package com.example.feedback;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField Mail_Field;

    @FXML
    private Button Exit_Button;

    @FXML
    private TextField Message_Field;

    @FXML
    private TextField Name_Field;

    @FXML
    private Button Send_Button;

    @FXML
    void initialize() {

        Send_Button.setOnAction(event -> {
            System.out.println("User sending a Feedback!");
            //Объект класса FeedbackToTxt
            FeedbackToTxt fdbktotxt = new FeedbackToTxt();
            //Вызов метода записи Feedback пользователя в file
            fdbktotxt.WriteToTxt(Name_Field.getText(),Mail_Field.getText(), Message_Field.getText());
        });

        Exit_Button.setOnAction(event -> {
            System.exit(0);
        });
    }
}

