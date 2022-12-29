public class EmployeesBook {
    private static final int size = 3;
    private static Employee[] employees = new Employee[size];
    public static void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }
        System.out.println("В массиве нет свободных мест");
    }
    public static void deleteEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].equals(employee) && employees[i] != null) {
                employees[i] = null;
                return;
            }
            System.out.println("Такого работника нет");
        }
    }
    public static void printEmployees() {
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
    public static double salarySum() {
        double sum = 0.0d;
        for (Employee employee: employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    public static void EmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employees[0];
        double minSalary = employees[0].getSalary();

        for (Employee employeeBuf : employees) {
            if (employeeBuf.getSalary() < minSalary) {
                minSalary = employeeBuf.getSalary();
                employeeWithMinSalary = employeeBuf;
            }
        }
        System.out.println(employeeWithMinSalary);
    }
    public static void EmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[0];
        double maxSalary = employees[0].getSalary();

        for (Employee employeeBuf : employees) {
            if (employeeBuf.getSalary() > maxSalary) {
                maxSalary = employeeBuf.getSalary();
                employeeWithMaxSalary = employeeBuf;
            }
        }
        System.out.println(employeeWithMaxSalary);
    }
    public static double averageSalary() {
        return salarySum()/employees.length;
    }
    public static void printAllNames() {
        for (Employee employee: employees) {
            System.out.println(
                    employee.getLastName() + " " +
                    employee.getFirstName() + " " +
                    employee.getMiddleName()
            );
        }
    }
}
