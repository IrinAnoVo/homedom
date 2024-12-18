package company;

import java.util.Arrays;
import java.util.Random;

public class Company {
    private int id;
    private String name;
    private String address;
    private Department[] departments;

    public Company(int id, String name, String address, Department[] departments) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.departments = departments;

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
        return departments;
    }

    public void setDepartment(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", department=" + Arrays.toString(departments) +
                '}';
    }

    public void findEmployeesWithHigherSalary(Employee1 minEmployee) {
        //создаем метод поиска и в for (int i=0;i<в компании.всех отделов;i++)
        System.out.println("Сотрудник: " + minEmployee.getName() + " с зарплатой: " + minEmployee.getSalary());
        //все отделы компании
        for (int i = 0; i < departments.length; i++) {
            Department department = departments[i];
            //все сотрудники отдела
            for (int j = 0; j < department.getEmployees().length; j++) {
                Employee1 employee = department.getEmployees()[j];
                // сотрудник с большей зп > выбранный сотрудник для сравнения
                if (employee.getSalary() > minEmployee.getSalary()) {
                    System.out.println("В отделе: " + "(" + department.getName() + ")" + " у сотрудника: " + employee.getName() + " зп больше, чем зп у сотрудника: " + minEmployee.getName());
                }
            }
        }
    }

    public static void main(String[] args) {

        Employee1 employee1 = new Employee1(1, "Pasha", true, 3950);
        Employee1 employee2 = new Employee1(2, "Masha", false, 3600);
        Employee1 employee3 = new Employee1(3, "Vity", false, 3950);
        Employee1 employee4 = new Employee1(4, "Oleg", true, 3500);
        Employee1 employee5 = new Employee1(5, "Misha", true, 3800);

        Department department = new Department(1, "Bich", "2 One St", new Employee1[]{employee1, employee2, employee3, employee4, employee5});
        //ищем у кого зп больше
        Company company = new Company(1, "More", "2 One St", new Department[]{department});
        //меньшая зп у Олега
        Employee1 minEmployee = employee4;
        //вызываем метод для поиска сотрудников с большей зарплатой
        company.findEmployeesWithHigherSalary(minEmployee);
    }
}
