package com.bridgelabz.regex.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email5 {
    static Pattern pattern = Pattern.compile("^[a-z]+[_+-.]?[a-z]*[^_+-.][@][0-9a-z]+[.][a-z]{2,}[.]?[a-z]{2}$");
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a-z]+[_+-.]?[a-z]*[^_+-.][@][0-9a-z]+[.][a-z]{2,}[.]?[a-z]{2}$");
        Matcher matcher = pattern.matcher("abc.jhj@jfgkjdf.co.in");
        if(matcher.matches()){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
