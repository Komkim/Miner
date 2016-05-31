package main.java.minerapp.gui;


import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import main.java.minerapp.interfaces.ICell;
import main.java.minerapp.interfaces.implField.Field;

//класс для возможных событий
public class Action {

    public void mouseClicked(Node root, Label apply, ICell[][] arrCell, Field field) {
        root.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(event.getButton() == MouseButton.PRIMARY) arrCell[((int)event.getY()/20 - 1)][((int)event.getX()/20 - 1)].openCell();
                apply.setText(((int)event.getX()/20 - 1) + " " + ((int)event.getY()/20 - 1));
                field.redraw();
            }
        });
    }
}
