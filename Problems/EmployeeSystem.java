abstract class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    abstract void displayDetails();


}

class Manager extends Employee {
    private String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }


    @Override
    void displayDetails() {
        System.out.println("Manager Name: " + getName());
        System.out.println("Manager ID: " + getId());
        System.out.println("Manager Salary: " + getSalary());
        System.out.println("Manager Department: " + department);
    }


}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    void displayDetails() {
        System.out.println("Developer Name: " + getName());
        System.out.println("Developer ID: " + getId());
        System.out.println("Developer Salary: " + getSalary());
        System.out.println("Developer Programming Language: " + programmingLanguage);
    }
}


class EmployeeSystem{

    public static void main(String[] args) {

        Employee emp1 = new Manager("Dishant", 101, 1000000.0, "IT");
        Employee emp2 = new Developer("Alice", 102, 80000.0, "Java");

        Employee jeyesh = new Developer("Jayesh", 1000, 70000.0, "Python");
        emp1.displayDetails();
        System.out.println();
        emp2.displayDetails();
        System.out.println();
        jeyesh.displayDetails();

    }

}

