package com.example.praktikum6.gui;

import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import com.example.praktikum6.data.Item;
import com.example.praktikum6.actions.MahasiswaActions;
import com.example.praktikum6.users.User;

public class MahasiswaDashboard extends Pane {
    public MahasiswaDashboard(User user) {
        setMinWidth(600);
        setMinHeight(400);

        Label titleLabel = new Label("Lost & Found Kampus");
        titleLabel.setLayoutX(20);
        titleLabel.setLayoutY(20);

        Label subtitleLabel = new Label("Lapor barang hilang/temu");
        subtitleLabel.setLayoutX(20);
        subtitleLabel.setLayoutY(50);

        Label itemLabel = new Label("Dompet");
        itemLabel.setLayoutX(20);
        itemLabel.setLayoutY(80);

        ComboBox<String> typeComboBox = new ComboBox<>();
        typeComboBox.getItems().addAll("Pria", "Wanita");
        typeComboBox.setValue("Pria");
        typeComboBox.setLayoutX(150);
        typeComboBox.setLayoutY(80);

        Label locationLabel = new Label("Meja A-01");
        locationLabel.setLayoutX(300);
        locationLabel.setLayoutY(80);

        Button reportButton = new Button("Laporkan");
        reportButton.setLayoutX(450);
        reportButton.setLayoutY(80);
        reportButton.setOnAction(e -> {
            MahasiswaActions actions = new MahasiswaActions();
            actions.reportLostItem(itemLabel.getText(), typeComboBox.getValue(), locationLabel.getText());
            refreshTable();
        });

        TableView<Item> table = new TableView<>();
        table.setLayoutX(20);
        table.setLayoutY(120);
        table.setPrefWidth(560);
        table.setPrefHeight(260);

        TableColumn<Item, String> itemColumn = new TableColumn<>("Nama");
        itemColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        itemColumn.setPrefWidth(150);

        TableColumn<Item, String> typeColumn = new TableColumn<>("Jenis Kelamin");
        typeColumn.setCellValueFactory(cellData -> cellData.getValue().typeProperty());
        typeColumn.setPrefWidth(150);

        TableColumn<Item, String> locationColumn = new TableColumn<>("Lokasi");
        locationColumn.setCellValueFactory(cellData -> cellData.getValue().locationProperty());
        locationColumn.setPrefWidth(150);

        TableColumn<Item, String> statusColumn = new TableColumn<>("Status");
        statusColumn.setCellValueFactory(cellData -> cellData.getValue().statusProperty());
        statusColumn.setPrefWidth(100);

        table.getColumns().addAll(itemColumn, typeColumn, locationColumn, statusColumn);
        table.getItems().add(new Item("Dompet", "Pria", "Meja A-01", "Reported"));

        getChildren().addAll(titleLabel, subtitleLabel, itemLabel, typeComboBox, locationLabel, reportButton, table);
    }

    private void refreshTable() {
        TableView<Item> table = (TableView<Item>) getChildren().stream()
                .filter(node -> node instanceof TableView)
                .findFirst().orElse(null);
        if (table != null) {
            table.getItems().clear();
            table.getItems().addAll(com.example.praktikum6.data.DataStore.getItems());
        }
    }
}