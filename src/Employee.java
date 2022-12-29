import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private String middleName;
    private int department;
    private double salary;
    private final long id = count;
    private static long count = 1L;

    public Employee(String firstName, String lastName, String middleName,
                    int department, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        if (EmployeeService.isCorrectDepartment(department)) {
            this.department = department;
        }
        else {
            System.out.println("Ошибка: указан несуществующий отдел");
        }
        this.salary = salary;
        count++;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник #" + id
                + "\nФ.И.О. сотрудника:" + lastName + " " + firstName + " " + middleName
                + "\nОтдел:" + department
                + "\nЗарплата:" + String.format("%.2f", salary) + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
