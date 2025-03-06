import java.util.ArrayList;
import java.util.List;
public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Anupam", 50000));
        employees.add(new Employee(2, "Ajay", 60000));
        employees.add(new Employee(3, "Harsh", 55000));
        employees.add(new Employee(4, " Vijay", 40000));
        employees.add(new Employee(5, "Tanushka", 80000));

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
