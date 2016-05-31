package main.java.minerapp.gui;


import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

//класс для возможных событий
public class Action {

    public void mouseClicked(Node root, Label apply) {
        root.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                apply.setText(event.getX() + " " + event.getY());
            }
        });
    }
}
