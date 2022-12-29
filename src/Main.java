public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Никита", "Воробьев", "Евгеньевич", 1, 10000);
        Employee employee2 = new Employee("Кирилл", "Матвеев", "Михайлович", 2, 9000);
        Employee employee3 = new Employee("Елена", "Середняк", "Васильевна", 3, 5000);

        EmployeesBook.addEmployee(employee1);
        EmployeesBook.addEmployee(employee2);
        EmployeesBook.addEmployee(employee3);

        EmployeesBook.printEmployees();
        System.out.println("Сумма по зарплатам:" + EmployeesBook.salarySum());
        EmployeesBook.EmployeeWithMinSalary();
        EmployeesBook.EmployeeWithMaxSalary();
        EmployeesBook.averageSalary();
        EmployeesBook.printAllNames();
    }
}
