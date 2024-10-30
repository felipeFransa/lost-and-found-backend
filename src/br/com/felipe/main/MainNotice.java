package br.com.felipe.main;

import br.com.felipe.model.Notice;

import java.time.LocalDate;
import java.util.Scanner;

public class MainNotice {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        Notice newNotice = new Notice();
        LocalDate nowDate = LocalDate.now();

        System.out.println("enter new title notice:");
        String readingTitle = reading.nextLine();
        newNotice.setNoticeTitle(readingTitle);

        System.out.println("enter new description notice:");
        String readingDescription = reading.nextLine();
        newNotice.setNoticeDescription(readingDescription);

        String title = newNotice.getNoticeTitle();
        String description = newNotice.getNoticeDescription();

        System.out.println(title);
        System.out.println(description);
        System.out.println(nowDate);
    }
}
