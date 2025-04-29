package EMPLOYEE;

public class EmployeeDetails {


    private int id;
    private String name;
    private double salary;
   
    public EmployeeDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        

    }
    public void displayDetails() {
        System.out.println("--- Employee Details ---");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
       
    }
    public static void main(String[] args) {
        EmployeeDetails employee = new EmployeeDetails(101, "Alaina", 50000.00);
        employee.displayDetails();
    }
}
