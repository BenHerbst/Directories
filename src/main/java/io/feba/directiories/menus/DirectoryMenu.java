package io.feba.directiories.menus;

import io.feba.directiories.bars.TopBar;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public final class DirectoryMenu extends AnchorPane {

    public DirectoryMenu(Stage stage) {
        new Scene(this, 1200, 700);
        this.setStyle("-fx-background-color: #2B2F33FF;");
        TopBar topBar = new TopBar(this, stage);
        this.getChildren().add(topBar);
    }

}
