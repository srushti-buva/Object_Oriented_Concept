
package encapsulation;

public class MainClass {

    public static void main(String[] args) {

        Employee e = new Employee();

        // Setting values using setter methods
        e.setEmployee_id(101);
        e.setEmployee_name("Srushti Buva");
        e.setEmployee_city("Kolhapur");
        e.setEmployee_email("srushti@gmail.com");
        e.setEmployee_salary(45000.50);
        e.setGender("Female");
        e.setDateOfBirth("15-08-2003");
        e.setDepartmentId(10);
        e.setEmployeeStatus("Active");
        e.setHireDate("01-07-2026");
        e.setManagerId(201);
        e.setFirstName("Srushti");
        e.setLastName("Buva");
        e.setPhone("9876543210");
        e.setDesignation("Java Developer");

        // Getting values using getter methods
        System.out.println("Employee ID: " + e.getEmployee_id());
        System.out.println("Employee Name: " + e.getEmployee_name());
        System.out.println("Employee City: " + e.getEmployee_city());
        System.out.println("Employee Email: " + e.getEmployee_email());
        System.out.println("Employee Salary: " + e.getEmployee_salary());
        System.out.println("Gender: " + e.getGender());
        System.out.println("Date of Birth: " + e.getDateOfBirth());
        System.out.println("Department ID: " + e.getDepartmentId());
        System.out.println("Employee Status: " + e.getEmployeeStatus());
        System.out.println("Hire Date: " + e.getHireDate());
        System.out.println("Manager ID: " + e.getManagerId());
        System.out.println("First Name: " + e.getFirstName());
        System.out.println("Last Name: " + e.getLastName());
        System.out.println("Phone: " + e.getPhone());
        System.out.println("Designation: " + e.getDesignation());
    }
}

