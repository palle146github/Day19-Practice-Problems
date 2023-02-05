package com.bridgelabz.regex.userregistrationsystem;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUtility {

    public boolean validateFirstName(String firstName) {
        String validFirstName = "^[A-Z][a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(validFirstName);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("Input is valid!!");
            return true;
        } else {
            System.out.println("Input is Invalid!!");
            return false;
        }
    }

    public boolean validateLastName(String lastName) {
        String validLastName = "^[A-Z][a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(validLastName);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("Input is valid!!");
            return true;
        } else {
            System.out.println("Input is Invalid!!");
            return false;
        }
    }

    public boolean valdateEmail(String email) {
        String ValidEmail = "^[a-z0-9]{1,}[_+-.]?[a-z0-9]*[^_+-.][@]([a-z0-9])+([.][a-z]{2,})(.[a-z]{2,3})?$";
        Pattern pattern = Pattern.compile(ValidEmail);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Input is valid!!");
            return true;
        } else {
            System.out.println("Input is Invalid!!");
            return false;
        }
    }

    public boolean validatephoneNumber(String phoneNumber) {
        String phoneNum = "^[0-9]+[ ][1-9]{1}[0-9]{9}$";
        Pattern pattern = Pattern.compile(phoneNum);
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            System.out.println("Input is valid!!");
            return true;
        } else {
            System.out.println("Input is Invalid!!");
            return false;
        }
    }

    public boolean validatePassword(String passWord) {
        while(true) {
            String passWordSet = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*(),.?\":{}|<>])(?!.*[!@#$%^&*(),.?\":{}|<>]{2,})([A-Za-z0-9!@#$%^&*(),.?\":{}|<>]{8,})$";
            Pattern pattern = Pattern.compile(passWordSet);
            Matcher matcher = pattern.matcher(passWord);
            if (matcher.matches()) {
                System.out.println("Input is valid!!");
                return true;
            } else {
                System.out.println("Input is Invalid!!");
                return false;
            }
        }
    }

    public void clearAllSampleEmail() {
        UserRegistrationUtility emailCheck = new UserRegistrationUtility();
        System.out.println("Checking all Valid Sample!!!");
        emailCheck.valdateEmail("abc@yahoo.com");
        emailCheck.valdateEmail("abc-100@yahoo.com");
        emailCheck.valdateEmail("abc.100@yahoo.com");
        emailCheck.valdateEmail("abc111@abc.com");
        emailCheck.valdateEmail("abc-100@abc.net");
        emailCheck.valdateEmail("abc.100@abc.com.au");
        emailCheck.valdateEmail("abc@1.com");
        emailCheck.valdateEmail("abc@gmail.com.com");
        emailCheck.valdateEmail("abc+100@gmail.com");
        System.out.println();
        System.out.println("Checking all InValid Sample!!!");
        emailCheck.valdateEmail("abc");
        emailCheck.valdateEmail("abc@.com.my");
        emailCheck.valdateEmail("abc123@gmail.a");
        emailCheck.valdateEmail("abc123@.com");
        emailCheck.valdateEmail(".abc@abc.com");
        emailCheck.valdateEmail("abc()*@gmail.com");
        emailCheck.valdateEmail("abc123@.com.com");
        emailCheck.valdateEmail("abc@%*.com");
        emailCheck.valdateEmail("abc..2002@gmail.com");
        emailCheck.valdateEmail("abc.@gmail.com");
        emailCheck.valdateEmail("abc@abc@gmail.com");
        emailCheck.valdateEmail("abc@gmail.com.1a");
        emailCheck.valdateEmail("abc@gmail.com.aa.au");
    }
}