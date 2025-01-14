# employeeMaps
It utilizes maps and constructors

Create an Employee class with the following fields and include appropriate constructors, geƩ ers, 
seƩ ers: 
Int employeeId, String employeeNumber, String name, String department 
 Create a Map, Map<String, List<Employee>>, where: 
o The key is the department name (String). 
o The value is a List<Employee> represenƟ ng all employees in that department.
 The following are a list of funcƟ onaliƟ es to achieve: 
a. Add New Employee 
- Add a new Employee to the appropriate department. 
- If the department does not exist, create a new entry in the Map 
b. Get Employee 
- Search for an employee by id, number or name across all departments. 
c. Update Employee Details 
- Update the details of a parƟ cular employee. The department can also be updated. 
d. Delete Employee 
- Remove an employee by a certain property. 
- If the department becomes empty aŌ er removal, delete the department from the map.
e. Display Employees in all departments, group by department 
f. Display Employees Ordered By a certain property either Ascending or Descending 
g. Display Employees Filtered By a certain property. Use streams and filters to achieve the 
filtering, and not looping through the list. 
h. Count Employees: 
- Display the total number of employees in each department. 
- Display the overall total number of employees
