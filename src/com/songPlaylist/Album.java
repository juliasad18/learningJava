package com.songPlaylist;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> songsList;

    public Album(String name, ArrayList<Song> songsList) {
        this.songsList = songsList;
        this.name = name;
    }

    public ArrayList<Song> getSongsList() {
        return songsList;
    }

    public String getName() {
        return name;
    }

    public void setSongsList(ArrayList<Song> songsList) {
        this.songsList = songsList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showTheSongs() {
        System.out.println("Album " + name + " songs:");
        for (Song song : songsList) {
            System.out.println(song.toString());
            //String songTitle = songsList.get(i).getTitle();
            //String songDuration = songsList.get(i).getDuration();
            //System.out.println(songTitle + " (" + songDuration + ")");
        }
    }


}
