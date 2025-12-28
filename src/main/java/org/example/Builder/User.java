package org.example.Builder;

public class User {

   private final String name;
   private final String email;
   private final String mobileNo;
   private final String address;
   private final int age;

   private User(UserBuilder builder){
       this.name = builder.name;
       this.email =  builder.email;
       this.address = builder.address;
       this.mobileNo = builder.mobileNo;
       this.age = builder.age;
   }

   public static class UserBuilder{
       private String name;
       private String email;
       private String mobileNo;
       private String address;
       private int age;

       public UserBuilder setName(String name){
           this.name = name;
           return this;
       }

       public UserBuilder setAddress(String address){
           this.address = address;
           return this;
       }

       public UserBuilder setMobileNo(String mobileNo){
           this.mobileNo = mobileNo;
           return this;
       }

       public UserBuilder setEmail(String email){
           this.email = email;
           return this;
       }

       public UserBuilder setAge(int age){
           this.age = age;
           return this;
       }

       public User build(){
           return new User(this);
       }
   }

}
