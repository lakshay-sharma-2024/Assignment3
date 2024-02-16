import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class StudentFunctions {
    ArrayList<Student> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Enter PRN :");
        long prn = sc.nextInt();
        System.out.println("Enter NAME :");
        String name = sc.next();
        System.out.println("Enter DOB :");
        String dob = sc.next();
        System.out.println("Enter MARKS :");
        int marks = sc.nextInt();
        list.add(new Student(prn, name, dob, marks));
    }

    public void Search() {
        System.out.println("Search by :\n" + "1)PRN\n" + "2)Name\n" + "3)Position");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        switch (choice) {
            case 1:
                for (Student x : list) {
                    System.out.println("Enter the PRN :");
                    long prn = sc.nextLong();
                    if(x.getPrn() == prn) {
                        System.out.println("Name : " + x.getName() + "\nPRN :" + x.getPrn() + "\nDOB :" + x.getDoB() + "\nMarks :" + x.getMarks());
                        break;
                    }
                    else {
                        System.out.println("Not Found");
                    }

                }
                break;
            case 2:
                for (Student x : list) {
                    System.out.println("Enter the Name :");
                    String name = sc.nextLine();
                    if (name.equals(x.getName())) {
                        System.out.println("Name : " + x.getName() + "\nPRN :" + x.getPrn() + "\nDOB :" + x.getDoB() + "\nMarks :" + x.getMarks());
                        break;
                    } else {
                        System.out.println("Not Found");

                    }
                }
                break;
            case 3:
                System.out.println("Enter index :");
                int index = sc.nextInt();
                Student student = list.get(index);
                System.out.println("Name : " + student.getName() + "\nPRN :" + student.getPrn() + "\nDOB :" + student.getDoB() + "\nMarks :" + student.getMarks());
                break;
            default:
                System.out.println("Enter a valid option");
        }
    }
        public void editStudent()
        {
            System.out.print("Enter the PRN to edit: ");
            int prn = sc.nextInt();
            for (Student x : list) {
                if (x.getPrn() == prn) {
                    System.out.println("Enter the new details :");
                    System.out.print("PRN: ");
                    int prn_edit = sc.nextInt();
                    System.out.print("Name: ");
                    String name_edit = sc.next();
                    System.out.print("Total Marks: ");
                    int marks_edit = sc.nextInt();
                    System.out.print("DOB: ");
                    String dob_edit = sc.next();
                    x.setName(name_edit);
                    x.setMarks(marks_edit);
                    x.setPrn(prn_edit);
                    x.setDoB(dob_edit);
                    break;
                } else {
                    System.out.println("Student not found!");
                }

            }
        }
        public void printDetails(){
            for (Student x : list) {
                long prn = x.getPrn();
                String name = x.getName();
                String dob = x.getDoB();
                float marks = x.getMarks();
                System.out.print("\n\nPRN: " + prn + "\nName: " + name + "\nDOB: " + dob + "\nMarks: " + marks+"\n");
            }
        }
        public void delete()
        {
            System.out.print("Enter the PRN to delete: ");
            int prn = sc.nextInt();
            for (Student x : list) {
                if (x.getPrn() == prn) {
                    System.out.println("Student Details Deleted");
                    list.remove(x);
                    break;
                } else {
                    System.out.println("Student not found!");
                }
            }
        }
    }