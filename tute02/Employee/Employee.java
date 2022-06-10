package Employee;

public class Employee {
    private String name = "";
    private double salary = 0.0;

    /**
     * Creates an employee with `name` and `salary`
     * @param name name of employee
     * @param salary yearly salary
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // public void setName(String newName) {
    //     this.name = newName;
    // }

    // public String getName() {
    //     return this.name;
    // }
}
