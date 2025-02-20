package br.com.felipe.main;

import br.com.felipe.model.Notice;

import java.time.LocalDate;
import java.util.Scanner;

public class MainNotice {
    public static void main(String[] args) {
        try (Scanner reading = new Scanner(System.in)) {
            Notice newNotice = new Notice();
            LocalDate nowDate = LocalDate.now();

            String readingTitle = readInput(reading, "Enter new title notice:");
            newNotice.setNoticeTitle(readingTitle);

            String readingDescription = readInput(reading, "Enter new description notice:");
            newNotice.setNoticeDescription(readingDescription);

            displayNotice(newNotice, nowDate);
        }
    }

    private static String readInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        String input = scanner.nextLine().trim();
        while (input.isEmpty()) {
            System.out.println("Input cannot be empty. Please try again.");
            input = scanner.nextLine().trim();
        }
        return input;
    }

    private static void displayNotice(Notice notice, LocalDate date) {
        System.out.println("Title: " + notice.getNoticeTitle());
        System.out.println("Description: " + notice.getNoticeDescription());
        System.out.println("Date: " + date);
    }
}