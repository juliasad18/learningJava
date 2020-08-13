package com.songPlaylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class PlayList extends AvailablePlaylist {
    private LinkedList<Song> playList;
    //private ListIterator listIterator = playList.listIterator();

    public PlayList(ArrayList<Album> albumsList) {
        super(albumsList);
    }

    public void addTheSong(String songName) {
        if(isSongAvailable(songName, super.getAlbumsList())) {
            Song songToAdd = getSongByName(songName);
            if (isPlayListEmpty()) {
                playList = new LinkedList<>();
            }
            playList.add(songToAdd);
        } else {
            System.out.println("The song can't be added to the PlayList before it had not been added to any Album.");
        }
    }

    public void showTheQueue() {
        if(isPlayListEmpty()) {
            System.out.println("The PlayList is Empty.");
        } else {
            for(Song song :  playList) {
                System.out.println(song.toString());
            }
        }

    }

    private boolean isPlayListEmpty() {
        if (playList == null) {
            return true;
        } else {
            return false;
        }
    }

    private Song getSongByName(String songName) {
        Song songToAdd = new Song();
        int albumsCount = super.getAlbumsList().size();
        for(int i = 0; i < albumsCount; i++) {
            Album album = super.getAlbumsList().get(i);
            for(int s = 0; s < album.getSongsList().size(); s++) {
                Song song = album.getSongsList().get(s);
                String songTitle = song.getTitle();
                if(songName.equals(songTitle)) {
                    songToAdd = song;
                }
            }
        }
        return songToAdd;
    }






}
