module com.jmc.mazebank.mazebank {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web; // Keep other requires as needed

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.jmc.mazebank.controllers to javafx.fxml;
    opens com.jmc.mazebank to javafx.graphics;
    exports com.jmc.mazebank;
}