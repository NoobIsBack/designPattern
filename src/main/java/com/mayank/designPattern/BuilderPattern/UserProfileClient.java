package com.mayank.designPattern.BuilderPattern;

public class UserProfileClient {

    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile("bad Design", "test@mk.com",
                "bokaro", "1234", 10);

        System.out.println(userProfile.getName());

        UserProfileBuilderPattern userProfileBuilderPattern =
                new UserProfileBuilderPattern.Builder("builder Pattern").build();

        System.out.println(userProfileBuilderPattern.getName());
    }
}
