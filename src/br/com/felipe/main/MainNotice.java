package br.com.felipe.main;

import br.com.felipe.model.Notice;

public class MainNotice {
    public static void main(String[] args) {
        Notice newNotice = new Notice();
        newNotice.setNoticeTitle("");
        newNotice.setNoticeDescription("");

        String title = newNotice.getNoticeTitle();
        String description = newNotice.getNoticeDescription();
    }
}
