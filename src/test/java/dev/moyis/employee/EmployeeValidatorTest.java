package dev.moyis.employee;

import org.junit.jupiter.api.Test;

final class EmployeeValidatorTest {

    @Test
    void test() {
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setAge(25);
        Address address = new Address();
        address.setCity("New York");
        employee.setAddress(address);

        EmployeeValidator employeeValidator = new EmployeeValidator();

        employeeValidator.validate(employee);
    }
}
