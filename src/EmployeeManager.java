import java.util.*;
import java.util.function.Predicate;

public class EmployeeManager {

    private Map<String, List<Employee>> employeeList;

    public EmployeeManager (){
        this.employeeList = new HashMap<>();

    }

    //add employee
    public void addEmployee(String department, Employee employee){
        employeeList.computeIfAbsent(employee.getDepartment(), k ->new ArrayList<>()).add(employee);
        System.out.println("Employee added:" + employee);
    }

    //get employee
    public Employee getEmployee(Predicate<Employee> predicate){
        return employeeList.values().stream()
                .flatMap(Collection::stream)
                .filter(predicate)
                .findFirst()
                .orElse(null);
        }

    //update employees
    public void updateEmployee(int employeeId, Employee updatedDetails) {
        for (List<Employee> employees : employeeList.values()) {
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i).getEmployeeId() == employeeId) {
                    employees.set(i, updatedDetails);
                    System.out.println("Employee updated: " + updatedDetails);
                   // return;
                }
            }
        }
        System.out.println("Employee not found.");
    }


    //delete employee
    public void deleteEmployee(Predicate<Employee> predicate){
        employeeList.entrySet().removeIf(entry -> {entry.getValue().removeIf(predicate);
        return entry.getValue().isEmpty();
    });
    }

    //display Employees Grouped By department
    public void displayEmployee(){
        employeeList.forEach((department, employees) -> {
                System.out.println("Department: " + department);
        employees.forEach( System.out::println);
        System.out.println();
    });
    }

    //Display Employee order by
    public  void displayEmployeeOrderBy(Comparator<Employee> comparator){
        employeeList.values().stream()
                .flatMap(Collection::stream)
                .sorted(comparator)
                .forEach(System.out::println);
    }

    //Display employee filtered by
    public void displayEmployeeFilteredBy(Predicate<Employee> predicate){
        employeeList.values().stream()
                .flatMap(Collection::stream)
                .filter(predicate)
                .forEach(System.out::println);
    }

    //count employees
    public void countEmployee(){
        employeeList.forEach((department, employee) ->
                System.out.println("Department " + department + " total employees:" + employee.size()));
        int totalEmployees = employeeList.values().stream()
                .mapToInt(List::size)
                .sum();
        System.out.println("total number of employees is:" + totalEmployees);
    }



    }



