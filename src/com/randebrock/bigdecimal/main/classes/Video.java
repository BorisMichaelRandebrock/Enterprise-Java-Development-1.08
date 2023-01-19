package com.randebrock.bigdecimal.main.classes;

abstract class Video {
    private String title;
    private int length;
    private int year;

    public Video(String title, int length, int year) {
        this.title = title;
        this.length = length;
        this.year = year;
    }
    public void play() {
        System.out.println("Playing");
    }

    public void pause() {
        System.out.println("Pausing");
    }
}
