package com.songPlaylistModified;

public class Song {
    private String title;
    private String duration;

    public Song(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    public Song() {
    }

    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return title + " (" + duration + ")";
    }
}
