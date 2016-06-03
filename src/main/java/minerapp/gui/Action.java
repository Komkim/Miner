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

    public void mouseClicked(Field field) {
        SingltonGroup.giveGroup().setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double mouseCoordX = (event.getX() - Miner.INDENT_LEFT) / Miner.SIZE_CELL;
                double mouseCoordY = (event.getY() - Miner.INDENT_TOP) / Miner.SIZE_CELL;

                if (!(mouseCoordX < 0 || mouseCoordY < 0 || (int) mouseCoordX >= Miner.SIZE_CANVAS_X || (int) mouseCoordY >= Miner.SIZE_CANVAS_Y)) {
                    if (event.getButton() == MouseButton.SECONDARY) {
                        userLogic.rightClickMouse((int) mouseCoordX, (int) mouseCoordY);
                        userLogic.openDistrict((int) mouseCoordX, (int) mouseCoordY);
                    }
                    if (event.getButton() == MouseButton.PRIMARY) {
                        userLogic.openCell((int) mouseCoordX, (int) mouseCoordY);
                    }
                }
                field.youWin();
                field.redraw();

            }
        });
    }
    //начинает новую игры по нажатию кнопки
    public void newGame(Node node, GraphicsContext gc) {
        node.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                gc.clearRect(0, 0, Miner.WIDTH, Miner.HEIGHT);
                new Miner().Start(Miner.SIZE_CANVAS_X, Miner.SIZE_CANVAS_Y, Miner.NUMBER_MINE);
            }
        });
    }
}
