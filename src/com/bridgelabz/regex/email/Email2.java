package com.bridgelabz.regex.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email2 {
    static Pattern pattern = Pattern.compile("^[a-z]+[@]$");
    public static void main(String[] args) {
        Matcher matcher = pattern.matcher("abc@");
        if(matcher.matches()){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
