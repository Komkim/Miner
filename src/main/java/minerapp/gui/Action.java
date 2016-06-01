package main.java.minerapp.gui;


import javafx.event.EventHandler;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import main.java.minerapp.classes.UserLogic;
import main.java.minerapp.interfaces.implField.Field;

//класс для возможных событий
public class Action {
    UserLogic userLogic;

    public Action(UserLogic userLogic)
    {
        this.userLogic = userLogic;
    }

    public void mouseClicked(Field field) {
        SingltonGroup.giveGroup().setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int x = ((int) event.getX() / 20 - 1);
                int y = ((int) event.getY() / 20 - 1);

                if(event.getButton() ==  MouseButton.SECONDARY)
                {
                    userLogic.rightClickMouse(x,y);
                }
                if(event.getButton() == MouseButton.PRIMARY) {
                    userLogic.openCell(x,y);
                }
                field.redraw();
            }
        });
    }
}
