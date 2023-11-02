package com.company;

import entities.Student;
import service.StudentService;
import view.Menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Student> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.display(scanner, students);
    }
}
