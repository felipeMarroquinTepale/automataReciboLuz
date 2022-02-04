module com.aplication.automatareciboluz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.aplication.automatareciboluz to javafx.fxml;
    exports com.aplication.automatareciboluz;
}