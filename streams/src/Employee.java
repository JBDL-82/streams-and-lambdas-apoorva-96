import java.util.List;

public class Employee {
    private String name;
    private double salary;
    private String department;
    private int experience;

    public Employee(String name, double salary, String department, int experience) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", experience=" + experience +
                '}';
    }

    public static List<Employee> getAllEmployees() {
        Employee e1 = new Employee("ABC", 35000, "Engineering", 2);
        Employee e2 = new Employee("MNO", 60000, "Management", 8);
        Employee e3 = new Employee("GHI", 80000, "HR", 5);
        Employee e4 = new Employee("JKL", 45000, "Management", 10);
        Employee e5 = new Employee("DEF", 70000, "Engineering", 4);
        return List.of(e1, e2, e3, e4, e5);
    }
}
