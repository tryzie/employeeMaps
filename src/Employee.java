public class Employee {
    private int employeeId;
    private String employeeNumber;
    private String name;
    private String department;

    public Employee (int employeeId, String employeeNumber, String name, String department){
        this.employeeId = employeeId;
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.department =department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employees{ " + "employeeId: " + employeeId + ", employeeNumber: " + employeeNumber + ", name: " + name + ", department: " + department + "}";
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return employeeId == employee.employeeId;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(employeeId);
//    }


}
