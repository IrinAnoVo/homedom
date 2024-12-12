package company;

import java.util.Arrays;
import java.util.Random;


public class Company {
    private int id;
    private String name;
    private String address;
    private Department[] department;

    public Company(int id, String name, String address, Department[] department) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.department = department;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Department[] getDepartment() {
        return department;
    }

    public void setDepartment(Department[] department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", department=" + Arrays.toString(department) +
                '}';
    }

    public void maxSalary(Company company, Department department, Employee1 employee1) {
        float maxSalary = 0;
        Employee1 maxEmployee = null;
        for (int i = 0; i < department.getEmployees().length; i++) {
            if (department.getEmployees()[i].getSalary() > maxSalary) {
                maxSalary = department.getEmployees()[i].getSalary();
                maxEmployee = department.getEmployees()[i];
            }
        }
        System.out.println("Employee with the highest salary in department " + department.getName() + ": " + maxEmployee);

    }


    public static void main(String[] args) {
        float maxSalary = 0;
        Employee1 maxEmployee = null;
        Company[] companies = generateCompanies(10);
        for (int i = 0; i < companies.length; i++) {
            Department[] departments = companies[i].getDepartment();
            for (int j = 0; j < departments.length; j++) {
                Employee1[] employees = departments[j].getEmployees();
                for (int k = 0; k < employees.length; k++) {
                    if (employees[k].getSalary() > maxSalary) {
                        maxSalary = employees[k].getSalary();
                        maxEmployee = employees[k];
                    }
                }
            }
        }
        System.out.println("Employee with the highest salary: " + maxEmployee);
    }

    private static Company[] generateCompanies(int i) {
        Company[] companies = new Company[i];
        Random random = new Random();
        for (int j = 0; j < companies.length; j++) {
            companies[j] = new Company(random.nextInt(1), "Company " + j, "Address " + j, generateDepartments(random.nextInt(5)));
        }
        return companies;
    }

    private static Department[] generateDepartments(int i) {
        Department[] departments = new Department[i];
        Random random = new Random();
        for (int j = 0; j < departments.length; j++) {
            departments[j] = new Department(random.nextInt(5), "Department " + j, "Address " + j, generateEmployees(random.nextInt(5)));
        }
        return departments;
    }

    private static Employee1[] generateEmployees(int i) {
        Employee1[] employees = new Employee1[i];
        Random random = new Random();
        for (int j = 0; j < employees.length; j++) {
            employees[j] = new Employee1(random.nextInt(200), "Employee " + j, random.nextBoolean(), random.nextFloat());
        }
        return employees;
    }
}
