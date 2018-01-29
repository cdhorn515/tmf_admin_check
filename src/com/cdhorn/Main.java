package com.cdhorn;

public class Main {

    public static void main(String[] args) {


        User adminUser = new User();
        adminUser.emailAddress = "email@fool.com";
        adminUser.firstName = "Christina";
        adminUser.lastName = "Cornell";
        adminUser.registrationDate = "12345";
        User.addUser(adminUser.emailAddress, adminUser.firstName, adminUser.lastName, adminUser.registrationDate);


    }

}


/*
Write some code in any programming language for the following situation: A User has the following properties: Email Address, First Name, Last Name, Registration Date. It also has a Save method. Admin users are exactly like regular Users, but can only be saved when the email address ends with “@fool.com”
 */