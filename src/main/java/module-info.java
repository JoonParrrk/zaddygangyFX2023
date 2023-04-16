module com.example.hackathonjavafx2023 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;
    requires java.desktop;


    opens com.example.hackathonjavafx2023 to javafx.fxml;
    exports com.example.hackathonjavafx2023;
}