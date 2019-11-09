package com.gregpaterek.todolist;

import com.gregpaterek.todolist.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<TodoItem> todoItems;

    @FXML
    private ListView todoListView;

    public void initialized() {
        TodoItem item1 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for John",
                LocalDate.of(2019, Month.NOVEMBER, 24));
        TodoItem item2 = new TodoItem("Doctors Appointment", "See Dr. Smith at 123 Main Str.",
                LocalDate.of(2020, Month.NOVEMBER, 23));
        TodoItem item3 = new TodoItem("Finished design proposal for client", "I promised Mike I'd email website",
                LocalDate.of(2019, Month.OCTOBER, 2));
        TodoItem item4 = new TodoItem("Pickup Doug at the train station", "Arriving on Nov. 8 at 9 AM",
                LocalDate.of(2019, Month.NOVEMBER, 8));
        TodoItem item5 = new TodoItem("Picking up dry cleaning", "downtown Ustron",
                LocalDate.of(2019, Month.NOVEMBER, 10));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }
}
