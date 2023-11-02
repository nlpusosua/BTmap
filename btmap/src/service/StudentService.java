package service;


import entities.Student;
import utils.Utils;

import java.util.Map;
import java.util.Scanner;

public class StudentService {
    Utils utils = new Utils();

    public void inputStudent(Map<Integer, Student> students, Scanner scanner){
        System.out.println("moi ban nhap ten");
        String name = scanner.nextLine();
        System.out.println("nhap diem so");
        double scroce = utils.inputDouble(scanner);
        Student student = new Student(name, scroce);
        students.put(student.getId(), student);
        System.out.println(student);
    }

    public void removeStudent(Map<Integer, Student> students, Scanner scanner){
        System.out.println("nhap id hs can xoa");
        int id= utils.inputInt(scanner);
        students.remove(id);
        System.out.println("da xoa hs");
    }

    public Student findById( Map<Integer, Student> students, Scanner scanner){
        System.out.println(" nhap id hs can tim");
        int id= utils.inputInt(scanner);
        System.out.println(students.get(id));
        return students.get(id);
    }

    public double averageScoce(Map<Integer, Student> students){
        double totalScore = 0;
        int count = 0;
        for (Map.Entry<Integer, Student> entry: students.entrySet()){
            double score = entry.getValue().getScore();
            totalScore += score;
            count++;
        }
        double averageScore =  totalScore / count;
        System.out.println("diem tb la: " +averageScore);
        return averageScore;
    }
}
