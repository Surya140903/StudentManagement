
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n===== Student Management Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();
                    dao.insertStudent(name, dept, marks);
                    break;
                case 2:
                    dao.viewStudents();
                    break;
                case 3:
                    System.out.println("👋 Exiting...");
                    return;
                default:
                    System.out.println("❗ Invalid choice");
            }
        }
    }
}
