package com.praktikum.users;

import com.praktikum.actions.StudentActions;
import java.util.Scanner;

public class Student extends User {
    private String name;
    private String nim;

    public Student(String name, String nim) {
        super("Mahasiswa");
        this.name = name;
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public void showMenu(Scanner scanner) {
        StudentActions.menu(this, scanner);
    }
}