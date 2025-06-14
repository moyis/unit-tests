package dev.moyis.employee;

class Employee {
  private String name;
  private int age;
  private Address address;

  Employee() {}

  String getName() {
    return name;
  }

  void setName(String name) {
    this.name = name;
  }

  int getAge() {
    return age;
  }

  void setAge(int age) {
    this.age = age;
  }

  Address getAddress() {
    return address;
  }

  void setAddress(Address address) {
    this.address = address;
  }
}
