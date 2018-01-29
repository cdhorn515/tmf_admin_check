package com.cdhorn;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your email address: ");
        String emailAddress = scanner.next();
        if (emailAddress.contains("@fool.com")) {
            System.out.println("What's your first name?");
            String firstName = scanner.next();
            System.out.println("What's your last name?");
            String lastName = scanner.next();

            Date date = new Date();
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            String registrationDate = df.format(date);
            User.addUser(emailAddress, firstName, lastName, registrationDate);

        } else {
            System.out.println("Sorry, that's not a fool's email!");
        }

    }

}


/*
Write some code in any programming language for the following situation: A User has the following properties: Email Address, First Name, Last Name, Registration Date. It also has a Save method. Admin users are exactly like regular Users, but can only be saved when the email address ends with “@fool.com”
 */