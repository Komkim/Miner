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
                int x = ((int) event.getX() / 20 - 1);
                int y = ((int) event.getY() / 20 - 1);

                if(event.getButton() ==  MouseButton.SECONDARY)
                {

                }
                if(event.getButton() == MouseButton.PRIMARY) {
                    field.checkZeroCell(x,y);
                }
                apply.setText(y + " " + x);
                field.redraw();


            }
        });
    }
}
