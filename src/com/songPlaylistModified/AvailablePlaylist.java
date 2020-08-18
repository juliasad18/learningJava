package com.songPlaylistModified;

import java.util.ArrayList;

public class AvailablePlaylist {
    private ArrayList<Album> albumsList;

    public AvailablePlaylist(ArrayList<Album> albumsList) {
        this.albumsList = albumsList;
    }

    public ArrayList<Album> getAlbumsList() {
        return albumsList;
    }

    public void showAvailableSongs(String albumName) {
        int index = getAlbumIndex(albumName);
        if(index != -1) {
            albumsList.get(index).showTheSongs();
        } else {
            System.out.println("Album with such name doesn't exist.");
        }
    }

    private int getAlbumIndex(String albumName) {
        int index = -1;
        for(int i = 0; i < albumsList.size(); i++) {
            String iteratedAlbumName = albumsList.get(i).getName();
            if(albumName.equals(iteratedAlbumName)) {
                index = i;
            }
        }
        return index;
    }

    public boolean isSongAvailable(String songName, ArrayList<Album> albumList) {
        boolean flag = false;
        for (Album album : albumList) {
            ArrayList<Song> songArrayList = album.showTheSongs(); //list with songs
            for (Song song : songArrayList) {
                String availableSongTitle = song.getTitle();
                if (songName.equals(availableSongTitle)) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }


}
