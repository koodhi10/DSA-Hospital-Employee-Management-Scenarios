package Opps;



public class EmployeeSalaryManagementSystem {
    static void main() {
        //Array
        Employee[] employees = {
                new FullTimeEmployee("EMP001", "Ahmed Ali", "Finance", 500, 150),
                new PartTimeEmployee("EMP002", "Fatima Hassan", "IT", 40, 6),
                new Manager("EMP003", "Mohamed Omar", "Management", 1000, 200)
        };

        System.out.println(" EMPLOYEE SALARY REPORT...");
        //Loop
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}


/*
1. The superclass is Employee.
   The subclasses are FullTimeEmployee, PartTimeEmployee, and Manager.

2. Inheritance reduces code duplication by allowing subclasses
   to reuse common fields and methods from Employee.

3. calculateSalary() demonstrates polymorphism because each
   subclass provides its own salary calculation.

4. @Override confirms that a method overrides a parent method
   and helps the compiler detect mistakes.
*/