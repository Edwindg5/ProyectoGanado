module org.example.proyectoganado {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;

    opens org.example.proyectoganado to javafx.fxml;
    exports org.example.proyectoganado;
    exports org.example.proyectoganado.controller;
    opens org.example.proyectoganado.controller to javafx.fxml;
}