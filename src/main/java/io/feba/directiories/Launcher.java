package io.feba.directiories;

import io.feba.directiories.menus.DirectoryMenu;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public final class Launcher extends Application {

    @Override
    public void start(Stage stage) {
        DirectoryMenu mainMenu = new DirectoryMenu(stage);
        stage.setTitle("Directories");
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(mainMenu.getScene());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}