package org.example.Builder;

public class Main {

    public static void main(String[] args) {
        User user = new User.UserBuilder().setName("ram").setEmail("ram@email").setAddress("india").setMobileNo("1234").setAge(45).build();

        System.out.println("User created successfully");
    }


}
