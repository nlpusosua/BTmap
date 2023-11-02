package view;

import entities.Student;
import service.StudentService;

import java.util.Map;
import java.util.Scanner;

public class Menu {
    public void display(Scanner scanner, Map<Integer, Student> students){
        while (true) {
            System.out.println("mời bạn chọn các lụa chọn sau: ");
            System.out.println("1. thêm hs");
            System.out.println("2. xóa hs");
            System.out.println("3. tìm hs bằng id");
            System.out.println("4. tính điểm tb tất cả các hs");
            System.out.println("5. thoát chương trình");
            int choice = Integer.parseInt(scanner.nextLine());
            StudentService studentService = new StudentService();

            switch (choice) {
                case 1:
                    studentService.inputStudent(students, scanner);
                    break;
                case 2:
                    studentService.removeStudent(students, scanner);
                    break;
                case 3:
                    studentService.findById(students, scanner);
                    break;
                case 4:
                    studentService.averageScoce(students);
                    break;
                case 5: System.exit(0);

            }
        }
    }
}
