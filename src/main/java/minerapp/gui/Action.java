package main.java.minerapp.gui;


import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import main.java.minerapp.classes.Miner;
import main.java.minerapp.classes.UserLogic;
import main.java.minerapp.interfaces.implField.Field;

//класс для возможных событий
public class Action {
    private UserLogic userLogic;

    public Action(UserLogic userLogic) {
        this.userLogic = userLogic;
    }

    public void mouseClicked(Field field, int x, int y) {
        SingltonGroup.giveGroup().setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double mouseCoordX = (event.getX() - Miner.INDENT_LEFT)/Miner.SIZE_CELL;
                double mouseCoordY = (event.getY() - Miner.INDENT_TOP)/Miner.SIZE_CELL;

                if(!(mouseCoordX < 0 || mouseCoordY < 0 || (int)mouseCoordX >= x || (int)mouseCoordY >= y)) {

                    if (event.getButton() == MouseButton.SECONDARY) {
                        userLogic.rightClickMouse((int)mouseCoordX, (int)mouseCoordY);
                    }
                    if (event.getButton() == MouseButton.PRIMARY) {
                        userLogic.openCell((int)mouseCoordX, (int)mouseCoordY);
                    }
                    field.redraw();
                }

            }
        });
    }

    public void newGame(Node node, int x, int y, int mine,GraphicsContext gc)
    {
        node.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                gc.clearRect(0,0,Miner.WIDTH, Miner.HEIGHT);
                new Miner().Start(x,y,mine);
            }
        });
    }
}
