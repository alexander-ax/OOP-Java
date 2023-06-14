package OverloadingConstructors;

public class Employee {
    String firstname, lastName, address, sex;
    int age;

    Employee(){
        age = 0;
        firstname = "N/A";
        lastName = "N/A";
        address = "N/A";
        sex = "N/A";
    }
    Employee(int age){
        this.age = age;
        firstname = "Alexander";
        lastName = "N/A";
        address = "N/A";
        sex = "N/A";
    }
    Employee(String firstName,
             String lastName,
             String address,
             String sex,
             int age){
        this.firstname = firstName;
        this.lastName = lastName;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }

}
