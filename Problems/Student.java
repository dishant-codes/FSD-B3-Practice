class Student{

    private int studentId;
    private String name;
    private String course;
    private int marks;


    // Setter Methods 
    public void setStudentId(int id){
        this.studentId = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }


    // Getter Methods
    public int getStudentId(){
        return this.studentId;
    }
    public String getName(){
        return this.name;
    }
    public String getCourse(){
        return this.course;
    }
    public int marks(){
        return this.marks;
    }


    // Constructor 
    Student(int id, String name, String course, int marks){
        this.studentId = id;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }



    // Calculate Grades
    public char calculateGrade(){
        char grade;
        if (this.marks >= 90 && this.marks <= 100) {
            grade = 'A';
        }
        else if(this.marks >= 70 && this.marks <= 89){
            grade = 'B';
        }
        else if (this.marks >= 35 && this.marks <= 69) {
            grade = 'C';
        }
        else{
            grade = 'F';
        }
        return grade;
    }



    public void displayDetails(){
        System.out.println("==========Student Details=========");
        System.out.println("Student Id :"+this.studentId);
        System.out.println("Name :"+this.name);
        System.out.println("Course :"+this.course);
        System.out.println("Grades :"+this.calculateGrade());
    }



    public static void main(String[] args) {
        Student stud1 = new Student(1, "Amrish Sanjay Vaidya", "FSD + GenAI", 91);
        stud1.setMarks(87);
        stud1.displayDetails();
    }

}