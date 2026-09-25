module ni.edu.uam.facturacionapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;

    exports ni.edu.uam.facturacionapp.application;
    exports ni.edu.uam.facturacionapp.model;
    opens ni.edu.uam.facturacionapp.controller to javafx.fxml;
    opens ni.edu.uam.facturacionapp.model to javafx.base;
}