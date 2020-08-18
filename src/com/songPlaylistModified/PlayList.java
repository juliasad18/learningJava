package com.songPlaylistModified;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class PlayList extends AvailablePlaylist {
    private LinkedList<Song> playList;
    public static Scanner scanner = new Scanner(System.in);

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

    public void playSongs() {
        if(isPlayListEmpty()) {
            System.out.println("The PlayList is Empty.");
        } else {
            ListIterator listIterator = playList.listIterator();

            System.out.println("1 - switch next song");
            System.out.println("2 - switch previous song");
            System.out.println("3 - repeat song");
            System.out.println("4 - stop playing");

            boolean wasPreviouslyOnRepeat = false;
            boolean directionForward = true;
            boolean condition = true;

            while(condition) {
                int option = Integer.parseInt(scanner.nextLine());
                switch(option) {
                    case 1:
                        if(listIterator.hasNext()) {
                            if(directionForward) {
                                System.out.println("Now playing: " + listIterator.next());
                            } else {
                                if(wasPreviouslyOnRepeat) {
                                    System.out.println("Now playing: " + listIterator.next());
                                } else {
                                    listIterator.next();
                                    System.out.println("Now playing: " + listIterator.next());
                                }
                            }
                        } else {
                            System.out.println("Reach the end of the list");
                        }
                        wasPreviouslyOnRepeat = false;
                        directionForward = true;
                        break;
                    case 2:
                        if(listIterator.hasPrevious()) {
                            if(!directionForward) {
                                System.out.println("Now playing: " + listIterator.previous());
                            } else {
                                if(wasPreviouslyOnRepeat) {
                                    System.out.println("Now playing: " + listIterator.previous());
                                } else {
                                    listIterator.previous();
                                    System.out.println("Now playing: " + listIterator.previous());
                                }
                            }
                        } else {
                            System.out.println("Reach the beginning of the list");
                        }
                        wasPreviouslyOnRepeat = false;
                        directionForward = false;
                        break;
                    case 3:
                        if(directionForward) {
                            if(listIterator.hasPrevious()) {
                                System.out.println("Now replaying: " + listIterator.previous());
                                directionForward = false;
                            } else {
                                System.out.println("Reach the beginning of the list");
                            }
                        } else {
                            if(listIterator.hasNext()) {
                                System.out.println("Now replaying: " + listIterator.next());
                                directionForward = true;
                            } else {
                                System.out.println("Reach the end of the list");
                            }
                        }
                        wasPreviouslyOnRepeat = true;
                        break;
                    case 4:
                        System.out.println("Player stopped.");
                        condition = false;
                        break;
                }
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
            for(int s = 0; s < album.showTheSongs().size(); s++) {
                Song song = album.showTheSongs().get(s);
                String songTitle = song.getTitle();
                if(songName.equals(songTitle)) {
                    songToAdd = song;
                }
            }
        }
        return songToAdd;
    }






}
