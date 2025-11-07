package com.ud5.validadorfx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import net.synedra.validatorfx.Validator;
import java.time.LocalDate;

public class ValidadorController {

    @FXML private TextField nombreField;
    @FXML private TextField dniField;
    @FXML private DatePicker fechaNacimientoPicker;
    @FXML private TextField direccionField;
    @FXML private ComboBox<String> generoCombo;
    @FXML private TextField correoField;
    @FXML private TextField tarjetaField;
    @FXML private TextField isbnField;
    @FXML private TextField ibanField;
    @FXML private Label resultadoLabel;
    @FXML private Button validarButton;

    private final Validator validator = new Validator();

    @FXML
    public void initialize() {
        generoCombo.getItems().addAll("Hombre", "Mujer", "Otro");

        // Reglas de validación con ValidatorFX
        validator.createCheck()
                .dependsOn("nombre", nombreField.textProperty())
                .withMethod(c -> {
                    if (c.get("nombre").toString().trim().isEmpty())
                        c.error("El nombre es obligatorio");
                })
                .decorates(nombreField);

        validator.createCheck()
                .dependsOn("fecha", fechaNacimientoPicker.valueProperty())
                .withMethod(c -> {
                    LocalDate fecha = c.get("fecha");
                    if (fecha == null)
                        c.error("Fecha obligatoria");
                })
                .decorates(fechaNacimientoPicker);

        validator.createCheck()
                .dependsOn("dni", dniField.textProperty())
                .withMethod(c -> {
                    String dni = c.get("dni");
                    if (!dni.matches("\\d{8}[A-HJ-NP-TV-Z]"))
                        c.error("DNI no válido");
                })
                .decorates(dniField);

        validator.createCheck()
                .dependsOn("correo", correoField.textProperty())
                .withMethod(c -> {
                    String correo = c.get("correo");
                    if (!correo.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$"))
                        c.error("Correo inválido");
                })
                .decorates(correoField);

        validator.createCheck()
                .dependsOn("tarjeta", tarjetaField.textProperty())
                .withMethod(c -> {
                    String tarjeta = c.get("tarjeta");
                    if (!tarjeta.isEmpty() && !tarjeta.matches("\\d{16}"))
                        c.error("Tarjeta inválida (16 dígitos)");
                })
                .decorates(tarjetaField);

        validator.createCheck()
                .dependsOn("isbn", isbnField.textProperty())
                .withMethod(c -> {
                    String isbn = c.get("isbn");
                    if (!isbn.isEmpty() && !isbn.matches("\\d{10}|\\d{13}"))
                        c.error("ISBN debe tener 10 o 13 dígitos");
                })
                .decorates(isbnField);

        validator.createCheck()
                .dependsOn("iban", ibanField.textProperty())
                .withMethod(c -> {
                    String iban = c.get("iban");
                    if (!iban.isEmpty() && !iban.matches("[A-Z]{2}\\d{22}"))
                        c.error("IBAN inválido (formato ES..)");
                })
                .decorates(ibanField);
    }

    @FXML
    private void validarFormulario() {
        if (validator.validate()) {
            resultadoLabel.setStyle("-fx-text-fill: green;");
            resultadoLabel.setText("Todos los datos son correctos. Formulario enviado.");
        } else {
            resultadoLabel.setStyle("-fx-text-fill: red;");
            resultadoLabel.setText("Existen errores. Revisa los campos marcados.");
        }
    }
}
