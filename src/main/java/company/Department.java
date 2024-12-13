package company;


import java.util.Arrays;

public class Department {
    private int id;
    private String name;
    private String adress;
    private Employee1[] employees;

    public Department(int id, String name, String adress, Employee1[] employees) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.employees = employees;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Employee1[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee1[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }

//    public void employee4 (Department department, Employee1 employee) {
//        Employee1[] employees = department.employees;
//    }
}

