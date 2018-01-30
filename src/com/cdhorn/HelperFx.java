package com.cdhorn;

import java.util.Scanner;

public class HelperFx {


    public String checkEmailAddress() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your email address: ");
        String email = scanner.next();
        return email;
    }
}
