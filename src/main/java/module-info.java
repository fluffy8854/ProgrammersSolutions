module com.example.psolutions {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.psolutions to javafx.fxml;
    exports com.example.psolutions;
}