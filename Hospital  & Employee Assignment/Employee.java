package Opps;

// EmployeeSalaryManagementSystem
class Employee {
    protected String employeeId;
    protected String name;
    protected String department;
    protected double basicSalary;

    public Employee(String employeeId, String name, String department,
                    double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public String getCategory() {
        return "Employee";
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Category: " + getCategory());
        System.out.printf("Monthly Salary:", calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    private double allowance;

    public FullTimeEmployee(String employeeId, String name, String department,
                            double basicSalary, double allowance) {
        super(employeeId, name, department, basicSalary);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + allowance;
    }

    @Override
    public String getCategory() {
        return "Full-Time Employee";
    }
}

class PartTimeEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String employeeId, String name, String department,
                            double hoursWorked, double hourlyRate) {
        super(employeeId, name, department, 0.0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String getCategory() {
        return "Part-Time Employee";
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String employeeId, String name, String department,
                   double basicSalary, double bonus) {
        super(employeeId, name, department, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    public String getCategory() {
        return "Manager";
    }
}