package test;

import java.util.ArrayList;
import java.util.List;

public class CompositeTest {
    public static void main(String[] args) {
        Department sales = new Department("Sales");
        Employee john = new Employee("John", "Sales Representative");
        Employee mary = new Employee("Mary", "Sales Manager");
        sales.addEmployee(john);
        sales.addEmployee(mary);

        Department marketing = new Department("Marketing");
        Employee mike = new Employee("Mike", "Marketing Representative");
        marketing.addEmployee(mike);

        Department development = new Department("Development");
        Employee bob = new Employee("Bob", "Developer");
        Employee jane = new Employee("Jane", "Manager");
        development.addEmployee(bob);
        development.addEmployee(jane);

        Department root = new Department("CEO");
        root.addSubDepartment(sales);
        root.addSubDepartment(marketing);
        root.addSubDepartment(development);

        root.print();
    }
}

class Employee {
    private final String name;
    private final String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void print() {
        System.out.println(name + " - " + role);
    }
}


class Department {
    private final String name;
    private final List<Employee> employees = new ArrayList<>();
    private final List<Department> subDepartments = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void addSubDepartment(Department department) {
        subDepartments.add(department);
    }

    public void removeSubDepartment(Department department) {
        subDepartments.remove(department);
    }

    public void print() {
        System.out.println(name);
        for (Employee employee : employees) {
            employee.print();
        }
        for (Department department : subDepartments) {
            department.print();
        }
    }
}

