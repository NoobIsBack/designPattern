package com.mayank.designPattern.BuilderPattern;

public class UserProfileBuilderPattern {

    private String name;
    private String email;
    private String address;
    private int age;

    private UserProfileBuilderPattern(Builder builder) {

        this.address = builder.address;
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    public static class Builder {
        private String name;
        private String email;
        private int age;
        private String address;
        private String phone;


        public Builder(String name) {
            this.name = name;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public UserProfileBuilderPattern build() {
            return new UserProfileBuilderPattern(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
