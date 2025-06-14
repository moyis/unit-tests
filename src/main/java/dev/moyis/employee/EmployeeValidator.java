package dev.moyis.employee;

public class EmployeeValidator {

  void validate(Employee employee) {
    if (employee.getName() == null) {
      throw new IllegalArgumentException("name should be present");
    }
    if (employee.getAge() < 18) {
      throw new IllegalArgumentException("age should be greater than 18");
    }
    validateAddress(employee.getAddress());
  }

  private static void validateAddress(Address address) {
    if (address.getCity() == null) {
      throw new IllegalArgumentException("city should be present");
    }
    address.setCity(address.getCity().trim());
    if (address.getCity().length() < 3) {
      throw new IllegalArgumentException("city should be at least 3 characters long");
    }
  }
}
