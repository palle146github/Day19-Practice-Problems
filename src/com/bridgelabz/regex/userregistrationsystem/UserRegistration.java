package com.bridgelabz.regex.userregistrationsystem;
import java.util.Scanner;

public class UserRegistration {


    public static void main(String[] args) {
        boolean validOutput = false;
        Scanner sc = new Scanner(System.in);
        UserRegistrationUtility userRegistrationUtility = new UserRegistrationUtility();
        userRegistrationUtility.clearAllSampleEmail();
        System.out.println("********Welcome to User Registeration using RegEx*********");
        System.out.println();
        while(validOutput == false) {
            System.out.println("Please Enter Your first name!!");
            String fName = sc.nextLine();
            validOutput = userRegistrationUtility.validateFirstName(fName);
            System.out.println();
        }
        validOutput = false;
        while(validOutput == false) {
            System.out.println("Please Enter the Last Name!!");
            String lName = sc.nextLine();
            validOutput = userRegistrationUtility.validateLastName(lName);
            System.out.println();
        }
        validOutput = false;
        while(validOutput == false) {
            System.out.println("Please Enter the Email Address!!!");
            String email= sc.nextLine();
            validOutput = userRegistrationUtility.valdateEmail(email);
            System.out.println();
        }
        validOutput = false;
        while(validOutput == false) {
            System.out.println("Please Enter the phone number with country code!!");
            String phone = sc.nextLine();
            validOutput = userRegistrationUtility.validatephoneNumber(phone);
            System.out.println();
        }
        validOutput = false;
        while(validOutput == false) {
            System.out.println("Please Enter a suitable password of 8 characters!!!");
            System.out.println("At least one [A-Z], [a-z], Exactly one [!@#$%^&*(),.?:{}|<>]");
            String pwd = sc.nextLine();
            validOutput = userRegistrationUtility.validatePassword(pwd);
            System.out.println();
        }
    }
}

