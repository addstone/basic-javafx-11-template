package com.mygame;

import com.jayfella.jme.jfx.JavaFxUI;
import com.jme3.app.SimpleApplication;
import javafx.scene.control.Button;

public class Main extends SimpleApplication {

    public static void main(String... args) {
        Main main = new Main();
        main.start();
    }

    @Override
    public void simpleInitApp() {

        flyCam.setDragToRotate(true);

        JavaFxUI.initialize(this);

        Button button = new Button("Click Me");
        JavaFxUI.getInstance().attachChild(button);

    }
}