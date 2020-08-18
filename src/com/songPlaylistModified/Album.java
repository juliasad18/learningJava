package com.songPlaylistModified;

import java.util.ArrayList;

public class Album {
    private String name;
    private SongList songs;

    public Album(String name, ArrayList<Song> songs) {
        this.name = name;
        this.songs = new SongList(songs);
    }

    private class SongList {
        private ArrayList<Song> songsList;

        public SongList(ArrayList<Song> songsList) {
            this.songsList = songsList;
        }

        public void addSongToAlbum(Song song) {
            if(!doesSongExistInAlbum(song.getTitle())) {
                songsList.add(song);
                System.out.println("Song " + song + " added to the album " + name + ".");
            } else {
                System.out.println("The song already exists.");
            }

        }

        private boolean doesSongExistInAlbum(String string) {
            boolean result = false;
            for(int i = 0; i < songsList.size(); i++) {
                Song song = songsList.get(i);
                if(song.getTitle().contains(string)) {
                    System.out.println("Searched song is " + song);
                    result = true;
                } else {
                    System.out.println("No results found.");
                    result = false;
                }
            }
            return result;
        }
    }

    public String getName() {
        return name;
    }

    public SongList getSongs() {
        return songs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSongToAlbum(String title, String duration) {
        this.songs.addSongToAlbum(new Song(title, duration));
    }

    public ArrayList<Song> showTheSongs() {
        System.out.println("Album " + name + " songs:");
        for (Song song : songs.songsList) {
            System.out.println(song.toString());
        }
        return songs.songsList;
    }


}
