package EMPLOYEE;

public class EmployeeDetails {


    private int id;
    private String name;
    private double salary;
    private String location;
    private String Department;
   
    public EmployeeDetails(int id, String name, double salary, String location, String Department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.location=location;
        this.Department=Department;
        

    }
    public void displayDetails() {
        System.out.println("--- Employee Details ---");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Location: " + location);
        System.out.println("Employee Department: " + Department);
       
    }
    public static void main(String[] args) {
        EmployeeDetails employee = new EmployeeDetails(101, "Alaina", 50000.00,"Hubli","Computer Science");
        employee.displayDetails();
    }
}
