module fx.sample {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;
    requires java.sql;
    requires java.desktop;
    requires mysql.connector.j;
    requires itextpdf;

    opens fx.sample to javafx.fxml;
    exports fx.sample;
}