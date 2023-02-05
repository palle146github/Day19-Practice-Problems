package com.bridgelabz.regex.pincode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pincode3 {
    static Pattern pattern = Pattern.compile("^[0-9-:%/\\\\()\\u2122.+\\s]{6}$");
    public static void main(String[] args) {
        Matcher matcher = pattern.matcher("454538");
        if(matcher.matches()){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
