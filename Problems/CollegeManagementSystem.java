import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Person{
    private String name;
    private int age;
    private String id;

    public Person(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getID(){ 
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    abstract public void displayDetails();
}


class Course{

    private String courseCode;
    private String courseName;


    public Course(String courseCode, String courseName){
        this.courseCode = courseCode;
        this.courseName = courseName;
    }


    public String getCourseCode(){ return courseCode;}
    public String getCourseName(){ return courseName;}


    @Override
    public String toString(){
        return courseCode + " - "+ courseName;
    }

}


class Department{
    private String departmentName;
    private List<Course> courses = new ArrayList<>();  // ArrayList have Dyanamic Size

    public Department(String departmentName){
        this.departmentName = departmentName;
    }

    public String getDepartmentName(){
        return departmentName;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public List<Course> getCourses(){
        return courses;
    }
}


class Student extends Person{

    private Course enrolledCourse;
    private double marks;


    public Student(String name, String id, int age){
        super(name,age, id);
    }

    public void assignCourse(Course course){
        this.enrolledCourse = course;
    }   

    public void setMarks(double marks){
        this.marks = marks;
    }


    public String calculateGrade(){
        if (marks >= 90) {
            return "A+";          
        }
        else if (marks >= 75) {
            return "A";
        }
        else if (marks >= 60) {
            return "B+"; 
        }
        else if(marks >= 40){
            return "B";
        }
        else{
            return "F";
        }
    }


    @Override
    public void displayDetails(){
        System.out.println("------Student Details-----");
        System.out.println("ID     : "+getID());
        System.out.println("Name   : "+getName());
        System.out.println("Age    : "+getAge());
        System.out.println("Course : "+(enrolledCourse != null ? enrolledCourse : "Not Assigned"));
        System.out.println("Marks  : "+marks);
        System.out.println("Grade  : "+calculateGrade());
    }
}



class Teacher extends Person{
    private String subjectSpecialization;
    private double salary;

    private static final double HRA_PERCENT = 0.22;
    private static final double DA_PERCENT = 0.15;


    public Teacher(String name, String id, int age, String subjectspecialization, double basicSalary){
        super(name, age, id);
        this.subjectSpecialization = subjectspecialization;
        this.salary = basicSalary;
    }

    public double calcualteSalary(){
        return salary + (salary * HRA_PERCENT) + (salary + DA_PERCENT);
    }



    @Override
    public void displayDetails(){
        System.out.println("------Teacher Details-----");
        System.out.println("ID     : "+getID());
        System.out.println("Name   : "+getName());
        System.out.println("Age    : "+getAge());
        System.out.println("Specializations : "+subjectSpecialization);
        System.out.println("Basic Salary  : "+salary);
        System.out.println("Gross Salary : "+calcualteSalary());
    }
}




public class CollegeManagementSystem {


    private static List<Student> students = new ArrayList<>();
    private static List<Teacher> teachers = new ArrayList<>();
    private static Department csDepart = new Department("Computer Science");
    private static Scanner sc = new Scanner(System.in);


    private static void addStudent(){

            System.out.println("Enter Student ID :");
            String id = sc.nextLine();

            System.out.println("Enter Name :");
            String name = sc.nextLine();


            int age = readInt("Enter Age: ");

            double marks = readDouble("Enter Marks (0-100):");


            Student student = new Student(name, id, age);
            student.setMarks(marks);

            students.add(student);
            System.out.println("Student Added Successfully...");

        }

    public static void main(String[] args) {
        

        Course java = new Course("CS101", "Java Programming");
        Course dbms = new Course("CS101", "Database Management");


        csDepart.addCourse(java);
        csDepart.addCourse(dbms);


        int choice;

        do{

            printMenu();
            choice = readInt("Enter Choice");


            switch (choice) {
                case 1: addTeacher();
                    break;
                case 2: addStudent();
                    break;
                case 3: assignCourseToStudent();
                    break;
                case 4: displayAllStudents();
                    break;
                case 5: displayAllTeacher();
                    break;
                case 6: displayDepartmentCourses();
                    break;
                case 7: choice = 7; 
                default:

                    break;
            }

        }
        while(choice != 7);     

    }


    private static void printMenu(){
        System.out.println("============College Management System============");
        System.out.println("1. add Teacher");
        System.out.println("2. add Student");
        System.out.println("3. Assign Course to Student");
        System.out.println("4. Display all Students (with Grades)");
        System.out.println("5. Display all Teachers (with Salary)");
        System.out.println("6. Display Department Courses");
        System.out.println("7. Exit"); 
    }




    private static void addTeacher(){

        System.out.println("Enter Teacher ID :");
        String id = sc.nextLine();

        System.out.println("Enter Teacher Name: ");
        String name = sc.nextLine();

        
        int age = readInt("Enter Teacher Age: ");

        System.out.println("Enter Subject Specialization: ");
        String subject = sc.nextLine();

        System.out.println("Enter Teacher Salary: ");
        double salary = readDouble("Enter Basic Salary: ");


        Teacher teacher = new Teacher(name, id, age, subject, salary);


        teachers.add(teacher);
        System.out.println("Teacher Added Successfully...");
    }



    private static void displayAllStudents(){
        if (students.isEmpty()) {
            System.out.println("Students not found");
        }
        
        System.out.println("Students in "+csDepart.getDepartmentName()+ " department");
        
        for(Student s: students){
            System.out.println(" "+s);
        }
    }


    private static void displayAllTeacher(){
        if (teachers.isEmpty()) {
            System.out.println("Teachers not found");
        }


         System.out.println("Teachers in "+csDepart.getDepartmentName()+ " department");
        
        for(Teacher t: teachers){
            System.out.println(" "+t);
        }

    }

   


    private static void assignCourseToStudent(){

        if (students.isEmpty()) {
            System.out.println("No Students are Available, first add student");
            return;
        }

        System.out.println("Enter Student ID to assign course :");
        String id = sc.nextLine();

        Student found = null;


        for(Student s: students){
            if (s.getID().equals(id)) {
                found = s;
            }
        }

        if (found == null) {
            System.out.println("Student not found.");
        }


        displayDepartmentCourses();

        System.out.println("Enter Course Code to Assign: ");
        String code = sc.nextLine();

        Course selected = null;


        for(Course c: csDepart.getCourses()){

            if (c.getCourseCode().equals(code)) {
                selected  =  c;
                break;
            }

        }

        if (selected == null) {
            System.out.println("Course not found.");
        }

    
        found.assignCourse(selected);


        System.out.println("Course assign Successfully...");

        

    }



    private static void displayDepartmentCourses(){
        System.out.println("Courses in "+csDepart.getDepartmentName()+" department");
        for(Course c: csDepart.getCourses()){
            System.out.println(" "+c);
        }
    }



    // Input helper 

    private static int readInt(String prompt){

        System.out.print(prompt);

        while(!sc.hasNextInt()) {
           System.out.println("Please enter a valid number"); 
           sc.next();
        }

        int value = sc.nextInt();
        sc.nextLine();

        return value;
    }


    private static double readDouble(String prompt){

        System.out.print(prompt);

        while(!sc.hasNextDouble()) {
           System.out.println("Please enter a valid number"); 
           sc.next();
        }

        double value = sc.nextDouble();
        sc.nextLine();

        return value;
    }




}
