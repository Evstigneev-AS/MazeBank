package com.jmc.mazebank.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class LoginController {

    @FXML
    private ChoiceBox<?> acc_selector;

    @FXML
    private Button login_bin;

    @FXML
    private TextField payee_address_fld;

    @FXML
    private Label payee_address_lbl;

    @FXML
    private TextField password_fld;

    @FXML
    private Label error_lbl;

    @FXML
    private AnchorPane root; // Add this if you need to access the root pane

    @FXML
    public void initialize() {
        // Initialization code goes here.  This runs *after*
        // all @FXML members have been injected.
        error_lbl.setText("Hello!"); // Example
    }
}