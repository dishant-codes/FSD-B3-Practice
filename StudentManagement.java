import java.util.ArrayList;
import java.util.Scanner;

class Stud{
    private String name;
    private int id;
    private String course;
    private double marks;


    public Stud(String name, int id, String course, double marks) {
        this.name = name;
        this.id = id;
        this.course = course;
        this.marks = marks;
    }

    public Stud(){
        System.out.println("Student Created...");
    }

    public void calculateResult(){

        if (marks >= 90) {
            System.out.print("A Grade");
        }
        else if (marks >= 80) {
            System.out.print("B Grade");
        }
        else if (marks >= 60) {
            System.out.print("C Grade");
        }
        else if (marks >= 40) {
            System.out.print("D Grade");
        }
        else{
            System.out.print("Failed");
        }

    }
    
    
    public void displayDetails(){
        System.out.println("*******Student Details*******");
        
        System.out.println("Id        :"+id);
        System.out.println("Name      :"+name);
        System.out.println("Course    :"+course);
        System.out.println("Marks     :"+marks);
        System.out.print("Grades    :");
        calculateResult();

    }
    
}

public class StudentManagement {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Stud> list = new ArrayList<>();

    public void addStudent(){

        System.out.println("Enter Name :");
        String name = scanner.nextLine();
        System.out.println("Enter Id :");
        int id = scanner.nextInt();
        System.out.println("Enter Course :");
        String course = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter Marks :");
        double marks = scanner.nextDouble();
        Stud stud = new Stud(name, id, course, marks);

        list.add(stud);
    }

    public void displayStudentList(){

        for(Stud student: list){
            student.displayDetails();
        }

    }
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();

        System.out.println("Student Management System");
        while (true) {
            
          System.out.println("Select Options"); 
          System.out.println("1. Add Student ");
          System.out.println("2. Display Students");
          int choice = scanner.nextInt();

          switch (choice) {
            case 1:
                studentManagement.addStudent();
                break;
            case 2: 
                studentManagement.displayStudentList();
                break;
            default:
                break;
          }

        }
        
    }

}
