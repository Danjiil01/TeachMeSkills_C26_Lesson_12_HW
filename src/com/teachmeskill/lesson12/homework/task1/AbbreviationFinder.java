package com.teachmeskill.lesson12.homework.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Output to the console from the line that the user enters from the keyboard everything
 * abbreviations. An abbreviation is a word of 2 to 6 characters, consisting
 * only capital letters, no numbers.
 */

public class AbbreviationFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String input = scanner.nextLine();

        // Enter regex for finding abbreviations
        String regex = "\\b[A-Z]{2,6}\\b";

        // Create Pattern
        Pattern pattern = Pattern.compile(regex);

        // Create Matcher
        Matcher matcher = pattern.matcher(input);

        System.out.println();

        if (matcher.find()) {
            System.out.println("Abbreviations in the text:");
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } else {
            System.out.println("There are no abbreviations in this text");
        }
    }
}
