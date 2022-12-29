public class EmployeeService {
    public static boolean isCorrectDepartment(int department) {
        if (department >= 1 && department <= 5) {
            return true;
        }
        return false;
    }
}
