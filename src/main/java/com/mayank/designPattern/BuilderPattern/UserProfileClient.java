package com.mayank.designPattern.BuilderPattern;

public class UserProfileClient {

    UserProfile userProfile = new UserProfile("mayank", "test@mk.com",
            "bokaro", "1234", 10);


    UserProfileBuilderPattern userProfileBuilderPattern =
            new UserProfileBuilderPattern.Builder("mayank").build();
}
