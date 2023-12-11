package com.teachmeskill.lesson12.homework.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The program receives arbitrary text as input. This text may contain a number
 * document (one or more), email and phone number. Document number in format:
 * xxxx-xxxx-xx, where x is any number; phone number in the format: +(xx)xxxxxxx. Document
 * may not contain all the information, i.e. for example, may not contain a number
 * phone, or something else. You need to find this information and output it to the console in
 * format:
 * email: teachmesskills@gmail.com
 * document number: 1423-1512-51
 * etc
 */

public class TextAnalyzer {

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Vestibulum ac metus eu nisi vestibulum ornare. " +
                "Sed lacinia felis id purus vestibulum, et fermentum magna rhoncus." +
                "Email: danikpendo20128@gmail.com. Phone number: +(12)3456789. " +
                "Document number: 1234-5678-90. Email: teachmeskills@yahoo.ru. " +
                "Phone number: +(34)5678901. Document number: 0987-6543-21.";

        // Regular expression patterns for email, phone number, and document number
        Pattern emailPattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b");
        Pattern phonePattern = Pattern.compile("\\+\\([0-9]{2}\\)[0-9]{7}");
        Pattern documentPattern = Pattern.compile("[0-9]{4}-[0-9]{4}-[0-9]{2}");

        // Create matchers for each pattern
        Matcher emailMatcher = emailPattern.matcher(text);
        Matcher phoneMatcher = phonePattern.matcher(text);
        Matcher documentMatcher = documentPattern.matcher(text);

        // Find and print email addresses
        while (emailMatcher.find()) {
            String email = emailMatcher.group();
            System.out.println("Email: " + email);
        }

        // Find and print phone numbers
        while (phoneMatcher.find()) {
            String phone = phoneMatcher.group();
            System.out.println("Phone number: " + phone);
        }

        // Find and print document numbers
        while (documentMatcher.find()) {
            String document = documentMatcher.group();
            System.out.println("Document number: " + document);
        }
    }
}
