class Students{
    private int studentID;
    private String name;
    private String course;
    private int marks;


    public void setStudentId(int id){
        this.studentID = id;
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


    public int getStudentId(){
        return studentID;
    }


    public String getName(){
        return name;
    }


    public String getCourse(){
        return course;
    }


    public int getMarks(){
        return marks;
    }


    public Students(int studentID, String name, String course, int marks){
        this.studentID = studentID;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }


    public String calculateGrade(){
        if (marks >= 90) {
            return "A+";
        }
        else if (marks >= 75) {
            return "A";
        }
        else if (marks >= 60){
            return "B+";
        }
        else if( marks >= 40){
            return "B";
        }
        else{
            return "F";
        }
    }


    public void displayDetails(){
        System.out.println("=======Student Details=======");
        System.out.println("Student Id : "+getStudentId());
        System.out.println("Name       : "+getName());
        System.out.println("Course     : "+getCourse());
        System.out.println("Marks      : "+getMarks());
        System.out.println("Grade      : "+calculateGrade());
    }
}


public class Encapsulation {

  public static void main(String[] args) {
    
      Students stud1 = new Students(1001, "Dishant", "FSD", 89);

      stud1.displayDetails();



  }

    
}
