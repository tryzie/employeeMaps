import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager();

         Employee emp1 = new Employee(1, "B21", "Ian", "technical");
         Employee emp2 = new Employee(2, "c30", "Lesley", "sales");
         Employee emp3 = new Employee(3, "D08", "Mary", "marketing");

         //add employee
         manager.addEmployee("technical", emp1);
         manager.addEmployee("sales", emp2);
         manager.addEmployee("marketing", emp3);

        //get employee
         System.out.println("\nFound employee:" + manager.getEmployee(employee -> employee.getDepartment().equalsIgnoreCase("technical")));

         //update employee
        Employee updatedEmployee = new Employee(2, "c30,", "Gary", "technician");
        manager.updateEmployee(2, updatedEmployee);

        //delete employee
         manager.deleteEmployee(employee -> employee.getEmployeeId()==2);
//        System.out.println("After the deletion this is the output");
//        manager.displayEmployee();

         //display employee
        System.out.println("DIsplay all employees");
        manager.displayEmployee();

        //display employee order by
        System.out.println("Employees Ordered by Name:");
        manager.displayEmployeeOrderBy(Comparator.comparing(Employee::getName));

        // Display Employees Filtered By Department
        System.out.println("\nEmployees in IT Department:");
        manager.displayEmployeeFilteredBy(emp -> emp.getDepartment().equalsIgnoreCase("IT"));

        // Count Employees
        System.out.println("\nEmployee Counts:");
        manager.countEmployee();

    }
}