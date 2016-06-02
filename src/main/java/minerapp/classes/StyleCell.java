package main.java.minerapp.classes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

//Стили для клетки
public class StyleCell {
    GraphicsContext gc;

    public void crearCell(int x, int y)
    {
        gc.clearRect(20 + 20*x, 20 + 20*y, 20, 20);
    }

    public StyleCell(GraphicsContext gc)
    {
        this.gc = gc;
    }
    public void openCell(int x, int y)
    {
        gc.setFill(Color.BLACK);
        gc.strokeRoundRect(20 + 20*x, 20 + 20*y, 20, 20, 10, 10);
    }
    public void mine(int x ,int y)
    {
        gc.fillOval(25 + 20*x, 25 + 20*y, 10, 10);
    }

    public void text(int x, int y, int number)
    {
        gc.fillText(String.valueOf(number),26.75 + 20*x, 33.5 + 20*y);
    }

    public void thinkMine(int x, int y)
    {
        gc.setFill(Color.BLACK);
        gc.fillRoundRect(20 + 20*x, 20 + 20*y, 20, 20, 20, 20);
    }
    public void unknownCell(int x, int y)
    {
        gc.setFill(Color.SALMON);
        gc.fillRoundRect(20 + 20*x, 20 + 20*y, 20, 20, 20, 20);
    }
    public void defoultCell(int x, int y)
    {
        gc.setFill(Color.CHOCOLATE);
        gc.fillRoundRect(20 + 20*x, 20 + 20*y, 20, 20, 10, 10);
    }
}
