package io.feba.directiories;

import io.feba.directiories.menus.DirectoryMenu;
import javafx.application.Application;
import javafx.stage.Stage;

public final class Launcher extends Application {
    @Override
    public void start(Stage stage) {
        DirectoryMenu mainMenu = new DirectoryMenu();
        stage.setTitle("Directories");
        stage.setScene(mainMenu.getScene());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}