module io.feba.directiories {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.feba.directiories to javafx.fxml;
    exports io.feba.directiories;
}