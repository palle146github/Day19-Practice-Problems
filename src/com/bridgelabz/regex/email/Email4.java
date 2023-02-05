package com.bridgelabz.regex.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email4 {
    static Pattern pattern = Pattern.compile("^[a-z]+[_+-.]?[a-z]*[@][0-9a-z]+[.][a-z]{2,}$");

    public static void main(String[] args) {
        Matcher matcher = pattern.matcher("abc@jfgkjdf.co");
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
