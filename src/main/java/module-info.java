module com.ud5.validadorfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires net.synedra.validatorfx;

    opens com.ud5.validadorfx to javafx.fxml;
    exports com.ud5.validadorfx;
    exports com.ud5.validadorfx.controller;
    opens com.ud5.validadorfx.controller to javafx.fxml;
}