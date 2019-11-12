package com.gregpaterek.todolist;

import com.gregpaterek.todolist.datamodel.TodoData;
import com.gregpaterek.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {

    @FXML
    private TextField shortDescriptionField;

    @FXML
    private TextArea detailsArea;

    @FXML
    private DatePicker deadlinePicker;

    public TodoItem processResults() {
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadLineValue = deadlinePicker.getValue();

        TodoItem newItem = new TodoItem(shortDescription, details, deadLineValue);
        TodoData.getInstance().addTodoItem(new TodoItem(shortDescription, details, deadLineValue));
        return newItem;
    }
}
