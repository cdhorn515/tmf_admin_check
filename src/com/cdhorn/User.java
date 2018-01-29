package com.cdhorn;

public class User {

    public String emailAddress;
    public String firstName;
    public String lastName;
    public String registrationDate;

    public static void save(User user) {

    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public User() {
    }

    public static void addUser(String emailAddress, String firstName, String lastName, String registrationDate) {
        User adminUser = new User();
            adminUser.setEmailAddress(emailAddress);
            adminUser.setFirstName(firstName);
            adminUser.setLastName(lastName);
            adminUser.setRegistrationDate(registrationDate);
            User.save(adminUser);
            System.out.println("Welcome to our new fool, " + firstName + " " + lastName + "!");
        System.out.println("Your registration date is: " + registrationDate + ".");
    }

}
/*
Write some code in any programming language for the following situation: A User has the following properties: Email Address, First Name, Last Name, Registration Date. It also has a Save method. Admin users are exactly like regular Users, but can only be saved when the email address ends with “@fool.com”
 */

