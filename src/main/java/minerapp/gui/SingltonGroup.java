package main.java.minerapp.gui;

import javafx.scene.Group;

//Синглтон чтобы добавлять элементы гуя из классов
public class SingltonGroup {
    private static Group group = null;

    private SingltonGroup() {
    }

    public static Group giveGroup() {
        if (group == null) group = new Group();
        return group;
    }
}
