package com.example.praktikum6.gui;

import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import com.example.praktikum6.data.Item;
import java.util.List;

public class AdminDashboard extends Pane {
    public AdminDashboard() {
        setMinWidth(600);
        setMinHeight(400);

        Label titleLabel = new Label("Lost & Found Kampus");
        titleLabel.setLayoutX(20);
        titleLabel.setLayoutY(20);

        Label subtitleLabel = new Label("Daftar Laporan Anda");
        subtitleLabel.setLayoutX(20);
        subtitleLabel.setLayoutY(50);

        TableView<Item> table = new TableView<>();
        table.setLayoutX(20);
        table.setLayoutY(80);
        table.setPrefWidth(560);
        table.setPrefHeight(300);

        TableColumn<Item, String> locationColumn = new TableColumn<>("Lokasi");
        locationColumn.setCellValueFactory(cellData -> cellData.getValue().locationProperty());
        locationColumn.setPrefWidth(100);

        TableColumn<Item, String> statusColumn = new TableColumn<>("Status");
        statusColumn.setCellValueFactory(cellData -> cellData.getValue().statusProperty());
        statusColumn.setPrefWidth(100);

        TableColumn<Item, String> ownerColumn = new TableColumn<>("Data Mahasiswa");
        ownerColumn.setCellValueFactory(cellData -> cellData.getValue().ownerProperty());
        ownerColumn.setPrefWidth(180);

        TableColumn<Item, String> nimColumn = new TableColumn<>("NIM");
        nimColumn.setCellValueFactory(cellData -> cellData.getValue().nimProperty());
        nimColumn.setPrefWidth(180);

        table.getColumns().addAll(locationColumn, statusColumn, ownerColumn, nimColumn);
        List<Item> items = com.example.praktikum6.data.DataStore.getItems();
        table.getItems().addAll(items);

        getChildren().addAll(titleLabel, subtitleLabel, table);
    }
}