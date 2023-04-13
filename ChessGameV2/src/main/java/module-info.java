module me.chessproject.chessgamev2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires com.almasb.fxgl.all;

    opens me.chessproject.chessgamev2 to javafx.fxml;
    exports me.chessproject.chessgamev2;
}