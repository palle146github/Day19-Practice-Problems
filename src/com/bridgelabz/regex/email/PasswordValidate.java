package com.bridgelabz.regex.email;

public class PasswordValidate {

	public static void main(String[] args) {
		System.out.println("Rahiman!564o-->" + isValidPasswordUsingRegex("Rahiman!564o"));
		System.out.println("Hello$World345-->" + isValidPasswordUsingRegex("Hello$World345"));
		System.out.println("Hello@World34-->" + isValidPasswordUsingRegex("Hello@World34"));
		System.out.println("helloW#orld654R-->" + isValidPasswordUsingRegex("helloW#orld654R"));
		System.out.println("helloword#4-->" + isValidPasswordUsingRegex("helloword#4"));
		System.out.println("hellowprdl%#54-->" + isValidPasswordUsingRegex("hellowprdl%#54"));
		System.out.println("Helloworld1@-->" + isValidPasswordUsingRegex("Helloworld1@"));
		System.out.println("Helloworld1@@-->" + isValidPasswordUsingRegex("Helloworld1@@"));
		System.out.println("Helloworld@1-->" + isValidPasswordUsingRegex("Helloworld@1"));
		System.out.println("helloworld-->" + isValidPasswordUsingRegex("helloworld"));
		System.out.println("Helloworld-->" + isValidPasswordUsingRegex("Helloworld"));
		System.out.println("helloworld@-->" + isValidPasswordUsingRegex("helloworld@"));
		System.out.println("helloworld@@-->" + isValidPasswordUsingRegex("helloworld@@"));
		System.out.println("Helloworld1-->" + isValidPasswordUsingRegex("Helloworld1"));
		System.out.println("helloworld@1-->" + isValidPasswordUsingRegex("helloworld@1"));
		System.out.println("Helloworld11-->" + isValidPasswordUsingRegex("Helloworld11"));
		System.out.println("helloworld1@@-->" + isValidPasswordUsingRegex("helloworld1@@"));
	}

	public static boolean isValidPasswordUsingRegex(String password) {
		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*(),.?\":{}|<>])(?!.*[!@#$%^&*(),.?\":{}|<>]{2,})([A-Za-z0-9!@#$%^&*(),.?\":{}|<>]{8,})$";
		return password.matches(regex);
	}

}
