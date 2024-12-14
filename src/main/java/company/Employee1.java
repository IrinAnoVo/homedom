package company;

public class Employee1 {
    private int id;
    private String name;
    private boolean gender;
    private double salary;

    public Employee1(int id, String name, boolean gender, float salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
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

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
//    public  void gender1 (boolean gender){
//        if(gender == true) {
//            System.out.println("Gender: Male");
//        }
//        else {
//            System.out.println("Gender: Female");
//        }
//    }
}

