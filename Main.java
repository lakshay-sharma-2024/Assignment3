import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentFunctions std = new StudentFunctions();
        boolean cond = true;
        int choice;
        do {
            System.out.println("1)Add Student\n2)Display Student Details\n3)Search\n4)Edit Student Detail\n5)Delete Student\n6)Exit\n");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    std.addStudent();
                    break;
                case 2:
                    std.printDetails();
                    break;
                case 3:
                    std.Search();
                    break;
                case 4:
                    std.editStudent();
                    break;
                case 5:
                    std.delete();
                    break;
                case 6:
                    System.out.println("Thank you for using");
                    cond = false;

            }
        }while(cond);
    }
}




