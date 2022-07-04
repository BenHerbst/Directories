package io.feba.directiories.bars;

import io.feba.directiories.menus.DirectoryMenu;
import javafx.scene.effect.Glow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public final class TopBar extends HBox {

    private double mouseX;
    private double mouseY;

    public TopBar(DirectoryMenu menu, Stage stage) {
        this.setStyle("-fx-background-color: #2f3338;");
        this.setPrefHeight(50);
        this.prefWidthProperty().bind(menu.widthProperty());
        Glow effect = new Glow(0.2f);
        ImageView close = new ImageView("icons/close.png");
        close.setFitHeight(30);
        close.setFitWidth(30);
        close.translateXProperty().bind(menu.widthProperty().subtract(100));
        close.setTranslateY(10);
        close.setOnMouseEntered(event -> close.setEffect(effect));
        close.setOnMouseExited(event -> close.setEffect(null));
        close.setOnMousePressed(event -> System.exit(0));
        ImageView minimalize = new ImageView("icons/minimalize.png");
        minimalize.setFitHeight(30);
        minimalize.setFitWidth(30);
        minimalize.translateXProperty().bind(menu.widthProperty().subtract(100));
        minimalize.setTranslateY(10);
        minimalize.setOnMouseEntered(event -> minimalize.setEffect(effect));
        minimalize.setOnMouseExited(event -> minimalize.setEffect(null));
        minimalize.setOnMousePressed(event -> stage.setIconified(true));
        this.setSpacing(20);
        this.getChildren().addAll(minimalize, close);
        this.setOnMousePressed(event -> {
            this.mouseX = event.getSceneX();
            this.mouseY = event.getSceneY();
        });
        this.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() - this.mouseX);
            stage.setY(event.getScreenY() - this.mouseY);
        });
    }
}
