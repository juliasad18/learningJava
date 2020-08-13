package com.songPlaylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Album stromaeAlbum = createStromaeAlbumManually();
        Album mexAlbum = createMixAlbumManually();
        ArrayList<Album> listOfAlbums = new ArrayList<>();
        listOfAlbums.add(stromaeAlbum);
        listOfAlbums.add(mexAlbum);

        //AvailablePlaylist availablePlaylists = new AvailablePlaylist(listOfAlbums);
        PlayList currentPlaylist = new PlayList(listOfAlbums);

        boolean condition = true;
        while(condition) {
            System.out.println("====================================");
            System.out.println("Choose an option:");
            System.out.println("1 - show available songs;");
            System.out.println("2 - add a song to the PlayList;");
            System.out.println("3 - show the queue of the PlayList;");
            System.out.println("4 - go to the next song;");
            System.out.println("5 - go to the previous song;");
            System.out.println("====================================");

           int option = Integer.parseInt(scanner.nextLine());
           switch(option) {
               case 1:
                   System.out.println("Choose the Album...");
                   String album = scanner.nextLine();
                   currentPlaylist.showAvailableSongs(album);
                   break;
               case 2:
                   System.out.println("Choose the song to add in the PlayList...");
                   String song = scanner.nextLine();
                   currentPlaylist.addTheSong(song);
                   break;
               case 3:
                   System.out.println("Showing current queue...");
                   currentPlaylist.showTheQueue();
                   break;
           }
        }

    }

    public static Album createStromaeAlbumManually() {
        Song song1 = new Song("Stromae - Formidable", "3:30");
        Song song2 = new Song("Stromae - carmen", "3:09");
        Song song7 = new Song("Stromae - Papautai", "4:10");
        Song song8 = new Song("Stromae - Ta fete", "2:50");
        Song song9 = new Song("Stromae - tous les memes", "3:15");

        ArrayList<Song> listOfSongs1 = new ArrayList<>();
        listOfSongs1.add(song1);
        listOfSongs1.add(song2);
        listOfSongs1.add(song7);
        listOfSongs1.add(song8);
        listOfSongs1.add(song9);
        return new Album("Stromae", listOfSongs1);
    }

    public static Album createMixAlbumManually() {
        Song song3 = new Song("Indila - Tourner Dans Le Vide", "4:06");
        Song song4 = new Song("L.E.J - Acrobates", "3:40");
        Song song5 = new Song("Indila - Love Story", "2:09");
        Song song6 = new Song("Zaz - Je veux", "4:30");
        Song song10 = new Song("Indila - Ego", "2:45");

        ArrayList<Song> listOfSongs2 = new ArrayList<>();
        listOfSongs2.add(song3);
        listOfSongs2.add(song4);
        listOfSongs2.add(song5);
        listOfSongs2.add(song6);
        listOfSongs2.add(song10);
        return new Album("Mix", listOfSongs2);
    }


}
